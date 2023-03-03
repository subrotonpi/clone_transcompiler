public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > S = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S . add ( input . nextInt ( ) ) ;
  }
  int before = S . get ( 0 ) . intValue ( ) - 1 ;
  boolean ruleBreakFlag = false ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( S . contains ( S . get ( i ) ) || before != S . get ( i ) . intValue ( ) ) {
      ruleBreakFlag = true ;
      break ;
    }
    before = S . get ( i ) . intValue ( ) - 1 ;
  }
  if ( ruleBreakFlag ) {
    if ( i % 2 != 0 ) {
      System . out . println ( "WIN" ) ;
    }
    else {
      System . out . println ( "LOSE" ) ;
    }
  }
  else {
    System . out . println ( "DRAW" ) ;
  }
}
