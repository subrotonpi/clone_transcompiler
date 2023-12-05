public static String input ( ) {
  int n = input ( ) ;
  return ( "Yes" if ( int . parseInt ( n ) % sum ( map ( int , n ) ) == 0 ) else "No" ) ;
}
