public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double value){
        this.firstNumber = value;
    }

    public void setSecondNumber(double value){
        this.secondNumber = value;
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult(){
        if (secondNumber != 0){
            return firstNumber / secondNumber;
        }else{
            return 0.0;
        }
    }

        public static void main(String[] args) {
         SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

         
        System.out.println("Addition: " + calculator.getAdditionResult());
        System.out.println("Subtraction: " + calculator.getSubtractionResult());

         
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("Multiplication: " + calculator.getMultiplicationResult());
        System.out.println("Division: " + calculator.getDivisionResult());
    }
}
