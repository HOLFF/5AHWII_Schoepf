package observer;

class Secretary implements Observer {

    @Override
    public void notifying(int value) {
        System.out.println("Secretary notified "+value);
    }
}