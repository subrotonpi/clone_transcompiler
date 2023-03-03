private static boolean solve ( int X , int R , int C ) {
  if ( ( R * C ) % X > 0 ) return true ;
  int big = Math . max ( R , C ) ;
  int small = Math . min ( R , C ) ;
  if ( X >= 7 ) return true ;
  if ( X > big ) return true ;
  if ( X > 2 * small ) return true ;
  if ( big == small ) return false ;
  if ( big == small + 1 ) return false ;
  if ( big >= small + 2 ) {
    if ( X < 2 * small - 1 ) return false ;
    if ( X == 2 * small - 1 ) {
      if ( X == 1 ) return false ;
      if ( X == 3 ) return false ;
      if ( X == 5 ) return big <= 5 ;
    }
    if ( X == 2 * small ) {
      if ( X == 2 ) return false ;
      if ( X == 4 ) return true ;
      if ( X == 6 ) return true ;
    }
  }
  throw new AssertionError ( ) ;
}
int T = input . nextInt ( ) ;
for ( int t = 1 ;
t <= T ;
t ++ ) {
  final int X = Integer . parseInt ( input . nextLine ( ) ) ;
  final int R = Integer . parseInt ( input . nextLine ( ) ) ;
  final int C = Integer . parseInt ( input . nextLine ( ) ) ;
  final boolean s = solve ( X , R , C ) ;
  final String winner = s ? "RICHARD" : "GABRIEL" ;
  System . out . printf ( "Case #%d: %s%n" , t , winner ) ;
}
