package lesson_5;

public class FileObject {
    public Integer value;
    public Integer valueFrom;
    public Integer valueTo;

    public FileObject(Integer value, Integer valueFrom, Integer valueTo) {
        this.value = value;
        this.valueFrom = valueFrom;
        this.valueTo = valueTo;
    }

    public Integer getValue() {
        return value;
    }

    public Integer getValueFrom() {
        return valueFrom;
    }

    public Integer getValueTo() {
        return valueTo;
    }
}
