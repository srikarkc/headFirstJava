import java.util.*;

public class Jukebox2 {
	public static void main(String[] args) {
		new Jukebox2().go();
	}
	
	public void go() {
		List<SongV2> songList = MockSongs.getSongsV2();
		System.out.println(songList);
		
		Collections.sort(songList);
		System.out.println(songList);
	}
}

class SongV2 {
	private String title;
	private String artist;
	private int bpm;
	
	SongV2 (String title, String artist, int bpm) {
		this.title = title;
		this.artist = artist;
		this.bpm = bpm;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getBpm() {
		return bpm;
	}
	
	public String toString() {
		return title;
	}
}

class MockSongs {
	public static List<SongV2> getSongsV2() {
		List<SongV2> songs = new ArrayList<>();
		songs.add(new SongV2("sommersault", "zero 7", 148));
		songs.add(new SongV2("cassidy", "grateful dead", 158));
		songs.add(new SongV2("$10", "hitchhiker", 140));
		songs.add(new SongV2("havana", "cabello", 105));
		songs.add(new SongV2("Cassidy", "gateful dead", 158));
		songs.add(new SongV2("50 Ways", "simon", 102));
		return songs;
	}
}