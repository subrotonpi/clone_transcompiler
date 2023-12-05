public static int [ ] a ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int count = 0 ;
  int nexti = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    nexti = a [ nexti - 1 ] ;
    count ++ ;
    if ( ( nexti == 2 ) && ( nexti == 3 ) ) {
      System . out . println ( count ) ;
      exit ( ) ;
    }
  }
  System . out . println ( - 1 ) ;
  return a ;
}
