static final Scanner getScanner ( ) {
  final double H = Double . parseDouble ( input . nextLine ( ) ) ;
  final double W = Double . parseDouble ( input . nextLine ( ) ) ;
  input . close ( ) ;
  final Iterator < String > it = ( new Scanner ( System . in ) ) . iterator ( ) ;
  while ( it . hasNext ( ) ) {
    final double box_h = it . next ( ) ;
    final double box_w = Double . parseDouble ( input . nextLine ( ) ) ;
    if ( H <= box_h && W <= box_w ) {
      System . out . println ( "YES" ) ;
      continue ;
    }
    double ok = 0.0 , ng = 90 ;
    while ( ng - ok > 1e-12 ) {
      final double mid = ( ok + ng ) / 2 ;
      if ( W * sin ( mid ) + H * cos ( mid ) <= box_h ) {
        ok = mid ;
      }
      else {
        ng = mid ;
      }
    }
    final double _w = W * cos ( ok ) + H * cos ( radians ( 90 ) - ok ) ;
    final double _h = W * sin ( ok ) + H * cos ( ok ) ;
    if ( _w <= box_w && _h <= box_h ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
  return new Scanner ( System . in ) ;
}
