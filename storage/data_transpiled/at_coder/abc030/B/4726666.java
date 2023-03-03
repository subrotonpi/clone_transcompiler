public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  if ( Math . abs ( ( 30 * n + 0.5 * m ) - 6 * m ) % 360 == 180 ) {
    System . out . println ( 180 ) ;
    exit ( ) ;
  }
  if ( Math . abs ( ( 30 * n + 0.5 * m ) - 6 * m ) % 360 == 0 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  if ( Math . abs ( ( 30 * n + 0.5 * m ) - 6 * m ) % 360 < 180 ) {
    System . out . println ( Math . abs ( ( 30 * n + 0.5 * m ) - 6 * m ) % 360 ) ;
  }
  else {
    System . out . println ( 360 - Math . abs ( ( 30 * n + 0.5 * m ) - 6 * m ) % 360 ) ;
  }
}
