package kadai_015;

public class Car_Chapter15 {

    // フィールド（車の状態）
    private int gear = 1;   // ギア（初期値：1）
    private int speed = 10; // 速度（初期値：10km）

    // ギアチェンジするメソッド
    public void changeGear(int afterGear) {
    	
    	//変更前のギアを保存
    	int beforeGear = gear;

        // ギアを変更
    	gear = afterGear;

        // ギアに応じて速度を変更
        switch (gear) {
            case 1:
                speed = 10;
                break;
            case 2:
                speed = 20;
                break;
            case 3:
                speed = 30;
                break;
            case 4:
                speed = 40;
                break;
            case 5:
                speed = 50;
                break;
            default:
                speed = 10; // 上記以外のギア
        }
        
        //ギア変更メッセージを表示
        System.out.println("ギア" + beforeGear + "から" + gear + "に切り替えました");
    }

    // 走行するメソッド
    public void run() {
        System.out.println("速度は時速" + speed + "kmです");
    }
}

