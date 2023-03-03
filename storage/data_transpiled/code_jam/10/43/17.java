static void solve ( Scanner in ) throws IOException {
  in . nextLine ( ) ;
  int T = in . nextInt ( ) ;
  for ( int tNo = 0 ;
  tNo < T ;
  tNo ++ ) {
    int n = in . nextInt ( ) ;
    int [ ] [ ] P = new int [ 102 ] [ 102 ] ;
    int [ ] [ ] A = new int [ 102 ] [ 102 ] ;
    for ( int ii = 0 ;
    ii < n ;
    ii ++ ) {
      int x1 = in . nextInt ( ) ;
      int y1 = in . nextInt ( ) ;
      int x2 = in . nextInt ( ) ;
      int y2 = in . nextInt ( ) ;
      for ( int i = xrange ( x1 , x2 + 1 ) ;
      i < n ;
      i ++ ) {
        for ( int j = xrange ( y1 , y2 + 1 ) ;
        j < n ;
        j ++ ) {
          A [ i + 1 ] [ j + 1 ] = 1 ;
        }
      }
    }
    int sol = 0 ;
    while ( Arrays . binarySearch ( P , A ) > 0 ) {
      int [ ] [ ] B = new int [ 102 ] [ 102 ] ;
      for ( int i = 1 ;
      i < 102 ;
      i ++ ) {
        for ( int j = 1 ;
        j < 102 ;
        j ++ ) {
          if ( A [ i ] [ j ] == 1 && A [ i - 1 ] [ j ] + A [ i ] [ j - 1 ] > 0 ) {
            B [ i ] [ j ] = 1 ;
          }
          else if ( A [ i - 1 ] [ j ] + A [ i ] [ j - 1 ] == 2 ) {
            B [ i ] [ j ] = 1 ;
          }
        }
      }
      A = B ;
      sol ++ ;
    }
    System . out . println ( "Case #" + ( tNo + 1 ) + ": " + sol ) ;
  }
}
