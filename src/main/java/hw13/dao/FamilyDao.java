package hw13.dao;

import java.util.Collection;

public interface FamilyDao<A> {
    Collection<A> getAllFamilies();
    A getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(A a);
    void saveFamily(A a);
    void createAll(Collection<A> data);

}
