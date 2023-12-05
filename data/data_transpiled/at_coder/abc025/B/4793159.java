public static void print ( int n , int a , int b ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = input . nextLine ( ) ;
    String d = input . nextLine ( ) ;
    d = Integer . parseInt ( d ) ;
    if ( d < a ) d = a ;
    if ( d > b ) d = b ;
    if ( s . equals ( "East" ) ) ans += d ;
    else ans -= d ;
  }
  if ( ans > 0 ) System . out . println ( "East" + ans ) ;
  else if ( ans < 0 ) System . out . println ( "West" + - ans ) ;
  else System . out . println ( 0 ) ;
}
