package Class.musicPalyer01;

public class MusicPlayMain02 {
    public static void main(String[] args) {
        MusicPalyerData data = new MusicPalyerData();
        
        data.isOn = true;
        
        data.volume++;
        System.out.println("음악 플레이어 볼륨: "+data.volume);

        data.volume++;
        System.out.println("음악 플레이어 볼륨: "+data.volume);

        data.volume++;
        System.out.println("음악 플레이어 볼륨: "+data.volume);

        data.volume--;
        System.out.println("음악 플레이어 볼륨: "+data.volume);

        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 온" + data.volume);
        } else {
            System.out.println("음악 플레이어 오프");
        }
        
        data.isOn = false;
        System.out.println("음악 플레이어 오프");
    }
}
