package com.musicplaylist;

import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlaylistSystem {
    private LinkedList<String> playlist;

    public MusicPlaylistSystem() {
        playlist = new LinkedList<>();
    }

    // Method to add a song to the playlist
    public void addSong(String song) {
        playlist.add(song);
        System.out.println("Song added: " + song);
    }

    // Method to remove a song by name
    public void removeSong(String song) {
        if (playlist.remove(song)) {
            System.out.println("Song removed: " + song);
        } else {
            System.out.println("Song not found in the playlist.");
        }
    }

    // Method to move a song to a different position
    public void moveSong(String song, int newPosition) {
        if (playlist.remove(song)) {
            playlist.add(newPosition, song);
            System.out.println("Song moved to position " + (newPosition + 1) + ": " + song);
        } else {
            System.out.println("Song not found in the playlist.");
        }
    }

    // Method to display the playlist
    public void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty.");
        } else {
            System.out.println("Playlist:");
            int position = 1;
            for (String song : playlist) {
                System.out.println(position + ". " + song);
                position++;
            }
        }
    }

    // Main method to run the Music Playlist System
    public static void main(String[] args) {
        MusicPlaylistSystem system = new MusicPlaylistSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Move Song");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song name: ");
                    String songToAdd = scanner.nextLine();
                    system.addSong(songToAdd);
                    break;
                case 2:
                    System.out.print("Enter song name to remove: ");
                    String songToRemove = scanner.nextLine();
                    system.removeSong(songToRemove);
                    break;
                case 3:
                    System.out.print("Enter song name to move: ");
                    String songToMove = scanner.nextLine();
                    System.out.print("Enter new position (1-based index): ");
                    int newPosition = scanner.nextInt() - 1;
                    system.moveSong(songToMove, newPosition);
                    break;
                case 4:
                    system.displayPlaylist();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
