public static void main ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  for ( int i = 2 ;
  i < n ;
  i ++ ) {
    if ( n % i == 0 ) {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "YES" ) ;
}
