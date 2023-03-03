public static int N = Integer . parseInt ( input ) {
  int val = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    val *= i ;
    val %= 1000000007 ;
  }
  return val ;
}
