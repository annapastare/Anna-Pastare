
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char operatorMath = '%';
		double num1 = 88.5;
		double num2 = 100.5;
		double result;
		if(operatorMath == '+'){
			result = num1 + num2;
			System.out.println(result);
		}else if(operatorMath == '/'){
			result = num1 / num2;
			System.out.println(result);
		}else if (operatorMath == '*'){
			result = num1 * num2;
			System.out.println(result);
		}else if (operatorMath == '-'){
			result = num1 - num2;
			System.out.println(result);
		}else if (operatorMath == '%'){
			result = num1 % num2;
			System.out.println(result);
		}else{
			System.out.println("Wrong data");
			
		}
		System.out.println("----------------------------------------");
		switch(operatorMath){
		case '+':
			result = num1 + num2; 
		System.out.println(result);
		break;
		case '/':
			result = num1 / num2;
			System.out.println(result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(result);
			break;
		case '%':
			if(num1 >= num2){
			result = num1 % num2;
			System.out.println(result);
			}else{
				System.out.println("If num1 less than num2 then result is num1: " + num1);
				
			}
			break;
		default:
			System.out.println("Nu such operator");
		
		}

	}

}
