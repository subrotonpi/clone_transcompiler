static final int [ ] [ ] resize ( int width , int height , int width , int k ) {
  final int height = Integer . parseInt ( input ( ) ) ;
  final int width = Integer . parseInt ( input ( ) ) ;
  k -- ;
  final long MOD = 1000000007 ;
  final List < List < Integer >> patterns = new ArrayList < > ( ) ;
  for ( int r = 0 ;
  r < width - 1 ;
  r ++ ) {
    for ( List < Integer > pattern : new ArrayList < > ( ) ) {
      if ( Arrays . binarySearch ( pattern . subList ( 0 , width - 1 ) , pattern . subList ( width - 1 , r ) ) != 0 ) {
        patterns . add ( pattern ) ;
      }
    }
  }
  final int [ ] [ ] counts = new int [ width ] [ width ] ;
  for ( int pattern : patterns ) {
    counts [ pattern . length - 1 ] [ pattern . length ] = pattern . length ;
  }
  return counts ;
}
