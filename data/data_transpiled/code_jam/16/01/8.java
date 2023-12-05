public static String filename = "A-large" ;
Scanner fin = new Scanner ( new File ( filename + ".in" ) ) ;
PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( filename + ".out" ) ) ) ;
int casenum = Integer . parseInt ( fin . nextLine ( ) ) ;
for ( int ite = 0 ;
ite < casenum ;
ite ++ ) {
  int num_count = Integer . parseInt ( fin . nextLine ( ) ) ;
  String [ ] fulllist = {
    "0" , "1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" }
    ;
    ArrayList < String > currlist = new ArrayList < String > ( ) ;
    int total_num = 0 ;
    String returnStr ;
    if ( num_count == 0 ) {
      returnStr = "INSOMNIA" ;
    }
    else {
      while ( currlist . size ( ) < fulllist . length ) {
        total_num += num_count ;
        String numstr = String . valueOf ( total_num ) ;
        for ( String s : numstr . split ( " " ) ) {
          if ( ! currlist . contains ( s ) ) {
            currlist . add ( s ) ;
          }
        }
      }
      returnStr = numstr ;
    }
    fout . println ( "Case #" + ( ite + 1 ) + ": " + returnStr ) ;
    return returnStr ;
  }
  