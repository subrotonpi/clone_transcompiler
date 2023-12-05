public static void readFile ( File in ) throws IOException {
  File outp = new File ( "d:\\incoming\\a-large (1).in" ) ;
  outp . createNewFile ( ) ;
  int T = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int cc = 0 ;
  cc < T ;
  cc ++ ) {
    int sol = - 1 ;
    int n = Integer . parseInt ( in . readLine ( ) ) ;
    int [ ] seq = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      String line = in . readLine ( ) . trim ( ) ;
      if ( line . contains ( "1" ) ) seq [ i ] = line . lastIndexOf ( "1" ) ;
      else seq [ i ] = - 1 ;
    }
    sol = 0 ;
  }
  outp . close ( ) ;
}
