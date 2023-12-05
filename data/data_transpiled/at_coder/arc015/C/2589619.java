@ VisibleForTesting static void dfs ( ) {
  final int N = 1000 * 100 ;
  final List < Integer > ids = Lists . newArrayList ( ) ;
  final Map < Integer , Integer > pos = Maps . newHashMap ( ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < List < Integer >> path = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    final String [ ] a = input . nextLine ( ) . split ( " " ) ;
    final int l = a [ 0 ] ;
    final int m = Integer . parseInt ( a [ 1 ] ) ;
    final String s = a [ 2 ] ;
    if ( ! l == 0 ) {
      pos . put ( l , ids . size ( ) ) ;
      ids . add ( l ) ;
      path . add ( Lists . newArrayList ( ) ) ;
    }
    if ( ! s == 0 ) {
      pos . put ( s , ids . size ( ) ) ;
      ids . add ( s ) ;
      path . add ( Lists . newArrayList ( ) ) ;
    }
    path . get ( pos . get ( l ) ) . add ( new List < Integer > ( pos . get ( s ) , new Fraction ( m , 1 ) ) ) ;
  }
  final int [ ] dist = new int [ N ] ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) dist [ i ] = null ;
  I = 0 ;
  J = 0 ;
  {
    for ( int j = 0 ;
    j < dist . length ;
    j ++ ) {
      if ( dist [ i ] < dist [ j ] ) {
        dist [ j ] = dist [ j ] * i ;
      }
    }
  }
}
