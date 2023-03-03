public static int [ ] min ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  char S [ ] = input . toCharArray ( ) ;
  int [ ] a = new int [ N ] ;
  int first = 0 ;
  for ( int k = 1 ;
  k < N ;
  k ++ ) {
    if ( S [ k ] == 'E' ) {
      first ++ ;
    }
  }
  a [ 0 ] = first ;
  return a ;
}
