public static void tnum ( Scanner scanner ) {
  int tnum = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int tcou = 0 ;
  tcou < tnum ;
  tcou ++ ) {
    int k = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int c = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int s = Integer . parseInt ( scanner . nextLine ( ) ) ;
    System . out . println ( "Case #" + ( tcou + 1 ) + ":" ) ;
    if ( s * c < k ) {
      System . out . println ( "IMPOSSIBLE" ) ;
    }
    else {
      for ( int i = 0 ;
      i < ( k + c - 1 ) / c ;
      i ++ ) {
        int m = 0 ;
        for ( int j = i * c ;
        j < Math . min ( ( i + 1 ) * c , k ) ;
        j ++ ) {
          m = m * k + j ;
        }
        System . out . println ( m + 1 ) ;
      }
      System . out . println ( ) ;
    }
  }
}
