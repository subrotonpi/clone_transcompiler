@ VisibleForTesting static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input [ 0 ] ) ;
  int m = Integer . parseInt ( input [ 1 ] ) ;
  Map < Integer , List < Integer >> edge = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int l = Integer . parseInt ( input [ 2 ] ) ;
    int r = Integer . parseInt ( input [ 3 ] ) ;
    int d = Integer . parseInt ( input [ 4 ] ) ;
    if ( ! edge . containsKey ( l ) ) {
      edge . put ( l , new ArrayList < > ( ) ) ;
    }
    edge . get ( l ) . add ( r , d ) ;
    if ( ! edge . containsKey ( r ) ) {
      edge . put ( r , new ArrayList < > ( ) ) ;
    }
    edge . get ( r ) . add ( l , - 1 * d ) ;
  }
  Integer [ ] x = new Integer [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( x [ i ] == null ) {
      x [ i ] = 0 ;
      q = new LinkedList < > ( ) ;
      x [ i ] = i ;
      while ( q . size ( ) > 0 ) {
        int v = q . get ( ) ;
        if ( x [ v ] == null ) {
          x [ v ] = x [ v ] + d ;
          q . add ( v ) ;
        }
        else if ( x [ u ] != x [ v ] + d ) {
          System . out . println ( "No" ) ;
          exit ( ) ;
        }
      }
    }
  }
  System . out . println ( "Yes" ) ;
}
