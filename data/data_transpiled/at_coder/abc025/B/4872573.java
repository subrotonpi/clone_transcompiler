public static void print ( int N , String A , String B ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String s = input . nextLine ( ) ;
    String d = input . nextLine ( ) ;
    d = Integer . parseInt ( d ) ;
    if ( d < A ) d = A ;
    else if ( d > B ) d = B ;
    if ( s . equals ( "East" ) ) ans += d ;
    else ans -= d ;
  }
  if ( ans > 0 ) System . out . println ( "East" + " " + ans ) ;
  else if ( ans == 0 ) System . out . println ( 0 ) ;
  else if ( ans < 0 ) System . out . println ( "West" + " " + Math . abs ( ans ) ) ;
}
