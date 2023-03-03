static final int [ ] binarySearch ( int [ ] input ) {
  final int MAX = 10 * 5 ;
  final int [ ] res = new int [ MAX ] ;
  Arrays . fill ( res , 3 ) ;
  final boolean prime = ( x > 0 ) ;
  for ( int i = 2 ;
  i <= ( int ) Math . sqrt ( input [ i ] ) ;
  i ++ ) {
    if ( input [ i ] % input [ i ] == 0 ) {
      return false ;
    }
  }
  for ( int i = 3 ;
  i < MAX ;
  i += 2 ) {
    if ( prime && prime ( i * 2 - 1 ) ) {
      res [ i ] = i * 2 - 1 ;
    }
  }
  final int q = Integer . parseInt ( input [ 0 ] ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    final int l = Integer . parseInt ( input [ 1 ] ) ;
    final int r = Integer . parseInt ( input [ 2 ] ) ;
    System . out . println ( binarySearch ( res , r ) - binarySearch ( res , l ) ) ;
  }
  return res ;
}
