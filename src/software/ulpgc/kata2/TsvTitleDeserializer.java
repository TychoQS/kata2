package software.ulpgc.kata2;

public class TsvTitleDeserializer implements TitleDeserializer{
    @Override
    public Title deserialize(String line) {
        return deserialize(line.split("\t"));
    }

    private Title deserialize(String[] split) {
        return new Title(split[3], toInt(split[5]), toInt(split[7]));
    }

    private int toInt(String value) {
        if (value.equals("\\N")) return 0;
        return Integer.parseInt(value);
    }
}
