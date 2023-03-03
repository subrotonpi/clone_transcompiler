static final int [ ] binarySearch ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] O = new int [ N ] ;
  int [ ] E = new int [ N ] ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    A [ i ] = a ;
    if ( i % 2 == 0 ) {
      O [ i ] = a ;
    }
    else {
      E [ i ] = a ;
    }
  }
  Arrays . sort ( E ) ;
  return E ;
}
