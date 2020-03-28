package hw13.service;

import hw13.dao.DaoFamilyFile;
import hw13.dao.FamilyDao;
import hw13.domain.Family;
import hw13.domain.Human;
import hw13.domain.Pet;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class FamilyService<A> {

    private FamilyDao<Family> familyDao=new DaoFamilyFile("src\\main\\java\\hw13\\Families.txt");


    public Collection<String> getAllFamilies(){
        return familyDao.getAllFamilies().stream().map(Family::toString).
            collect(Collectors.toList());
    }

    public void saveFamily(Family family){
        familyDao.saveFamily(family);
    }

    public boolean deleteFamily(int index){
        return familyDao.deleteFamily(index);
    }

    public Family getFamilyByIndex(int index){
        return familyDao.getFamilyByIndex(index);
    }

    public boolean deleteFamily(Family family){
        return familyDao.deleteFamily(family);
    }

    public  Collection<String> getFamiliesBiggerThan(int bound){
        return familyDao.getAllFamilies().stream().filter(family -> family.countFamily()>bound).map(Family::toString).
                collect(Collectors.toList());
    }

    public Collection<String> getFamiliesLessThan(int bound){
        return familyDao.getAllFamilies().stream().filter(family -> family.countFamily()<bound).map(Family::toString).
                collect(Collectors.toList());
    }

    public int countFamiliesWithMemberNumber(int bound){
        return (int) familyDao.getAllFamilies().stream().filter(family -> family.countFamily()==bound).count();
    }

    public void createNewFamily(Human father, Human mother){
        Family family=new Family(father,mother);
        List<Family>list= new ArrayList<>(familyDao.getAllFamilies());
        list.add(family);
        writeFamilies(list);
    }

    public void bornChild(int index, String boy, String girl){
        Human child;
        int random= (int) (Math.random()*2)+1;
        if (random==1) child = new Human(boy);
        else child = new Human(girl);
        List<Family> list= new ArrayList<>(familyDao.getAllFamilies());
        list.get(index).addChild(child);
        writeFamilies(list);
    }

    public void adoptChild(int index, Human human){
        List<Family> list=new ArrayList<>(familyDao.getAllFamilies());
        list.get(index).addChild(human);
        writeFamilies(list);
    }

    public int count(){
        return familyDao.getAllFamilies().size();
    }

    public Collection<String> getPets(int index){
        return familyDao.getFamilyByIndex(index).getPets().stream().map(Pet::toString).collect(Collectors.toList());
    }

    public void addPet(int index, Pet pet){
        familyDao.getFamilyByIndex(index).getPets().add(pet);
    }

    public void deleteAllChildrenOlderThen(int age){
        List<Human> childrenForDelete = new ArrayList<>();
        List<Family> list=new ArrayList<>(familyDao.getAllFamilies());
        list.stream().peek(family -> family.getChildren()
                .stream()
                .filter(human -> human.getBirthDate()>age)
                .forEach(childrenForDelete::add))
                .forEach(family -> {
                    family.getChildren().removeAll(childrenForDelete);
                    childrenForDelete.clear();
                    writeFamilies(list);
                });
    }

    public Collection<String> displayAllFamilies(){
        AtomicInteger count = new AtomicInteger(1);
        return familyDao.getAllFamilies().stream().map(family -> family.prettyFormat(count.getAndIncrement())).collect(Collectors.toList());
    }

    public void writeFamilies(Collection<Family> families){
        familyDao.createAll(families);
    }

}


