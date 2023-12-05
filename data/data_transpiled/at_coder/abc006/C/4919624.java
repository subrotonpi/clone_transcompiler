public static int [ ] [ ] input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) , m = Integer . parseInt ( input . readLine ( ) ) ;
  if ( 2 * n == m ) {
    System . out . println ( n , 0 , 0 ) ;
    exit ( ) ;
  }
  else if ( 3 * n == m ) {
    System . out . println ( 0 , n , 0 ) ;
  }
  return null ;
}
