public static void print ( int N ) {
  int [ ] L = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( L [ i ] >= 80 ) {
    }
    else {
      res += 80 - L [ i ] ;
    }
  }
  System . out . println ( res ) ;
}
