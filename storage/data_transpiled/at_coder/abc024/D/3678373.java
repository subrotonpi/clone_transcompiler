public static int A = Integer . parseInt ( input ) ;
int C = Integer . parseInt ( input ) ;
int B = Integer . parseInt ( input ) ;
int mod = 10 * 9 + 7 ;
/* power of two integers */
if ( B == 0 ) {
  return 1 ;
}
else if ( B == 1 ) {
  return A % mod ;
}
else if ( B % 2 == 0 ) {
  return power ( A , B / 2 ) * B % mod ;
}
else {
  return ( power ( A , B / 2 ) * B ) % mod ;
}
}
