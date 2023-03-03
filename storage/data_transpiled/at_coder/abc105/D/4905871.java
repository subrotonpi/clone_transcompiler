static final int [ ] getSums ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int N = Integer . parseInt ( input ) ;
  final int M = Integer . parseInt ( input ) ;
  final int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  final int [ ] SUM = new int [ N ] ;
  final Map < Integer , Integer > mp = new HashMap < > ( ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    SUM [ i ] = A [ i ] + SUM [ i ] ;
  }
  for ( int i = 0 ;
  i < SUM . length ;
  i ++ ) {
    SUM [ i ] = SUM [ i ] % M ;
    if ( ! SUM [ i ] == 0 ) mp . putAll ( SUM [ i ] , 0 ) ;
    else mp . putAll ( SUM [ i ] , mp . get ( SUM [ i ] ) + 1 ) ;
    res = res + mp . get ( SUM [ i ] ) ;
  }
  System . out . println ( res ) ;
  return null ;
}
