package hw09.controller;

import hw09.domain.Family;
import hw09.domain.Human;
import hw09.domain.Pet;
import hw09.service.FamilyService;

import java.util.Collection;

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

    public Family bornChild(Family family, String boy, String girl){
         return familyService.bornChild(family,boy,girl);
    }

    public Family adoptChild(Family family, Human human){
        return familyService.adoptChild(family,human);
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


}
