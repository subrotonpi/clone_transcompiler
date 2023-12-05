public static void print ( int i ) {
  int r = ( i & 0xFF ) ;
  int g = ( i & 0xFF ) ;
  int b = ( i & 0xFF ) ;
  r *= 100 ;
  g *= 10 ;
  if ( ( r + g + b ) % 4 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
