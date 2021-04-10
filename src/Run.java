public class Run {
    public static void main(String[] args) {
        /*usicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();
*/
        //MusicPlayer musicPlayer1= new MusicPlayer();
        MusicCollection pop = new MusicCollection();

        //MusicPlayer musicPlayer2= new MusicPlayer();
        MusicCollection jazz = new MusicCollection();

       // MusicPlayer musicPlayer3= new MusicPlayer();
        MusicCollection rock = new MusicCollection();

       // MusicPlayer musicPlayer4= new MusicPlayer();
        MusicCollection country = new MusicCollection();

        MusicCollection favourites = new MusicCollection();

        Music music1 = new Music("chera rafti", "D:\\Music", "shajariyan", "1388");
        Music music2 = new Music("All too well", "D:\\Music", "Taylor", "2015");
        Music music3 = new Music("back to december", "D:\\Music", "Taylor", "2019");
        Music music4 = new Music("let me down slowly", "D:\\Music", "khodam:)", "2019");
        Music music5 = new Music("cheshm man", "D:\\Music", "dariush:)", "2019");

        pop.addFile(music1);
        System.out.println("pop: ");
        pop.listAllFiles();

        jazz.addFile(music4);
        System.out.println("jazz: ");
        jazz.listAllFiles();

        rock.addFile(music3);
        System.out.println("rock: ");
        rock.listAllFiles();

        country.addFile(music2);
        System.out.println("country: ");
        country.listAllFiles();

        pop.addFile(music5);
        System.out.println( "pops ");
        pop.listAllFiles();


        favourites.addToFavourite(music1);
        favourites.addToFavourite(music2);
        favourites.addToFavourite(music3);
        favourites.removeFavourite(music1);
        System.out.println("");
        System.out.println("favourites : ");
        favourites.listAllFiles();

        pop.search("cheshm man");



/*

        pop.addFile("it's you");
        pop.addFile("hello");
        pop.listAllFiles();
        System.out.println("*********************");
        pop.removeFile(0);

        pop.addFile("keep me watching");
        pop.listAllFiles();
*/



    }
}

