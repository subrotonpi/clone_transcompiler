public static final String getCase ( String args ) throws IOException {
  BufferedReader fin = new BufferedReader ( new FileReader ( args ) ) ;
  PrintWriter fout = new PrintWriter ( new FileWriter ( "p1.out" ) ) ;
  int T = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int tt = xrange ( T ) ;
  tt < T ;
  tt ++ ) {
    String S = fin . readLine ( ) . trim ( ) ;
    String ans = "" ;
    for ( int i = 0 ;
    i < S . length ( ) ;
    i ++ ) {
      char c = S . charAt ( i ) ;
      if ( c + ans . length ( ) < ans . length ( ) + c ) ans = ans + c ;
      else ans = c + ans ;
    }
    fout . println ( "Case #" + ( tt + 1 ) + ": " + ans ) ;
  }
  fout . println ( "Case #" + ( tt + 1 ) + ": " + ans ) ;
  return "p1.out" ;
}
