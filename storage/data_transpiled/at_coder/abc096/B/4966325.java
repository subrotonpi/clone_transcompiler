public static int [ ] A ( ) {
  int [ ] A = new int [ input . length ] ;
  for ( int j = 0 ;
  j < A . length ;
  j ++ ) {
    A [ j ] = Integer . parseInt ( input . substring ( j , j + 1 ) ) ;
  }
  return A ;
}
