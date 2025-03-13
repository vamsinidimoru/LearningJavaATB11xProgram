public class Gradecalculator {
    public static void main(String[] args) {
        String num =args[0];
        System.out.println(num);
        int grade=Integer.parseInt(num);
        String Result = (grade>89)&&(grade<101)?"A":(grade>79)&&(grade<=90)?"B":(grade>69)&&(grade<80)?"C":(grade>59)&&(grade<=70)?"D":"F";
        System.out.println(Result);
    }
}
