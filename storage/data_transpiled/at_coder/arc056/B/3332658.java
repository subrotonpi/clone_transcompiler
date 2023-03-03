public static void main ( String [ ] args ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int m = Integer . parseInt ( input . nextLine ( ) ) ;
  final int s1 = Integer . parseInt ( input . nextLine ( ) ) ;
  final Set < Integer > [ ] adjs = new Set [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    adjs [ i ] = new HashSet < Integer > ( ) ;
  }
  for ( int j = 0 ;
  j < m ;
  j ++ ) {
    final int u1 = Integer . parseInt ( input . nextLine ( ) ) ;
    final int v1 = Integer . parseInt ( input . nextLine ( ) ) ;
    adjs [ u1 - 1 ] . add ( v1 ) ;
    adjs [ v1 - 1 ] . add ( u1 ) ;
  }
  final int [ ] costs = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    costs [ i ] = null ;
  }
  final boolean [ ] visited = new boolean [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    next [ i ] = - s1 ;
  }
}
