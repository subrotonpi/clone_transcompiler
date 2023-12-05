static final String print ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  @ SuppressWarnings ( "resource" ) final int n = Integer . parseInt ( input ) ;
  final int m = Integer . parseInt ( input ) ;
  final List < List < Integer >> [ ] Edges = new List [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    final int a = Integer . parseInt ( input ) ;
    final int b = Integer . parseInt ( input ) ;
    Edges [ a - 1 ] . add ( b - 1 ) ;
    Edges [ b - 1 ] . add ( a - 1 ) ;
  }
  final int q = Integer . parseInt ( input ) ;
  final List < Integer > Q = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) Q . add ( Collections . singletonList ( Q [ i ] ) ) ;
  final int [ ] Visited = new int [ n ] ;
  Color = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Color [ i ] = colors [ i ] ;
  }
  return String . join ( Color , "\n" ) ;
}
