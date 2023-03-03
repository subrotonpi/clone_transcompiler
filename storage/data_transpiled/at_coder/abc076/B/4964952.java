public static int num ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int k = Integer . parseInt ( input ( ) ) ;
  while ( num <= k && n > 0 ) {
    num *= 2 ;
    n -- ;
  }
  while ( n > 0 ) {
    num += k ;
    n -- ;
  }
  return num ;
}
