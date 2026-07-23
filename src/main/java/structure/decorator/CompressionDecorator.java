package structure.decorator;

public abstract class CompressionDecorator extends DataSourceDecorator {

    protected CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        super.writeData(compresser(data));
    }

    @Override
    public String readData() {
        return decompresser(super.readData());
    }

    protected abstract String compresser(String donnees);

    protected abstract String decompresser(String donnees);
}
