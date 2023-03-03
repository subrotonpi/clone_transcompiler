private static final Scanner rl = new Scanner ( System . in ) {
  @ Override public int next ( ) {
    return Integer . parseInt ( scanner . nextLine ( ) ) ;
  }
  @ Override public boolean anyLose ( int n , int p , int m ) {
    assert 1 <= p && p <= n ;
    assert 0 <= m && m <= n - 1 ;
    if ( n == 1 ) return p <= m ;
    if ( p <= n / 2 ) return m < > 0 || anyLose ( n / 2 , p , m ) ;
    else return m < > 0 && anyLose ( n / 2 , p - n / 2 , ( m - 1 ) / 2 ) ;
  }
  @ Override public boolean anyWin ( int n , int p , int m ) {
    assert 1 <= p && p <= n ;
    assert 0 <= m && m <= n - 1 ;
    if ( n == 1 ) return p > m ;
    if ( p <= n / 2 ) return m < > n - 1 && anyWin ( n / 2 , p , ( m + 1 ) / 2 ) ;
    else return m < > n - 1 || anyWin ( n / 2 , p - n / 2 , m - n / 2 ) ;
  }
  @ Override public void go ( int n , int p , IntFunction f ) {
    int l = 0 ;
    int r = ( 2 * n ) - 1 ;
    while ( l < r ) {
      int m = ( l + r + 1 ) / 2 ;
      if ( f . apply ( 2 * n , p , m ) ) l = m ;
      else r = m - 1 ;
    }
    assert l == r ;
    return l ;
  }
}
