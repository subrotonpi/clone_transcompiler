public static void print ( int a , int b , int c , int k ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( s + t > k - 1 ) {
    System . out . println ( s * a + t * b - ( s + t ) * c ) ;
  }
  else {
    System . out . println ( s * a + t * b ) ;
  }
}
