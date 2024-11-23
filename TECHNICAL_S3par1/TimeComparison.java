package TECHNICAL_S3par1;
class TimeComparison implements Comparison {

    @Override
    public boolean isGreater(Time t1, Time t2) {
        return t1.compareTo(t2) > 0;
    }

    @Override
    public boolean isLess(Time t1, Time t2) {
        return t1.compareTo(t2) < 0;
    }

    @Override
    public boolean isEqual(Time t1, Time t2) {
        return t1.compareTo(t2) == 0;
    }
}
