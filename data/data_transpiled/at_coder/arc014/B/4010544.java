public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > inputs = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inputs . add ( input . nextInt ( ) ) ;
  }
  List < Integer > used = new ArrayList < > ( N ) ;
  used . add ( inputs . get ( 0 ) ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( inputs . get ( i - 1 ) . intValue ( ) - 1 != inputs . get ( i ) . intValue ( ) || used . contains ( inputs . get ( i ) ) ) {
      System . out . println ( i % 2 == 0 ? "LOSE" : "WIN" ) ;
      break ;
    }
    else {
      used . add ( inputs . get ( i ) ) ;
    }
  }
  else {
    System . out . println ( "DRAW" ) ;
  }
}
