public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  if ( n > 12 ) n -= 12 ;
  int N = 360 / 12 * n + 360 / 12 * m / 60 ;
  int M = 360 / 60 * m ;
  if ( Math . abs ( N - M ) <= 180 ) System . out . println ( Math . abs ( N - M ) ) ;
  else System . out . println ( 360 - Math . abs ( N - M ) ) ;
}
