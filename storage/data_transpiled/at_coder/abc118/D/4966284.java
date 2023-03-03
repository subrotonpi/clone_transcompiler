public static int INF = 2 * * 50 ;
int [ ] a = {
  0 , 2 , 5 , 5 , 4 , 5 , 6 , 3 , 7 , 6 }
  ;
  int [ ] dp = new int [ n + 10 ] ;
  dp [ 0 ] = 0 ;
  for ( int d = 0 ;
  d < n + 1 ;
  d ++ ) {
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      int nd = d + c [ a [ i ] ] ;
      dp [ nd ] = Math . max ( dp [ nd ] , 10 * dp [ d ] + a [ i ] ) ;
    }
  }
  