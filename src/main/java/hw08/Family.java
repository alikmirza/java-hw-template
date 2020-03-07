package hw08;

import java.util.*;

public class Family {
    private Human father;
    private Human mother;
    private ArrayList<Human> children;


    Family(Human father, Human mother){
        this.father=father;
        this.mother=mother;
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    void addChild(Human newChild){
        newChild.setFamily(this);
        if (children != null) {
            ArrayList<Human> tempChildren = new ArrayList<>(children.size()+1);
            for (Human child : children) {
                tempChildren.addAll(Collections.singleton(child));
            }
            tempChildren.add(tempChildren.size()-1,newChild);
            children=tempChildren;
        } else {
            children= new ArrayList<>(Collections.singleton(newChild));
        }
    }

    boolean deleteChild(Human child){
        if (children == null || child == null) return false;
        int childIndex = -1;
        for (int i = 0; i<children.size();i++) {
            if (children.contains(child)) {
                childIndex = i;
                break;
            }
        }
        if (childIndex == -1) {
            return  false;
        } else {
           ArrayList<Human> tempChildren = new ArrayList<>(children.size() - 1);
            for (int i = 0; i<children.size(); i++) {
                if (i != childIndex) {
                    tempChildren = children;
                    break;
                }
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
        return children.size()+2;
    }


    @Override
    public String toString(){
        return String.format("Human{Father name='%s', Father surname='%s', year='%d', Mother name='%s', Mother surname='%s', year='%d', Children='%s'}",
                father.getName(),father.getSurname(),father.getYear(),
                mother.getName(),mother.getSurname(),mother.getYear(), children);
    }
}
