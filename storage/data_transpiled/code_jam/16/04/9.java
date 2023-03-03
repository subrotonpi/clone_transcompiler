public static void main ( String filename = "D-large" ) throws IOException {
  BufferedReader fin = new BufferedReader ( new FileReader ( filename + ".in" ) ) ;
  BufferedWriter fout = new BufferedWriter ( new FileWriter ( filename + ".out" ) ) ;
  int casenum = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int ite = 0 ;
  ite < casenum ;
  ite ++ ) {
    String [ ] inList = fin . readLine ( ) . split ( " " ) ;
    int K = Integer . parseInt ( inList [ 0 ] ) ;
    int C = Integer . parseInt ( inList [ 1 ] ) ;
    int S = Integer . parseInt ( inList [ 2 ] ) ;
    int Smin = ( K - 1 ) / C + 1 ;
    String returnStr ;
    if ( S < ( K - 1 ) / C + 1 ) {
      returnStr = "IMPOSSIBLE" ;
    }
    else {
      returnStr = "" ;
      for ( int jte = 0 ;
      jte < Smin - 1 ;
      jte ++ ) {
        int nextNum = 0 ;
        for ( int kte = 0 ;
        kte < C ;
        kte ++ ) {
          nextNum *= K ;
          nextNum += kte + C * jte ;
        }
        returnStr += Integer . toString ( nextNum + 1 ) + " " ;
      }
      int nextNum = 0 ;
      for ( int kte = K - C ;
      kte < K ;
      kte ++ ) {
        nextNum *= K ;
        if ( kte >= 0 ) {
          nextNum += kte ;
        }
      }
      returnStr += Integer . toString ( nextNum + 1 ) ;
    }
    fout . write ( "Case #" + ( ite + 1 ) + ": " + returnStr + "\n" ) ;
  }
}
