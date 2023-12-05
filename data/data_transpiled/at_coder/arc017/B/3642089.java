public static int n ( ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int r = 0 ;
  int t = - 100 ;
  int c = 0 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( t < a ) {
      c = c + 1 ;
    }
    else {
      c = 1 ;
    }
    t = a ;
    if ( c >= k ) {
      r = r + 1 ;
    }
  }
  return r ;
}
