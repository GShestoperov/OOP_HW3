import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stream stream = new Stream();
        stream.addStudyGroup(new StudyGroup("К5-124"));
        stream.addStudyGroup(new StudyGroup("К5-123"));
        stream.addStudyGroup(new StudyGroup("К5-281"));
        stream.addStudyGroup(new StudyGroup("К5-121"));

//        Iterator<StudyGroup> iter = stream.iterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }
//
//        System.out.println("");
//

        for (Object studyGroup: stream) {
            System.out.println(studyGroup);
        }
        System.out.println("");

        stream.getStudyGroupList().sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        for (Object studyGroup: stream) {
            System.out.println(studyGroup);
        }
        System.out.println("----------------------------------------------------------------");

        Stream stream2 = new Stream();
        stream2.addStudyGroup(new StudyGroup("К3-124"));
        stream2.addStudyGroup(new StudyGroup("К3-123"));

        Stream stream3 = new Stream();
        stream3.addStudyGroup(new StudyGroup("К7-124"));
        stream3.addStudyGroup(new StudyGroup("К7-123"));
        stream3.addStudyGroup(new StudyGroup("К7-281"));

        StreamService streamService = new StreamService();
        streamService.addStream(stream);
        streamService.addStream(stream2);
        streamService.addStream(stream3);

//        streamService.iteratorInit();
//        while (streamService.hasNext())
//            System.out.println(streamService.next());

        System.out.println(streamService);
        streamService.sortStreams();
        System.out.println();
        System.out.println(streamService);
    }

}
