public class InnerObject {
    public int id;
    public String name;
    SomeData someData;
    ArrayData arrayData;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SomeData getSomeData() {
        return someData;
    }

    public void setSomeData(SomeData someData) {
        this.someData = someData;
    }

    public ArrayData getArrayData() {
        return arrayData;
    }

    public void setArrayData(ArrayData arrayData) {
        this.arrayData = arrayData;
    }

    @Override
    public String toString() {
        return "inner object[ " +"id: " + id + ", name: "+ name + ", " + someData.toString() +", "+ arrayData.toString() ;
    }
}
