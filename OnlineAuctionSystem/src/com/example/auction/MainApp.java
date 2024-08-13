package com.example.auction;

public class MainApp {
    public static void main(String[] args) {
        // Create an auction
        Auction auction = new Auction("Antique Vase");

        // Create bidders
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");
        Bidder bidder3 = new Bidder("Charlie");

        // Register bidders to the auction
        auction.registerObserver(bidder1);
        auction.registerObserver(bidder2);
        auction.registerObserver(bidder3);

        // Notify bidders about item availability
        auction.itemAvailable();

        // Start bidding
        auction.startBidding();

        // Unregister one bidder
        auction.removeObserver(bidder2);

        // End bidding
        auction.endBidding();
    }
}
