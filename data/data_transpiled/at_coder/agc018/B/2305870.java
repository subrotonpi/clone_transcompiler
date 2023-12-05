public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] A = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] a = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) a [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    A [ i ] = a ;
  }
  return N ;
}
