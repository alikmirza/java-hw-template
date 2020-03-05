package hw06;

import java.io.PrintStream;
import java.util.Arrays;

public class Family {

    static {
        System.out.println("Family class is downloading...");
    }

    {
        System.out.println("The Object of Family is creating...");
    }

    private Human father;
    private Human mother;
    private Human[] children;

    Family(){ }

    Family(Human father, Human mother){
        this.father=father;
        this.mother=mother;
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    void addChild(Human newChild){
        newChild.setFamily(this);
        if (children != null) {
            Human[] tempChildren = new Human[children.length+1];
            for (int i = 0;i<children.length;i++) {
                tempChildren[i] = children[i];
            }
            tempChildren[tempChildren.length-1] = newChild;
            children = tempChildren;
        } else {
            children = new Human[]{newChild};
        }
    }

    //delete with index
//    public boolean deleteChild(int index){
//        if (children == null || index>children.length-1) return false;
//        Human[] tempChildren = new Human[children.length-1];
//        for (int i = 0, j = 0; i<children.length;i++) {
//            if ( i != index)
//                tempChildren[j++] = children[i];
//        }
//        children = tempChildren;
//        return true;
//    }

    boolean deleteChild(Human child){
        if (children == null || child == null) return false;
        int childIndex = -1;
        for (int i = 0; i<children.length;i++) {
            if (children[i].equals(child)) {
                childIndex = i;
                break;
            }
        }
        if (childIndex == -1) {
            return  false;
        } else {
            Human[] tempChildren = new Human[children.length-1];
            for (int i = 0, j = 0; i<children.length;i++) {
                if ( i != childIndex)
                    tempChildren[j++] = children[i];
            }
            children = tempChildren;
            return true;
        }
    }


    int countFamily(){
        if (children==null){
            System.out.print("The number of family members: "); return 2;
        }
        System.out.print("The number of family members: ");
        return children.length+2;
    }


    @Override
    public String toString(){
        return String.format("Human{Father name='%s', Father surname='%s', year='%d', Mother name='%s', Mother surname='%s', year='%d', Children='%s'}",
                father.getName(),father.getSurname(),father.getYear(),
                mother.getName(),mother.getSurname(),mother.getYear(),
                Arrays.toString(children));
    }

    @Override
    protected void finalize(){
        System.out.println("Finalize method of Family class");
    }



}
