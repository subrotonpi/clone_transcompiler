public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  if ( n >= 12 ) n -= 12 ;
  double N = 360 * n / 12 + 30 * m / 60 ;
  double M = 360 * m / 60 ;
  if ( Math . abs ( N - M ) <= 180 ) System . out . println ( Math . abs ( N - M ) ) ;
  else System . out . println ( 360 - Math . abs ( N - M ) ) ;
}
