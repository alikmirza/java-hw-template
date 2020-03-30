package hw13.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import hw13.domain.Family;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class DaoFamilyFile implements FamilyDao<Family> {


    private File file;
    public DaoFamilyFile(String filename){
        this.file=new File(filename);
    }


    @Override
    public Collection<Family> getAllFamilies() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String json = br.lines().collect(Collectors.joining());
            List<Family> families = Arrays.asList(new ObjectMapper().readValue(json,Family[].class));
            return families;
        } catch (IOException ex) {
            return new ArrayList<>();
        }
    }

    @Override
    public Family getFamilyByIndex(int index) {
        List<Family> list=new ArrayList<>(getAllFamilies());
        return Optional.ofNullable(list.get(index)).orElse(null);
    }

    @Override
    public boolean deleteFamily(int index) {
        List<Family> list=new ArrayList<>(getAllFamilies());
        if (index>=list.size()) return false;
        if (list.remove(index) != null)
            write(list);
        return true;

    }

    @Override
    public boolean deleteFamily(Family family) {
        return false;
    }

    @Override
    public void saveFamily(Family family) {

    }

    @Override
    public void createAll(Collection data) {
        write(data);
    }


    private void write(Collection<Family> families) {
        try (FileWriter oos = new FileWriter(file, false)) {
            oos.append(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(families));
        } catch (IOException ex) {
            throw new RuntimeException("DAO:write:IOException", ex);
        }
    }
}
