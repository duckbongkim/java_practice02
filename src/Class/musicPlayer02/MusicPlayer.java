package Class.musicPlayer02;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("음악 시작");
    }

    void off(){
        isOn = false;
        System.out.println("음악 종료");
    }

    void volumeUp(){
        volume++;
        System.out.println("볼륨업"+volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("볼륨 다운"+volume);
    }

    void showStatus(){
        System.out.println("상태확인");
        if(isOn) {
            System.out.println("플레이어 on. 볼륨:" +volume);
        }else {
            System.out.println("플레이어 off");
        }
    }
}
