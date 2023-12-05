public static void fun ( ) {
  System . out . println ( "ac" ) ;
  System . out . println ( "ac" ) ;
  System . out . println ( "ac" ) ;
  System . out . println ( "ac" ) ;
  System . out . println ( "ac" ) ;
  System . out . println ( "ac" ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  if ( N * 2 >= M ) {
    System . out . println ( M / 2 ) ;
  }
  else {
    int result = N + ( M - 2 * N ) / 4 ;
    System . out . println ( result ) ;
  }
}
