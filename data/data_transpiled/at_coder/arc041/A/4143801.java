public static void print ( int x , int y ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans ;
  if ( y >= k ) {
    ans = x + k ;
  }
  else {
    k -= y ;
    x -= k ;
    ans = x + y ;
  }
  System . out . println ( ans ) ;
}
