static final int [ ] binarySearch ( int N ) {
  int [ ] L = new int [ N ] ;
  {
    int i = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      L [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  int [ ] L0 = L [ 0 ] ;
  Arrays . sort ( L0 ) ;
  int [ ] Ls0 = L [ 0 ] ;
  int cc = 0 ;
  for ( int i = 0 ;
  i < ( N + 1 ) / 2 ;
  i ++ ) {
    if ( ! Arrays . equals ( Ls0 , L0 [ i ] ) ) {
      cc ++ ;
    }
  }
  System . out . println ( cc ) ;
  return L0 ;
}
