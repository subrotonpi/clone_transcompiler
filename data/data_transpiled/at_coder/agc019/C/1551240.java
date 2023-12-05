@ VisibleForTesting static final Comparator < List < Integer >> COMPARATOR = new Comparator < List < Integer >> ( ) {
  @ Override public int compare ( List < Integer > A ) {
    List < Integer > L = new ArrayList < > ( ) ;
    L . add ( A . get ( 0 ) ) ;
    for ( int a = 1 ;
    a < A . size ( ) ;
    a ++ ) {
      if ( A . get ( a ) > L . get ( L . size ( ) - 1 ) ) {
        L . add ( A . get ( a ) ) ;
      }
      else {
        L . set ( COMPARATOR . compare ( L , a ) ) ;
      }
    }
    return L . size ( ) ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String compare ( List < Integer > o1 , List < Integer > o2 ) {
    int x1 = Integer . parseInt ( input . get ( 0 ) ) ;
    int y1 = Integer . parseInt ( input . get ( 1 ) ) ;
    int x2 = Integer . parseInt ( input . get ( 2 ) ) ;
    int y2 = Integer . parseInt ( input . get ( 3 ) ) ;
    if ( x1 > x2 ) {
      x1 = x2 ;
      y1 = y1 ;
      x2 = x2 ;
      y2 = x1 ;
    }
    boolean isDown = y1 > y2 ;
    if ( isDown ) {
      y1 = - y1 ;
      y2 = - y2 ;
    }
    BigDecimal base = new BigDecimal ( 100 ) . multiply ( x2 - x1 + y2 - y1 ) ;
    int n = Integer . parseInt ( input . get ( 1 ) ) ;
    List < Integer > fountains = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int x = Integer . parseInt ( input . get ( 2 ) ) ;
      int y = Integer . parseInt ( input . get ( 3 ) ) ;
      if ( isDown ) {
        y = - y ;
      }
      if ( x < x1 || x2 < x || y < y1 || y2 < y ) {
        continue ;
      }
      fountains . add ( new Integer ( x ) ) ;
    }
    if ( fountains . isEmpty ( ) ) {
      return base . toString ( ) ;
    }
    int dpi = BigDecimal . valueOf ( pi ) . scale ( ) ;
    Collections . sort ( fountains ) ;
    int mc = lis ( fountains ) ;
    int dist ;
    if ( mc == Math . min ( x2 - x1 , y2 - y1 ) + 1 ) {
      dist