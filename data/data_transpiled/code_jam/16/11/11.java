static final class Case {
  private final FileReader fin = new FileReader ( fileName ) ;
  private final FileWriter fout = new FileWriter ( fileName + ".out" ) ;
  int n = 0 ;
  String [ ] line = null ;
  public int readInt ( ) {
    if ( line == null ) {
      line = new StringTokenizer ( fin . readLine ( ) ) . split ( "\\s+" ) ;
    }
    int result = Integer . parseInt ( line [ 0 ] ) ;
    if ( line . length == 0 ) {
      line = null ;
    }
    return result ;
  }
  public String readLine ( ) {
    String line = fin . readLine ( ) ;
    if ( line . length ( ) > 0 ) {
      return line [ 0 ] ;
    }
    return line ;
  }
  public void output ( String s ) {
    if ( s == null ) {
      return ;
    }
    s = s . trim ( ) ;
    if ( s . contains ( "\n" ) ) {
      fout . write ( "Case #" + n + ":" + s ) ;
    }
    else {
      fout . write ( "Case #" + n + ": " + s + "\n" ) ;
    }
  }
  public void run ( String fileName , BiConsumer < Case , Case > solve ) {
    BufferedReader fin = new BufferedReader ( new FileReader ( fileName ) ) ;
    BufferedWriter fout = new BufferedWriter ( new FileWriter ( fileName + ".out" ) ) ;
    int caseCount = Integer . parseInt ( fin . readLine ( ) ) ;
    for ( int i = 0 ;
    i < caseCount ;
    i ++ ) {
      Case testCase = new Case ( fin , fout , i + 1 ) ;
      testCase . output ( solve . accept ( testCase ) ) ;
    }
  }
}
