public static int N = Integer . parseInt ( input ) {
  int s = 0 ;
  int [ ] L = new int [ N ] ;
  int a = 2 ;
  for ( int i = 0 ;
  i < N - 2 ;
  i ++ ) {
    while ( ! ( a % 2 == 0 || a % 3 == 0 || a % 5 == 0 ) ) {
      a ++ ;
    }
    L [ i ] = a ;
    s += a ;
    a ++ ;
  }
  while ( ( ! ( a % 2 == 0 || a % 3 == 0 || a % 5 == 0 ) ) || ( ! ( ( a + s ) % 2 == 0 || ( a + s ) % 3 == 0 || ( a + s ) % 5 == 0 ) ) ) {
    a ++ ;
  }
  int m ;
  m = 2 ;
  L [ m ] = a ;
  System . out . println ( Arrays . toString ( L ) ) ;
  return s ;
}
