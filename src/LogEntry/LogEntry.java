package LogEntry;


public class LogEntry {
    String operation = "";
    int result = 0;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String toString(){
        return operation+" "+operands+" equals "+result;
    }

}
