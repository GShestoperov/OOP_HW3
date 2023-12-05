import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudyGroup> {

    private List<StudyGroup> studyGroupList;
    int index;

    public StreamIterator(Stream stream) {
        this.studyGroupList = stream.getStudyGroupList();
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < studyGroupList.size();
    }

    @Override
    public StudyGroup next() {
        if (hasNext())
            return studyGroupList.get(index++);
        return null;
    }

    @Override
    public void remove() {
        if (hasNext())
            studyGroupList.remove(index);
    }
}
