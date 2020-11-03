package observer;

class Teacher implements Observer{
    private String name;

    Teacher(String name){
        this.name=name;
    }

    @Override
    public void notifying(int value) {
        if(value>=25) {
            System.out.println("Teacher "+name+" notified "+value);
        }
    }
}