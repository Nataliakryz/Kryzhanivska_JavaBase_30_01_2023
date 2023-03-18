package HomeWorks.homeWork16;

public class Main {
//    Зробіть інтерфейс Smartphones, який має містити методи call(), sms(), internet()
//    Зробіть класи, які його імплементують: Androids, iPhones.
//    Андроїди повинні також імплементувати LinuxOS, айфони повинні імплементувати iOS
//    Створіть екземпляри кожного виду у мейн-класі

    public static void main(String[] args) {

        Smartphones[] smartphones = {
                new Androids("Samsung"),
                new IPhones("IPhones XR")
        };

        LinuxOS[] linuxOS = {
                new Androids("Samsung 23.3.1"),
        };

        IOS[] ios = {
                new IPhones("IPhones XR 22.2.2")
        };

        for (LinuxOS linuxOS1 : linuxOS) {
            for (IOS iOS1 : ios) {
                for (Smartphones smartphones1 : smartphones) {
                    smartphones1.sms();
                    smartphones1.call();
                    smartphones1.internet();
                    }
                iOS1.getVersion();
                }
            linuxOS1.getVersionSystem();
        }
    }
}
