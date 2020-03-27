package hw12.service;

import hw12.dao.CollectionFamilyDao;
import hw12.dao.FamilyDao;
import hw12.domain.Family;
import hw12.domain.Human;
import hw12.domain.Pet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class FamilyService<A> {

    private FamilyDao<Family> familyDao = new CollectionFamilyDao();


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
        saveFamily(family);
    }

    public Family bornChild(int index, String boy, String girl){
        Human child;
        int random= (int) (Math.random()*2)+1;
        if (random==1) child = new Human(boy);
        else child = new Human(girl);
        return familyDao.getFamilyByIndex(index).addChild(child);
    }

    public Family adoptChild(int index, Human human){
        return familyDao.getFamilyByIndex(index).addChild(human);
    }

    public int count(){
        return familyDao.getAllFamilies().size();
    }

    public Collection<String> getPets(int index){
        return familyDao.getFamilyByIndex(index).getPet().stream().map(Pet::toString).collect(Collectors.toList());
    }

    public void addPet(int index, Pet pet){
        familyDao.getFamilyByIndex(index).getPet().add(pet);
    }

    public void deleteAllChildrenOlderThen(int age){
        List<Human> childrenForDelete = new ArrayList<>();
        familyDao.getAllFamilies().stream().peek(family -> family.getChildren()
                .stream()
                .filter(human -> human.getBirthDate()>age)
                .forEach(childrenForDelete::add))
                .forEach(family -> {
                    family.getChildren().removeAll(childrenForDelete);
                    childrenForDelete.clear();
        });
    }

    public Collection<String> displayAllFamilies(){
        AtomicInteger count = new AtomicInteger(1);
        return familyDao.getAllFamilies().stream().map(family -> family.prettyFormat(count.getAndIncrement())).collect(Collectors.toList());
    }

}


