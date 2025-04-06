public class Car_Chapter15 {
    // フィールド（変数）
    private int gear = 1;    // 初期ギアは1
    private int speed = 10;  // 初期スピードは10km

    // ギアチェンジメソッド
    public void gearChange(int afterGear) {
        gear = afterGear;

        // ギアの値に応じてスピードを変更
        switch (gear) {
            case 1 -> speed = 10;
            case 2 -> speed = 20;
            case 3 -> speed = 30;
            case 4 -> speed = 40;
            case 5 -> speed = 50;
            default -> speed = 10; // それ以外は初期スピード
        }
    }

    // スピードを表示するメソッド
    public void run() {
        System.out.println("現在のスピードは " + speed + "km です。");
    }
}
