import tasks.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(FirstTask.checkContainedInArray(new char[]{'c', 'v', 'g', 'g', 'c'}));
        System.out.println(SecondTask.buildToString("Test", "O", 3));
        System.out.println(ThirdTask.characterCounter("Анаконда", 'а'));
        System.out.println(FourthTask.reverse("Cat"));
        System.out.println(FourthTask.reverseWithStringBuilder("Yammy"));
        System.out.println(FifthTask.getFactorial(4));
        System.out.println(FifthTask.getFactorialWithRecursive(4));
        System.out.println(FifthTask.getFactorialWithRecursive(4));
        System.out.println(SixthTask.getSumOfNumber(823));
        SeventhTask.fizzBuzzOutput(2, 17);
        System.out.println(EighthTask.minInt(new int[]{2,4,1,5,6,0,8,9}));
        System.out.println(NinthTask.isPalindrome("Шалаш"));
    }
}