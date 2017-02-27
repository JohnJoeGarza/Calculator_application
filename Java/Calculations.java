package chewy;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * This class is used to perform calculations given from the calculator input.
 * 
 * @author John J. Garza
 *
 */
public class Calculations {
	/**
	 * Method that calculates a given arithmetic expression.
	 * 
	 * @param calLine
	 *            - The arithmetic expression to be evaluated.
	 * @return The result of the expression after evaluation.
	 */
	public static String calculateLine(String calLine) {

		calLine = calLine.replaceAll("\\s+", "");
		Stack<String> calcStack = new Stack<String>();
		Stack<String> operatorStack = new Stack<String>();
		StringTokenizer tokens = new StringTokenizer(calLine, "()[\u00d7][\u00f7]/+-", true);

		while (tokens.hasMoreTokens()) {
			String currentToken = tokens.nextToken();
			if (currentToken.equals("("))
				operatorStack.push(currentToken);
			if (currentToken.matches("[0-9]+")) {
				calcStack.push(currentToken);
			} else if (currentToken.equals(")")) {
				String currentLine = "";
				while (true) {
					currentLine += calcStack.pop();
					if (operatorStack.peek().equals("("))
						break;
					currentLine += operatorStack.pop();
				}
				operatorStack.pop();
				calcStack.push(calculateLine(currentLine));
			} else if (currentToken.equals("\u00d7") || currentToken.equals("\u00f7") || currentToken.equals("+")
					|| currentToken.equals("-")) {
				while (!operatorStack.isEmpty() && precedence(currentToken, operatorStack.peek())) {
					calcStack.push(arithmatic(Integer.parseInt(calcStack.pop()), Integer.parseInt(calcStack.pop()),
							operatorStack.pop()));
				}
				operatorStack.push(currentToken);
			}
		}

		while (!operatorStack.isEmpty())
			calcStack.push(arithmatic(Integer.parseInt(calcStack.pop()), Integer.parseInt(calcStack.pop()),
					operatorStack.pop()));

		return calcStack.pop();
	}

	public static boolean precedence(String oper1, String oper2) {
		if (oper2.equals("(") || oper2.equals(")"))
			return false;
		if ((oper1 == "*" || oper1 == "/") && oper2 == "+" || oper2 == "-")
			return false;
		else
			return true;

	}

	public static String arithmatic(int oper1, int oper2, String operand) {
		int result = 0;
		if (operand.equals("\u00d7"))
			result = oper1 * oper2;
		else if (operand.equals("\u00f7")) {
				if (oper2 == 0) {
					return "Error";
			}
			result = oper1 / oper2;
		} else if (operand.equals("+"))
			result = oper1 + oper2;
		else if (operand.equals("-"))
			result = oper1 - oper2;

		return String.valueOf(result);
	}

}
