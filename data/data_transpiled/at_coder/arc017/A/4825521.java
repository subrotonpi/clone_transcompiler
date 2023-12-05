public static int n ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n == 1 ) {
    System . out . println ( "YES" ) ;
    exit ( ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( n % i == 0 ) {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "YES" ) ;
  return 0 ;
}
