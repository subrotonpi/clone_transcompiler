public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < String > AB = new ArrayList < > ( ) ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) AB . add ( String . valueOf ( j ) ) ;
  int M = Integer . parseInt ( input ) ;
  List < String > CD = new ArrayList < > ( ) ;
  for ( int j = 0 ;
  j < M ;
  j ++ ) CD . add ( String . valueOf ( j ) ) ;
  int ans = 0 ;
  for ( String i : AB ) {
    if ( ans < AB . stream ( ) . mapToInt ( i ) . max ( ) - CD . stream ( ) . mapToInt ( i ) . sum ( ) ) ans = AB . stream ( ) . mapToInt ( i ) . max ( ) ;
  }
  System . out . println ( ans ) ;
}
