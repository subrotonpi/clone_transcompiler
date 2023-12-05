static final int powMod ( int a , int x , int m ) {
  final int y = 1 ;
  while ( 0 < x ) {
    if ( x % 2 == 1 ) {
      y *= a ;
      y %= m ;
    }
    x /= 2 ;
    a = a * a ;
    a %= m ;
  }
  final int M = 10 * 9 + 7 ;
  {
    int n = a ;
    int a = x ;
    int b = b ;
    int [ ] aa = new int [ n ] ;
    int i ;
    int r ;
    int c ;
    if ( n == 1 ) {
      r = ( aa [ 0 ] * powMod ( a , b , M ) ) % M ;
      System . out . println ( r ) ;
      return ;
    }
    Arrays . sort ( aa ) ;
    if ( a == 1 ) {
      for ( r = 0 ;
      r < aa . length ;
      r ++ ) {
        System . out . println ( r ) ;
      }
      return ;
    }
    c = 0 ;
    if ( n * 30 <= b ) {
      c = ( b - n * 30 ) / n ;
      b -= c * n ;
    }
    final int x0 = powMod ( a , c , M ) ;
    final int [ ] pa = new int [ n * 30 + 1 ] ;
    int x = 1 ;
    for ( i = 0 ;
    i < n * 30 + 1 ;
    i ++ ) {
      pa [ i ] = x ;
      x *= a ;
      x %= M ;
    }
    final int [ ] ca = new int [ n ] ;
    final double [ ] la = new double [ n ] ;
    for ( i = 0 ;
    i < aa . length ;
    i ++ ) {
      la [ i ] = Math . log ( aa [ i ] ) ;
    }
    final PriorityQueue < Integer > q = new PriorityQueue < Integer > ( ) ;
    for ( i = 0 ;
    i < n ;
    i ++ ) {
      heapAdd ( q , new Integer ( la [ i ] ) ) ;
    }
    for ( i = 0 ;
    i < b ;
    i ++ ) {
      x = a ;
      int j = a ;
      ca [ j ] ++ ;
      x ++ ;
      heapAdd ( q , new Integer ( x ) ) ;
    }
    for ( i = 0 ;
    i < n ;
    i ++ ) {
      final int j = a ;
      r = ( aa [ j ] * x0 ) % M ;
      r *= pa [ ca [ j ] ] ;
      r %= M ;
      System . out . println ( r ) ;
    }
  }
}
