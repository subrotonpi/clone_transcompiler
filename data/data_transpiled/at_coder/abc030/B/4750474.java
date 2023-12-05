public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  if ( n >= 12 ) {
    n -= 12 ;
  }
  double shortR = 30 * n + 0.5 * m ;
  double longR = 6 * m ;
  double result = Math . abs ( longR - shortR ) ;
  if ( result > 180 ) {
    result = 360 - result ;
  }
  System . out . println ( result ) ;
}
