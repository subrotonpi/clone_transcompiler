static void solve ( ) {
  final int c = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int cnt = 1 ;
  cnt <= c ;
  cnt ++ ) {
    final int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int m = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int X = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int Y = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int Z = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int [ ] A = new int [ m ] ;
    for ( int p = 0 ;
    p <= m ;
    p ++ ) {
      A [ p ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    }
    final int [ ] speeds = new int [ n ] ;
    for ( int i = 0 ;
    i <= n ;
    i ++ ) {
      speeds [ i ] = A [ i % m ] ;
      A [ i % m ] = ( X * A [ i % m ] + Y * ( i + 1 ) ) % Z ;
    }
    final int [ ] totals = new int [ n ] ;
    int res = 0 ;
    for ( int x = n - 1 ;
    x >= 0 ;
    x -- ) {
      int total = 1 ;
      for ( int y = x + 1 ;
      y < n ;
      y ++ ) {
        if ( speeds [ x ] < speeds [ y ] ) total += totals [ y ] ;
      }
      res += total ;
      totals [ x ] = total ;
    }
    System . out . println ( "Case #" + cnt + ": " + ( res % 1000000007 ) ) ;
  }
}
