public static void print ( ) {
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  int c = Integer . parseInt ( input ( ) ) ;
  int mod = 10 * * 9 + 7 ;
  int i = Math . pow ( ( b + c ) * a - b * c , mod - 2 ) ;
  int r = ( b - a ) * i % mod ;
  c = ( c - a ) ;
}
