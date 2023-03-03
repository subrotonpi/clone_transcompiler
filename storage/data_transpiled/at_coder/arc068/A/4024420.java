public static void main ( ) {
  int x = input . nextInt ( ) ;
  int ans ;
  if ( x % 11 == 0 ) {
    r = 0 ;
  }
  else if ( x % 11 <= 6 ) {
    r = 1 ;
  }
  else {
    r = 2 ;
  }
  ans = 2 * ( x / 11 ) + r ;
  System . out . println ( ans ) ;
}
