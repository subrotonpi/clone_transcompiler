static final int [ ] getSummarizingArray ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  final IntegerToIntFunction I = new IntegerToIntFunction ( ) ;
  final int n = input . nextInt ( ) ;
  final int m = input . nextInt ( ) ;
  final Set [ ] g = new HashSet [ n + 1 ] ;
  final int [ ] v = new int [ n + 1 ] ;
  v [ 1 ] = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    final int a = input . nextInt ( ) ;
    final int b = input . nextInt ( ) ;
    g [ a ] . add ( b ) ;
    g [ b ] . add ( a ) ;
  }
  return g ;
}
