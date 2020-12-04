public class Wheel {
    private String Type;
    private Number Width;
    private Number AspectRatio;
    private String ConstructionType;
    private Number Diameter;
    private Number LoadIndex;
    private String SpeedRating;

    public Wheel(String type, Number width, Number aspectRatio, String constructionType, Number diameter, 
            Number loadIndex, String speedRating) {
        Type = type;
        Width = width;
        AspectRatio = aspectRatio;
        ConstructionType = constructionType;
        Diameter = diameter;
        LoadIndex = loadIndex;
        SpeedRating = speedRating;
    }

    public String GetType() {
        return Type;
    }

    public void SetType(String type) {
        Type = type;
    }

    public Number GetWidth() {
        return Width;
    }

    public void SetWidth(Number width) {
        Width = width;
    }

    public Number GetAspectRatio() {
        return AspectRatio;
    }

    public void SetAspectRatio(Number aspectRatio) {
        AspectRatio = aspectRatio;
    }

    public String GetConstructionType() {
        return ConstructionType;
    }

    public void SetConstructionType(String constructionType) {
        ConstructionType = constructionType;
    }

    public Number GetDiameter() {
        return Diameter;
    }

    public void SetDiameter(Number diameter) {
        Diameter = diameter;
    }

    public Number GetLoadIndex() {
        return LoadIndex;
    }

    public void SetLoadIndex(Number loadIndex) {
        LoadIndex = loadIndex;
    }

    public String GetSpeedRating() {
        return SpeedRating;
    }

    public void SetSpeedRating(String speedRating) {
        SpeedRating = speedRating;
    }
}