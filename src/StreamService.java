import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamService implements Iterator<Stream> {

    private List<Stream> streamList;
    private int index;

    public StreamService() {
        streamList = new ArrayList<>();
    }

    public void addStream(Stream newStream) {
        streamList.add(newStream);
    }

    public List<Stream> getStreamList() {
        return streamList;
    }

    public void iteratorInit() {
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.streamList.size();
    }

    @Override
    public Stream next() {
        if (hasNext())
            return this.streamList.get(this.index++);
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        this.iteratorInit();
        while (this.hasNext()) {
            result += this.next().toString();
            result += "\n";
        }
        return result;
    }

    public void sortStreams() {
        streamList.sort(new StreamComparator());
    }
}
