import java.util.Scanner;

public class PsychologySurvey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("نام و نام خانوادگی: ");
        String fullName = scanner.nextLine();
        
        System.out.print("سن: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("نام پزشک: ");
        String doctorName = scanner.nextLine();

        System.out.print("تاریخ مراجعه (مثال: 1403/01/01): ");
        String visitDate = scanner.nextLine();

        int totalScore = 0;

        String[] questions = {
            "آیا احساس خوشحالی می‌کنید؟ (بله/خیر)",
            "آیا خواب کافی دارید؟ (بله/خیر)",
            "آیا به خودتان اعتماد دارید؟ (بله/خیر)",
            "آیا از خود راضی هستید؟ (بله/خیر)",
            "آیا از فعالیت‌های روزمره خود راضی هستید؟ (بله/خیر)"
        };

        int[] scores = {20, 20, 20, 0, 20};

        for (int i = 0; i < questions.length; i++) {
            System.out.print(questions[i] + " ");
            String answer = scanner.nextLine().toLowerCase();

            if (answer.equals("بله")) {
                totalScore += scores[i];
            } else if (answer.equals("خیر")) {
            } else {
                System.out.println("پاسخ نامعتبر است. لطفا فقط (بله/خیر) وارد کنید.");
                i--;
            }
        }

        System.out.println("\n--------------------------------------------------");
        System.out.println("نتیجه بررسی روانشناسی");
        System.out.println("--------------------------------------------------");
        System.out.println("نام و نام خانوادگی: " + fullName);
        System.out.println("سن: " + age);
        System.out.println("نام پزشک: " + doctorName);
        System.out.println("تاریخ مراجعه: " + visitDate);
        System.out.println("نمره نهایی: " + totalScore);

        if (totalScore >= 80) {
            System.out.println("توصیه: وضعیت روانی خوبی دارید.");
        } else if (totalScore >= 40) {
            System.out.println("توصیه: ممکن است به مشاوره نیاز داشته باشید.");
        } else {
            System.out.println("توصیه: بهتر است با متخصص مشورت کنید.");
        }

        System.out.println("--------------------------------------------------");

        scanner.close();
    }
}
