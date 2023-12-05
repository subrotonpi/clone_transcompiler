public static void main ( ) {
  int x = input . nextInt ( ) ;
  int ans = 0 ;
  ans += 2 * ( x / 11 ) ;
  if ( x % 11 == 0 ) {
    ans += 0 ;
  }
  else {
    ans += x % 11 > 6 ? 2 : 1 ;
  }
  System . out . println ( ans ) ;
}
