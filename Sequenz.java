public class Sequenz implements SequenzIF{
    String[][] seq;

    public Sequenz(String[][]seq){
        this.seq = seq;
    }

    public boolean isWellSorted(String[] sequence){
        int counter = 0;

        for(int k=0; k<sequence.length; k++){
            for(int i=seq[0].length-1;i>=0; i--) {
                for (int j = 0; j < seq.length; j++) {
                    if (i > 0) {
                        if (seq[j][i].equals(sequence[k]) && seq[j][i-1].equals("ok")) { //"A,B,C"
                            seq[j][i] = "ok";
                            counter++;
                        }else if (seq[j][i].equals(sequence[k])){
                            return false;
                        }
                    } else {
                        if (seq[j][i].equals(sequence[k])) {
                            seq[j][i] = "ok";
                            counter++;
                        }
                    }
                }
            }
        }
        if(seq[0].length * seq.length > counter){
            return false;
        }else{
            return true;
        }
    }
}
