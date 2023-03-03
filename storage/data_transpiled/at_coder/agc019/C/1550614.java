@ VisibleForTesting static final Comparator < List < Integer >> LIS = new Comparator < List < Integer >> ( ) {
  @ Override public int compare ( List < Integer > o1 , List < Integer > o2 ) {
    return o1 . size ( ) - o2 . size ( ) ;
  }
  private int [ ] LIS ( List < Integer > L ) {
    int [ ] best = new int [ o1 . size ( ) ] ;
    for ( int i = 0 ;
    i < L . size ( ) ;
    i ++ ) {
      int pos = LIS . compare ( best , L . get ( i ) ) ;
      if ( best . length <= pos ) {
        best [ pos ] = L . get ( i ) ;
      }
      else {
        best [ pos ] = L . get ( i ) ;
      }
    }
    return best . length ;
  }
  @ Override public int compare ( List < Integer > o1 , List < Integer > o2 ) {
    int xflip = 1 ;
    int yflip = 1 ;
    int x1 = Integer . parseInt ( input . get ( ) ) ;
    int y1 = Integer . parseInt ( input . get ( ) ) ;
    int x2 = Integer . parseInt ( input . get ( ) ) ;
    int y2 = Integer . parseInt ( input . get ( ) ) ;
    if ( x1 > x2 ) {
      xflip = - 1 ;
      x1 = x2 ;
      x2 = x1 ;
    }
    if ( y1 > y2 ) {
      yflip = - 1 ;
      y1 = y2 ;
      y2 = y1 ;
    }
    List < Point > points = new ArrayList < Point > ( ) ;
    int n = Integer . parseInt ( input . get ( ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int x = Integer . parseInt ( input . get ( ) ) ;
      int y = Integer . parseInt ( input . get ( ) ) ;
      if ( x1 <= x && x <= x2 && y1 <= y && y <= y2 ) {
        points . add ( new Point ( x * xflip , y * yflip ) ) ;
      }
    }
    Arrays . sort ( points ) ;
    int foun = LIS . compare ( points , best ) ;
    int dist = new BigDecimal ( 100 ) . multiply ( x2 - x1 + y2 - y1 ) . intValue ( ) ;
    int dx = new BigDecimal ( "-4.2920367320510338076867835" ) . multiply ( foun ) . intValue ( ) ;
    if ( foun == Math . min ( x2 - x1 + 1 , y2 - y1 +