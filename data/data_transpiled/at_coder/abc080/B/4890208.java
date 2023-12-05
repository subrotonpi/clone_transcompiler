public static String N = Integer . parseInt ( input ) ;
{
  int s = 0 ;
  while ( N > 0 ) {
    s += N % 10 ;
    N /= 10 ;
  }
  return s ;
}
