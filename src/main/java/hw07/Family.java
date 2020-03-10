package hw07;

import java.util.Arrays;
import java.util.Set;

public class Family {
    private Human father;
    private Human mother;
    private Human[] children;
    private Pet pet;

    Human getFather() {
        return father;
    }

    Human getMother() {
        return mother;
    }

    public Human[] getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }

    Family(Human father, Human mother, Pet pet){
        this.father=father;
        this.mother=mother;
        this.mother.setFamily(this);
        this.father.setFamily(this);
        this.pet=pet;
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
        return String.format("Human{Father name='%s', Father surname='%s', year='%d', Mother name='%s', Mother surname='%s', year='%d', Children='%s', Pet=[%s]}",
                father.getName(),father.getSurname(),father.getYear(),
                mother.getName(),mother.getSurname(),mother.getYear(),
                Arrays.toString(children),pet);
    }
}
