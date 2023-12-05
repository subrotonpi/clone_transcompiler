public static int trapezoids ( int a , int b , int h ) {
  return ( a + b ) * h / 2 ;
  if ( getClass ( ) . isAnonymousClass ( ) ) {
    a = Integer . parseInt ( input . readLine ( ) ) ;
    b = Integer . parseInt ( input . readLine ( ) ) ;
    h = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int ans = trapezoids ( a , b , h ) ;
  System . out . println ( ans ) ;
  return ans ;
}
