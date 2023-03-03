public static void main ( String input ) {
  int X = Integer . parseInt ( input ) ;
  int Y = Integer . parseInt ( input ) ;
  boolean isImpossible = true ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    int N = ( int ) ( ( X / Y * 2 ) / 1 + i ) ;
    int SigmaN = N * ( N + 1 ) / 2 ;
    if ( N * X % Y == 0 && N != 0 ) {
      isImpossible = false ;
      System . out . print ( N + " " ) ;
      System . out . println ( SigmaN - ( N * X / Y ) ) ;
    }
  }
  if ( isImpossible ) System . out . println ( "Impossible" ) ;
}
