public static Piece winner ( int X , int S , int L ) {
  if ( S * L % X > 0 ) return Piece . RICHARD ;
  if ( X <= 2 ) return Piece . GABRIEL ;
  if ( X >= 7 ) return Piece . RICHARD ;
  if ( L < X ) return Piece . RICHARD ;
  if ( 2 * S <= X ) return Piece . RICHARD ;
  if ( ( X = X ) == ( S = S ) && ( L = L ) == ( 5 ) ) return Piece . RICHARD ;
  if ( 2 * S <= X ) return Piece . GABRIEL ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    X = Integer . parseInt ( input . nextLine ( ) ) ;
    int R = Integer . parseInt ( input . nextLine ( ) ) ;
    int C = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( "Case #" + testCase + ": " + winner ( X , min ( R , C ) , max ( R , C ) ) ) ;
  }
  return Piece . GABRIEL ;
}
