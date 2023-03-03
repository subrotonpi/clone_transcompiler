public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > words = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    words . add ( input . nextLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < words . size ( ) ;
  i ++ ) {
    String w = words . get ( i ) ;
    if ( i == 0 ) {
      continue ;
    }
    if ( words . stream ( ) . mapToInt ( String :: length ) . max ( ) . getAsInt ( ) > 1 ) {
      System . out . println ( "No" ) ;
      break ;
    }
    if ( w . charAt ( 0 ) != words . get ( i - 1 ) . charAt ( words . get ( i - 1 ) . length ( ) - 1 ) ) {
      System . out . println ( "No" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "Yes" ) ;
  }
}
