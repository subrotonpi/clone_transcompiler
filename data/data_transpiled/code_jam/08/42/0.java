@ String ( "FI" ) @ SuppressWarnings ( "resource" ) private static void case ( Scanner fi , PrintWriter fo , int num ) throws IOException {
  int N = Integer . parseInt ( fi . nextLine ( ) ) ;
  int M = Integer . parseInt ( fi . nextLine ( ) ) ;
  int A = Integer . parseInt ( fi . nextLine ( ) ) ;
  for ( int X : xrange ( 1 , N + 1 ) ) {
    for ( int Y : xrange ( A / X , M + 1 ) ) {
      for ( int x : xrange ( 1 , X + 1 ) ) {
        int y = ( X * Y - A ) / x ;
        if ( y >= 0 && A == X * Y - x * y ) {
          fo . println ( "Case #" + num + ": 0 0 " + x + " " + Y + " " + X + " " + y ) ;
          return ;
        }
      }
    }
  }
  fo . println ( "Case #" + num + ": IMPOSSIBLE" ) ;
}
