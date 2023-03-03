public static void main ( String input ) {
  int A = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  int C = Integer . parseInt ( input ) ;
  int mod = 10 * * 9 + 7 ;
  int c = ( ( B * C - A * B ) * Math . pow ( A * C - B * C + A * B , mod - 2 , mod ) ) % mod ;
  int r = ( ( ( B - A ) * c - A + B ) * Math . pow ( A , mod - 2 , mod ) ) % mod ;
  System . out . println ( r + " " + c ) ;
}
