import java.util.Objects;

class Вох {
    private double width;
    private double height;
    private double depth;

    public void t(){
        double a = width + height + depth;
    }

    public double getWidth() {
        return Double.valueOf(width);
    }

    public void setWidth(double width) {
        this.width = (int) width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Вох вох = (Вох) o;

        if (Double.compare(вох.width, width) != 0) return false;
        if (Double.compare(вох.height, height) != 0) return false;
        return Double.compare(вох.depth, depth) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(width);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(depth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Вох{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
