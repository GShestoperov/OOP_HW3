import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable {
    private List<StudyGroup> studyGroupList;

    public Stream() {
        this.studyGroupList = new ArrayList<>();
    }

    public List<StudyGroup> getStudyGroupList() {
        return studyGroupList;
    }

    public void setStudyGroupList(List<StudyGroup> studyGroupList) {
        this.studyGroupList = studyGroupList;
    }

    public void addStudyGroup(StudyGroup studyGroup) {
        this.studyGroupList.add(studyGroup);
    }

    public Iterator<StudyGroup> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public String toString() {
        String result = "";
        Iterator<StudyGroup> iter = this.iterator();
        while (iter.hasNext()) {
            result += iter.next();
            result += ", ";
        }
//        for (StudyGroup studyGroup: studyGroupList) {
//            result.append(studyGroup.toString());
//            result.append(", ");
//        }
        return result;
    }

    public int getStudyGroupCount() {
        return studyGroupList.size();
    }
}
