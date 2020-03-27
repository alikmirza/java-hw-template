package hw09.dao;

import hw09.domain.Family;

import java.util.*;

public class CollectionFamilyDao implements FamilyDao<Family> {

    private static List<Family> families=new ArrayList<>();


    @Override
    public Collection<Family> getAllFamilies() {
       return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return Optional.ofNullable(families.get(index)).orElse(null);
    }

    @Override
    public boolean deleteFamily(int index) {
        if (index>=families.size()) return false;
        return families.remove(index) != null;

    }

    @Override
    public boolean deleteFamily(Family family) {
        return families.remove(family);
    }

    @Override
    public void saveFamily(Family family) {
        families.add(family);
    }

}
