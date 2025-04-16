package Class.musicPalyer01;

public class MusicPlayMain03 {
    public static void main(String[] args) {
        MusicPalyerData data = new MusicPalyerData();
        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);

    }
    
    static void on(MusicPalyerData data){
        data.isOn = true;
        System.out.println("음악 시작");
    }
    
    static void off(MusicPalyerData data){
        data.isOn = false;
        System.out.println("음악 종료");
    }
    
    static void volumeUp(MusicPalyerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨: "+data.volume);
    }
    
    static void volumeDown(MusicPalyerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼룸: "+data.volume);
    }
    static void showStatus(MusicPalyerData data){
        System.out.println("상태 확인");
        if(data.isOn){
            System.out.println("온, 볼륨"+data.volume);
        }else {
            System.out.println("오프");
        }
    }
    
}
