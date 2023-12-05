public static void solveCase ( int t , int L , int tBooster , int [ ] stars ) {
  int N = stars . length ;
  Map < Integer , Integer > forBooster = new HashMap < > ( ) ;
  int tTemp = 0 ;
  for ( int i : xrange ( 1 , N + 1 ) ) {
    if ( tTemp >= tBooster ) {
      forBooster . put ( i , stars [ i ] ) ;
    }
    else {
      if ( tTemp + stars [ i ] * 2 <= tBooster ) {
        forBooster . put ( i , 0 ) ;
      }
      else {
        forBooster . put ( i , stars [ i ] - ( tBooster - tTemp ) / 2 ) ;
      }
      tTemp += stars [ i ] * 2 ;
    }
    stars [ i ] *= 2 ;
  }
  Set < Integer > k = forBooster . keySet ( ) ;
  Collections . sort ( k , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return - 1 ;
    }
  }
  ) ;
  for ( int i : xrange ( L ) ) {
    int m = k . get ( i ) ;
    stars [ m ] -= forBooster . get ( m ) ;
  }
  int time = 0 ;
  for ( int i : xrange ( 1 , N + 1 ) ) {
    time += stars [ i ] ;
  }
  System . out . println ( "Case #" + t + ": " + time ) ;
}
