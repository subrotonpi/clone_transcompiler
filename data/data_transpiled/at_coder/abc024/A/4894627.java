public static void a ( int a , int b , int c , int k ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = a * s + t * b ;
  if ( ( s + t ) >= k ) {
    ans -= ( s + t ) * c ;
  }
  System . out . println ( ans ) ;
}
