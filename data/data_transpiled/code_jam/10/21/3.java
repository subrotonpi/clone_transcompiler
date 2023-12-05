public static int T = Integer . parseInt ( scanner . nextLine ( ) ) {
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int M = Integer . parseInt ( scanner . nextLine ( ) ) ;
    Set < String > paths = new HashSet < String > ( ) ;
    int res = 0 ;
    for ( int i = 0 ;
    i < N + M ;
    i ++ ) {
      String path = scanner . nextLine ( ) ;
      while ( path . length ( ) != 0 ) {
        if ( ! ( path . equals ( "" ) ) ) {
          paths . add ( path ) ;
          if ( i >= N ) {
            res = res + 1 ;
          }
        }
        int j = path . length ( ) - 1 ;
        while ( ( j >= 0 ) && ( path . charAt ( j ) != '/' ) ) {
          j = j - 1 ;
        }
        path = path . substring ( 0 , j ) ;
      }
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + res ) ;
  }
  return T ;
}
