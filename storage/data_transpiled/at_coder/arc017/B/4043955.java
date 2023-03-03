public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int base = 0 ;
  int length = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int item = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( item > base ) {
      base = item ;
      length ++ ;
      if ( length >= K ) ans ++ ;
    }
    else {
      base = item ;
      length = 1 ;
      if ( length >= K ) ans ++ ;
    }
  }
  return ans ;
}
