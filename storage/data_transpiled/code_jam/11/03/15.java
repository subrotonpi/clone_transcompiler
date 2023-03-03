@ java . lang . Deprecated public static void main ( String [ ] args ) throws IOException {
  BufferedReader fin = new BufferedReader ( new FileReader ( "c-large.in" ) ) ;
  PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( "c-large.out" ) ) ) ;
  int cases = Integer . parseInt ( fin . readLine ( ) . split ( " " ) [ 0 ] ) ;
  int case = 0 ;
  /* answer */
  int [ ] result = new int [ cases ] ;
  for ( int i = 0 ;
  i < cases ;
  i ++ ) {
    result [ i ] = Integer . parseInt ( fin . readLine ( ) . split ( " " ) [ 0 ] ) ;
  }
  /* nim */
  int aux = 0 ;
  for ( int i = 0 ;
  i < result . length ;
  i ++ ) {
    aux = aux ^ result [ i ] ;
  }
  /* nim */
  for ( int test : xrange ( cases ) ) {
    int n = Integer . parseInt ( fin . readLine ( ) . split ( " " ) [ 0 ] ) ;
    int [ ] bag = map ( Integer . parseInt , fin . readLine ( ) . split ( " " ) ) ;
    if ( nim ( bag ) == 0 ) {
      answer ( String . valueOf ( Integer . parseInt ( bag [ n ] ) - Integer . parseInt ( bag [ n ] ) ) ) ;
    }
    else {
      answer ( "NO" ) ;
    }
  }
}
