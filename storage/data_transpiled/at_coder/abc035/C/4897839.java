static final String print ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int N = Integer . parseInt ( input ) ;
  final int Q = Integer . parseInt ( input ) ;
  final List < List < Integer >> lrl = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    lrl . add ( new ArrayList < > ( ) ) ;
  }
  final int [ ] imos = new int [ N + 1 ] ;
  for ( final List < Integer > lr : lrl ) {
    imos [ lr . get ( 0 ) - 1 ] ++ ;
    imos [ lr . get ( 1 ) ] -- ;
  }
  final int [ ] s = new int [ N ] ;
  s [ 0 ] = 0 ;
  s [ 1 ] = imos [ 0 ] % 2 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    s [ i ] = ( s [ i ] + imos [ i ] ) % 2 ;
  }
  String ans = "" ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    ans = ans + s [ j ] ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
