//public class CalculatorConodrum {

    public class IllegalArgumentException extends Exception {
        private IllegalArgumentException(String message){
            System.out.println(message);
        }
    }
    public class IllegalOperationException extends Exception{
        private IllegalOperationException(String message){
            System.out.println(message);
        }
    }
    
    private CalculatorConodrum(){
    }

    public String calculate(int operand1, int operand2, String operator){
        //if operator is null trows IllegalArgumentException and "Operation cannot be null" *Done
        //if operator is "" trows IllegalArgumentException and "Operation cannot be empty" *Done
        //if operator is something that's not '+', '*' or '/' trows IllegalOperationException and "Operation '{operator}' does not exist" *Done


        
            if(operator == null){
                throw new IllegalArgumentException("Operation cannot be null");
            }
            if(operator == ""){
                throw new IllegalArgumentException("Operation cannot be empty");
            }
            if( !(operator.equals("+") || operator.equals("*") || operator.equals("/")) ){
                throw new IllegalOperationException("Operation '{operator}' does not exist");
            }
    }
}