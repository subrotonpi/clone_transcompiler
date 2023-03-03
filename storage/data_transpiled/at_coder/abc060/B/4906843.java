public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 1 ;
  i <= b ;
  i ++ ) {
    if ( a * i % b == c ) {
      System . out . println ( "YES" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "NO" ) ;
  return 0 ;
}
