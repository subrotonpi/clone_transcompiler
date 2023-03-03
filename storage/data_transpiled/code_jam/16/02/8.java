@ String ( filename = "B-large" ) public static void main ( String [ ] args ) throws IOException {
  BufferedReader fin = new BufferedReader ( new FileReader ( filename + ".in" ) ) ;
  PrintWriter fout = new PrintWriter ( filename + ".out" ) ;
  int casenum = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int ite = 0 ;
  ite < casenum ;
  ite ++ ) {
    String inStr = fin . readLine ( ) ;
    if ( inStr . length ( ) > 1 ) {
      inStr = inStr . substring ( 0 , inStr . length ( ) - 1 ) ;
    }
    inStr = inStr + '+' ;
    int count = 0 ;
    for ( int jte = 0 ;
    jte < inStr . length ( ) - 1 ;
    jte ++ ) {
      if ( inStr . charAt ( jte ) != inStr . charAt ( jte + 1 ) ) {
        count ++ ;
      }
    }
    String returnStr = Integer . toString ( count ) ;
    fout . println ( "Case #" + ( ite + 1 ) + ": " + returnStr ) ;
  }
}
