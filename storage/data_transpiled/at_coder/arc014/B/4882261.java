public static void main ( String input ) {
  N = Integer . parseInt ( input ) ;
  Set < String > di = new HashSet < String > ( ) ;
  String [ ] w = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    w [ i ] = input . split ( " " ) ;
  }
  Set < String > newWSet = new HashSet < String > ( ) ;
  newWSet . add ( w [ 0 ] ) ;
  char lastc = w [ 0 ] . charAt ( w [ 0 ] . length ( ) - 1 ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( ( ! w [ i ] . equals ( lastc ) ) && ( w [ i ] . charAt ( 0 ) == lastc ) ) {
      lastc = w [ i ] . charAt ( w [ i ] . length ( ) - 1 ) ;
      newWSet . add ( w [ i ] ) ;
    }
    else {
      System . out . println ( "WIN" ) ;
      break ;
    }
  }
}
