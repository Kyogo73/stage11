package issues;


public abstract class Issue{
    private String code;
    private String name;

    public Issue(String code, String name){
        if(code == null){
            throw new IllegalArgumentException();
        }else{
            this.code = code;
        }

        if(name == null){
            throw new IllegalArgumentException();
        }else{
            this.name = name;
        }
    }

    public String getCode(){
        return this.code;
    }

    public String getName(){
        return this.name;
    }
}