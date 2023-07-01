public class accountingIFApp {
    public static void main(String[] args) {
        double valueOfSupply = 20000.0;
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply*vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply*expenseRate;
        double income = valueOfSupply - expense;

        double dividend1;
        double dividend2;
        double dividend3;

        if (income > 10000.0) {         // income이 10000원을 넘는 경우에는 5 : 3 : 2로 나누고
            dividend1 = income * 0.5;
            dividend2 = income * 0.3;
            dividend3 = income * 0.2;
        } else {                        // income이 10000원을 넘지 않는 경우에는 dividend1이 모든 income을 가지도록 함
            dividend1 = income;
            dividend2 = income * 0;
            dividend3 = income * 0;
        }

        System.out.println("Value of supply : "+ valueOfSupply);
        System.out.println("VAT : "+ vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : "+ income);
        System.out.println("Dividend 1 : " + dividend1);
        System.out.println("Dividend 2 : " + dividend2);
        System.out.println("Dividend 3 : " + dividend3);
    }
}
