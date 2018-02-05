package Test.ThreadTest;

public class UnThreadSafeCountingProcessor implements CountingProcessor {
    private long count = 0;

    @Override
    public void process() {
        doProcess();
        /*synchronized (this){
            count++;
        }*/
        count++;
    }

    private void doProcess() {
    }

    @Override
    public long getCount() {
        return count;
    }
}
