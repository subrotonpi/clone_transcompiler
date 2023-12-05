public static void print ( int n , int a , int b ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = input . nextLine ( ) ;
    String d = input . nextLine ( ) ;
    int x = Integer . parseInt ( d ) ;
    if ( x < a ) x = a ;
    else if ( x > b ) x = b ;
    if ( s . equals ( "West" ) ) x *= - 1 ;
    ans += x ;
  }
  if ( ans == 0 ) System . out . println ( 0 ) ;
  else if ( ans > 0 ) System . out . println ( "East" + ans ) ;
  else System . out . println ( "West" + - ans ) ;
}
