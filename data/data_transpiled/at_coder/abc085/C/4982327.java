public static int n ( ) {
  int y = Integer . parseInt ( input . nextLine ( ) ) , A = y / 10000 + 1 ;
  int a = - 1 ;
  int b = - 1 ;
  int c = - 1 ;
  for ( int i = 0 ;
  i < A + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < n - i + 1 ;
    j ++ ) {
      int k = n - i - j ;
      if ( i * 10000 + j * 5000 + k * 1000 == y && k >= 0 ) {
        a = i ;
        b = j ;
        c = k ;
      }
    }
  }
  return a + b + c ;
}
