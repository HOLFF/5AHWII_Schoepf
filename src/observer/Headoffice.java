package observer;

class Headoffice implements Observer {

    @Override
    public void notifying(int value) {
        if(value>=30){
            System.out.println("Headoffice notified: "+value);
        }
    }
}