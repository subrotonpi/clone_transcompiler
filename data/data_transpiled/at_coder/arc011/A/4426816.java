public static void main ( String input ) {
  int m = Integer . parseInt ( input ) ;
  int n = Integer . parseInt ( input ) ;
  int res = 0 , old = 0 ;
  while ( new + old >= m ) {
    res += n ;
    old += new ;
    new = 0 ;
    new += ( old / m ) * n ;
    old %= m ;
  }
  System . out . println ( new + res ) ;
}
