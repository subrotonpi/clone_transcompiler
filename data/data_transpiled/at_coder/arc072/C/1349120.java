static void print ( String s ) {
  final int N = Integer . parseInt ( s ) ;
  final int D = Integer . parseInt ( s ) ;
  final int ds = Integer . parseInt ( s ) ;
  final int Q = Integer . parseInt ( s ) ;
  final int [ ] qs = new int [ ds ] ;
  for ( int q = Q ;
  q > 0 ;
  q -- ) {
    qs [ q ] = q ;
  }
  final int [ ] targets = new int [ Q ] ;
  for ( int d = ds ;
  d > 0 ;
  d -- ) {
    if ( ( d / 2 ) < targets [ d - 1 ] ) {
      targets [ d ] = targets [ d - 1 ] + d ;
    }
    else {
      targets [ d ] = targets [ d - 1 ] ;
    }
  }
  Collections . reverse ( targets ) ;
  int current = D ;
  boolean [ ] can_avoids = new boolean [ Q ] ;
  for ( int q : qs ) {
    if ( ( can_avoids [ q - 1 ] ) ) System . out . println ( "YES" ) ;
    else System . out . println ( "NO" ) ;
  }
  exit ( 0 ) ;
}
