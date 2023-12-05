, n = n , x = ( int ) input = new Scanner ( System . in ) ) public static void main ( String [ ] args ) {
  int [ ] h = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) h [ i ] = Integer . parseInt ( args [ i ] ) ;
  int [ ] s = new int [ n + 1 ] , ans = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = ( int ) args [ i ] ;
    int b = ( int ) args [ i ] ;
    s [ a ] = b ;
    s [ b ] = a ;
  }
  int t = 0 , q = new int [ n + 1 ] , vis = new boolean [ n + 1 ] , p = new int [ n + 1 ] ;
  while ( q . hasNext ( ) ) {
    int t2 = q . next ( ) ;
    while ( p [ t2 ] != t ) {
      if ( h [ t - 1 ] != 0 ) ans = ans + 2 ;
      t = p [ t ] ;
    }
    vis [ t ] = false ;
    t = t2 ;
    for ( int i : s [ t ] ) {
      if ( vis [ i ] ) {
        p [ i ] = t ;
        q . next ( ) ;
      }
    }
  }
  while ( t != x ) {
    if ( h [ t - 1 ] != 0 ) ans = ans + 2 ;
    t = p [ t ] ;
  }
  System . out . println ( ans ) ;
}
