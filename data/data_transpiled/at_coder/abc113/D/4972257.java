static final int [ ] [ ] resize ( int width , int height , int width , int k ) {
  int [ ] [ ] resize = new int [ width ] [ height ] ;
  k -- ;
  final long MOD = 1000000007 ;
  List < List < String >> patterns = new ArrayList < > ( ) ;
  for ( int r = 0 ;
  r < width - 1 ;
  r ++ ) {
    for ( String pattern : new String [ width ] ) {
      if ( Arrays . binarySearch ( resize [ r ] , pattern ) != - 1 ) {
        patterns . add ( pattern ) ;
      }
    }
  }
  int [ ] [ ] counts = new int [ width ] [ width ] ;
  for ( List < String > pattern : patterns ) {
    for ( int w = 0 ;
    w < width ;
    w ++ ) {
      if ( pattern . contains ( w ) ) {
        counts [ w ] [ w + 1 ] ++ ;
      }
      else if ( pattern . contains ( w - 1 ) ) {
        counts [ w ] [ w - 1 ] ++ ;
      }
      else {
        counts [ w ] [ w ] ++ ;
      }
    }
  }
  int [ ] [ ] dp = new int [ width ] [ height ] ;
  for ( int h = 0 ;
  h < height - 1 ;
  h ++ ) {
    for ( int w = 0 ;
    w < width ;
    w ++ ) {
      dp [ h + 1 ] [ w ] = Math . pow ( dp [ h ] [ v ] , counts [ v ] [ w ] ) % MOD ;
    }
  }
  if ( width == 1 ) {
    System . out . println ( 1 ) ;
  }
  else {
    System . out . println ( dp [ dp . length - 1 ] [ k ] ) ;
  }
  return dp ;
}
