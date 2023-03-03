public static void main ( ) {
  int x = input . nextInt ( ) ;
  int y = x / 11 ;
  x %= 11 ;
  int z = 0 ;
  if ( 0 < x && x < 7 ) {
    z = 1 ;
  }
  else if ( 6 < x && x < 11 ) {
    z = 2 ;
  }
  System . out . println ( y * 2 + z ) ;
}
