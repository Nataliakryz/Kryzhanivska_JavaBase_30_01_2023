package HomeWorks.HomeWork15;

public class Main {

//    Зробіть клас MusicStyles, який міститиме метод playMusic()
//    Зробіть його спадкоємців: PopMusic, RockMusic і ClassicMusic.
//    Спадкоємці повинні реалізовувати метод playMusic().
//    У мейн-класі створіть музичні гурти для кожного стилю
//    За допомогою методу for each викличте у всіх спадкоємців MusicStyles метод playMusic()

    public static void main(String[] args) {

        MusicStyles[] musicStyles = {
                new ClassicMusic(),
                new PopMusic(),
                new RockMusic()
        };

        for (MusicStyles musicStyles1 : musicStyles) {
            musicStyles1.playMusic();
        }
    }
}
