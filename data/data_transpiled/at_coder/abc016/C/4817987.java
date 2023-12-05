private static void input ( Scanner in ) {
  int n = in . nextInt ( ) , m = in . nextInt ( ) ;
  Set < Integer > [ ] l1 = new Set [ n ] ;
  Map < Integer , Set < Integer >> [ ] l2 = new HashMap [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) l1 [ i ] = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) l2 [ i ] = new HashMap < Integer , Set < Integer >> ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = in . nextInt ( ) ;
    int b = in . nextInt ( ) ;
    a = a - 1 ;
    b = b - 1 ;
    l1 [ a ] . add ( b ) ;
    l1 [ b ] . add ( a ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = 0 ;
  j < l1 [ i ] . size ( ) ;
  j ++ ) l2 [ i ] = l2 [ i ] . union ( l1 [ j ] ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) System . out . println ( l2 [ i ] . difference ( l1 [ i ] ) . size ( ) - 1 ) ;
}
