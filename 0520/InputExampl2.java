public class InputExampl2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("三角形の面積を計算します");
        System.out.println("底辺の長さを入力してください");

        // 実際に入力を受け付ける
        double base = in.nextDouble();

        System.out.println("高さを入力してください");
        double height = in.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("三角形の面積は: " + area);
        // 部品を使い終わったら閉じる
        in.close();
    }
}