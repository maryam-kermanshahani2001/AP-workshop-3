import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicCollection {
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;
    //private ArrayList<Music> favourites;


    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection() {
        files = new ArrayList<Music>();
        //favourites = new ArrayList<Music>();

    }


    public MusicPlayer getPlayer() {
        return player;
    }

    public void setPlayer(MusicPlayer player) {
        this.player = player;
    }

    /**
     * Add a file to the collection.
     *
     * @param filename The file to be added.
     */
    public void addFile(Music filename) {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     *
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles() {
        return files.size();

    }

    /**
     * List a file from the collection.
     *
     * @param index The index of the file to be listed.
     */
    public void listFile(int index) {
        Music file = files.get(index);
        file.printMusic();
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles() {
        for (Music fileIterator : files) {
            fileIterator.printMusic();
        }
    }

    /**
     * Remove a file from the collection.
     *
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        files.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     *
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index) {
        Music music = files.get(index);
        player.startPlaying(music);

    }

    /**
     * Stop the player.
     */
    public void stopPlaying() {
        player.stop();

    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     *
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) {
        // The return value.
        // Set according to whether the index is valid or not.
        if (files.size() - 1 >= index)
            return true;
        return false;
    }

    public void addToFavourite(Music music) {
        files.add(music);
        music.setFavourite(true);
    }

    public void removeFavourite(Music music) {
        files.remove(music);
        music.setFavourite(false);
    }
   /* public void printFavourites() {
        for (Music favourite:favourites) {
            favourite.printMusic();

        }
    }*/
    public void search(String name) {
        for (Music musicIter:files) {
            if (musicIter.getName() == name){
                System.out.println("found!");
                return;
            }

        }
        System.out.println("not found in this category");
    }


}