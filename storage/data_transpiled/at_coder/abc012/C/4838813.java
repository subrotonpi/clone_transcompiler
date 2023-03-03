public static int N = Integer . parseInt ( input ) {
  int n = 2025 - N ;
  for ( int a = 1 ;
  a <= 10 ;
  a ++ ) {
    for ( int b = 1 ;
    b <= 10 ;
    b ++ ) {
      if ( a * b == n ) {
        System . out . println ( a + "x" + b ) ;
      }
    }
  }
  return n ;
}
