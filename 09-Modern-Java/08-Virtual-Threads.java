class VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.startVirtualThread(() ->
                System.out.println("Running on a virtual thread")
        );

        thread.join();
    }
}
