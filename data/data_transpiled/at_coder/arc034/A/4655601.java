public static int N = Integer . parseInt ( input ) {
  int ResMax = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] p = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) p [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    int tmp = Integer . parseInt ( p [ 0 ] ) + p [ 4 ] * 110 / 900 ;
    if ( tmp > ResMax ) ResMax = tmp ;
  }
  return ResMax ;
}
