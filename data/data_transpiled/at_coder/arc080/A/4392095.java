public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Integer . parseInt ( input ) ) ;
  }
  int tn = Lists . newArrayList ( ) . stream ( ) . filter ( x -> x % 2 == 0 && x % 4 != 0 ) . count ( ) ;
  int tf = Lists . newArrayList ( ) . stream ( ) . filter ( x -> x % 4 == 0 ) . count ( ) ;
  if ( tn == 0 && ( N - tn ) / 2 <= tf ) {
    System . out . println ( "Yes" ) ;
  }
  else if ( tn != 0 && 2 * tf >= N - tn ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
