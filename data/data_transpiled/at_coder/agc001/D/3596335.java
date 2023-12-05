public static int [ ] [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] ali = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ali [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  if ( m == 1 && ali [ 0 ] == 1 ) {
    System . out . println ( 1 ) ;
    System . out . println ( 1 ) ;
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  if ( m == 1 ) {
    System . out . println ( ali [ 0 ] ) ;
    System . out . println ( 2 ) ;
  }
  return ali ;
}
