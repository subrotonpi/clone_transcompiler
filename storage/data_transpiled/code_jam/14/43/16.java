@ VisibleForTesting static int getSolutionFactor ( int w , int h , int [ ] [ ] buildings ) {
  int i , j ;
  int eName ;
  int eOutName ;
  int outName ;
  int outWidth ;
  int outHeight ;
  int w = h ;
  int h = w ;
  int b = h ;
  buildings = new int [ w ] [ h ] ;
  for ( i = 0 ;
  i < w ;
  i ++ ) {
    ( i = 0 ) for ( int j = 0 ;
    j < h ;
    j ++ ) {
      int x0 = i ;
      int y0 = j ;
      int x1 = i ;
      int y1 = j ;
      buildings [ i ] [ j ] = x0 ;
      buildings [ i ] [ j ] = x1 ;
      buildings [ i ] [ j ] = y0 ;
    }
  }
  if ( __name__ . equals ( "__main__" ) ) GCJ . main ( ) ;
  else {
    System . out . println ( "[__main__] " + "[__main__] " ) ;
  }
  return 0 ;
}
