import java.security.PublicKey;

public class Music {

    private String name;
    private String musicAddress;
    private String nameOfArtist;
    private String releaseDate;
    private boolean isFavourite;

    public Music(String name, String musicAddress, String nameOfArtist, String releaseDate) {
        setName(name);
        setMusicAddress(musicAddress);
        setNameOfArtist(nameOfArtist);
        setReleaseDate(releaseDate);
        isFavourite = false;

    }

    public boolean isFavourite() {
        return isFavourite;
    }


    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfArtist() {
        return nameOfArtist;
    }

    public void setNameOfArtist(String nameOfArtist) {
        this.nameOfArtist = nameOfArtist;
    }

    public String getMusicAddress() {
        return musicAddress;
    }

    public void setMusicAddress(String musicAddress) {
        this.musicAddress = musicAddress;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void printMusic() {
        System.out.print(name + " " + nameOfArtist + " " + musicAddress + " " + releaseDate);
        if (isFavourite())
            System.out.print(" *");
        System.out.println("");
    }
}
