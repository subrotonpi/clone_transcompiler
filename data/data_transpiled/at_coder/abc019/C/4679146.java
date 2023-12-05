public static int N = Integer . parseInt ( input ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Set s = new HashSet ( ) ;
  for ( int a : A ) {
    while ( a % 2 == 0 ) {
      a /= 2 ;
    }
    s . add ( a ) ;
  }
  return s . size ( ) ;
}
