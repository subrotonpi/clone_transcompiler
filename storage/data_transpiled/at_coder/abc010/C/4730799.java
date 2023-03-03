static final double getDistance ( ) {
  final String [ ] a = input . nextLine ( ) . split ( "\\s+" ) ;
  final int xa = Integer . parseInt ( a [ 0 ] ) ;
  final int ya = Integer . parseInt ( a [ 1 ] ) ;
  final int xb = Integer . parseInt ( a [ 2 ] ) ;
  final int yb = Integer . parseInt ( a [ 3 ] ) ;
  final double T = Double . parseDouble ( a [ 4 ] ) ;
  final double V = Double . parseDouble ( a [ 5 ] ) ;
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    final String [ ] pos = input . nextLine ( ) . split ( "\\s+" ) ;
    final int x = Integer . parseInt ( pos [ 0 ] ) ;
    final int y = Integer . parseInt ( pos [ 1 ] ) ;
    final double dx1 = x - xa ;
    final double dy1 = y - ya ;
    final double dx2 = xb - x ;
    final double dy2 = yb - y ;
    final double d1 = dx1 * dx1 + dy1 * dy1 ;
    final double d2 = dx2 * dx2 + dy2 * dy2 ;
    if ( Math . sqrt ( d1 ) + Math . sqrt ( d2 ) <= T * V ) {
      System . out . println ( "YES" ) ;
      System . exit ( 0 ) ;
    }
  }
  System . out . println ( "NO" ) ;
}
