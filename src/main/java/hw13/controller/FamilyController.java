package hw13.controller;

import hw13.domain.Family;
import hw13.domain.Human;
import hw13.domain.Pet;
import hw13.service.FamilyService;

import java.util.Collection;
import java.util.List;

public class FamilyController<A> {

    private FamilyService familyService=new FamilyService();

    public Collection getAllFamilies(){
        return familyService.getAllFamilies();
    }

    public Family getFamilyByIndex(int index){
        return familyService.getFamilyByIndex(index);
    }

    public void saveFamily(Family family){
        familyService.saveFamily(family);
    }

    public boolean deleteFamily(int index){
        return familyService.deleteFamily(index);
    }

    public boolean deleteFamily(Family family){
        return familyService.deleteFamily(family);
    }

    public Collection getFamiliesBiggerThan(int bound){
        return familyService.getFamiliesBiggerThan(bound);
    }

    public Collection getFamiliesLessThan(int bound){
        return familyService.getFamiliesLessThan(bound);
    }

    public int countFamiliesWithMemberNumber(int bound){
        return familyService.countFamiliesWithMemberNumber(bound);
    }

    public void createNewFamily(Human father, Human mother){
        familyService.createNewFamily(father,mother);
    }

    public void bornChild(int index, String boy, String girl){
          familyService.bornChild(index,boy,girl);
    }

    public void adoptChild(int index, Human human){
         familyService.adoptChild(index,human);
    }

    public void deleteAllChildrenOlderThen(int age){
        familyService.deleteAllChildrenOlderThen(age);
    }

    public Collection getPets(int index){
        return familyService.getPets(index);
    }

    public void addPet(int index, Pet pet){
        familyService.addPet(index,pet);
    }

    public int count(){
        return familyService.count();
    }

    public Collection displayAllFamilies(){
        return familyService.displayAllFamilies();
    }

    public void writeFamilies(Collection<Family> families){
        familyService.writeFamilies(families);
    }


}
