static final int [ ] binarySearch ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] W = new int [ N ] ;
  for ( int l = 0 ;
  l < N ;
  l ++ ) {
    W [ l ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] box = new int [ N ] ;
  box [ 0 ] = W [ 0 ] ;
  return box ;
}
