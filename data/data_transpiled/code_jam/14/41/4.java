@ Function public static Function < Integer , Integer > get = new Function < Integer , Integer > ( ) {
  @ Override public Integer apply ( Integer input ) {
    int T = get ( ) ;
    for ( int testCase = 1 ;
    testCase <= T ;
    testCase ++ ) {
      int N = get ( ) ;
      int X = get ( ) ;
      List < Integer > s = new ArrayList < > ( get ( ) ) ;
      Collections . sort ( s ) ;
      int l = s . size ( ) - 1 ;
      int f = 0 ;
      int d = 0 ;
      while ( l >= f ) {
        if ( l == f ) {
          d ++ ;
          l -- ;
        }
        else {
          if ( s . get ( l ) + s . get ( f ) <= X ) {
            d ++ ;
            l -- ;
            f ++ ;
          }
          else {
            d ++ ;
            l -- ;
          }
        }
      }
      System . out . println ( "Case #" + testCase + ": " + d ) ;
    }
    return T ;
  }
}
