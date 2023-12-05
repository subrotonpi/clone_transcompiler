static boolean solve ( int X , int R , int C ) {
  final int R = R / C ;
  final int C = C / 2 ;
  if ( X >= 7 ) return false ;
  if ( R * C % X != 0 ) return false ;
  if ( X > 2 * R ) return false ;
  if ( X > 2 * C ) return false ;
  if ( X == 1 || X == 2 || X == 3 ) return true ;
  if ( X == 4 ) return R > 2 ;
  if ( X == 5 ) {
    if ( R == 3 ) return C > 5 ;
    else return R > 3 ;
  }
  if ( X == 6 ) {
    if ( R < 4 ) return false ;
    else return true ;
  }
  if ( Class . isEnum ( "java.util.Scanner" ) ) {
    final int T = Integer . parseInt ( System . in ) ;
    for ( int t = 0 ;
    t < T ;
    t ++ ) {
      final int X = Integer . parseInt ( System . in ) ;
      final int R = Integer . parseInt ( System . in ) ;
      final int C = Integer . parseInt ( System . in ) ;
      System . out . println ( "Case #" + ( t + 1 ) + ": " + ( solve ( X , R , C ) ? "GABRIEL" : "RICHARD" ) ) ;
    }
  }
  return true ;
}
