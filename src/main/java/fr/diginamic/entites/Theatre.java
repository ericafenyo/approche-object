package fr.diginamic.entites;

public class Theatre {
    private String name;
    private int capacity;
    private int totalSubscription;
    private double revenue;

    public void subscribe(int clientCount, double price) {
        System.out.printf("Total capacity: %d,subscribed: %d, number clients to add: %d%n", capacity, totalSubscription, clientCount);
        if (clientCount > 0) {
            if ((totalSubscription + clientCount) < capacity) {
                totalSubscription += clientCount;
                revenue += price;
            } else {
                System.out.printf("ERROR: theater capacity left: %d%n", (capacity - totalSubscription));
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getRevenue() {
        return revenue;
    }
}
