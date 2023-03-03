static String solve ( int X , int R , int C ) {
  final int r , c ;
  if ( ( R * C ) % X != 0 ) return "RICHARD" ;
  r = Math . min ( R , C ) ;
  c = Math . max ( R , C ) ;
  if ( X < 3 ) return "GABRIEL" ;
  if ( X > 6 ) return "RICHARD" ;
  if ( ( X + 1 ) / 2 > r ) return "RICHARD" ;
  if ( c < X ) return "RICHARD" ;
  if ( X == 3 ) return "GABRIEL" ;
  if ( X == 4 ) {
    if ( r > 2 ) return "GABRIEL" ;
    else return "RICHARD" ;
  }
  if ( X == 5 ) {
    if ( r > 3 || c > 5 ) return "GABRIEL" ;
    else return "RICHARD" ;
  }
  if ( X == 6 ) {
    if ( r > 3 ) return "GABRIEL" ;
    else return "RICHARD" ;
  }
  /* main */
  final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int t : xrange ( 1 , T + 1 ) ) {
    final int X = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int R = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int C = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    System . out . println ( "Case #" + t + ": " + solve ( X , R , C ) ) ;
  }
  if ( __name__ == null ) {
    return "" ;
  }
  return "" ;
}
