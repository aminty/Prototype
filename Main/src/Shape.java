abstract class Shape implements Cloneable {

    public String  id;

    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String  id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone=super.clone();
        }catch (CloneNotSupportedException ce){
            ce.printStackTrace();
        }
        return clone;
    }
}
