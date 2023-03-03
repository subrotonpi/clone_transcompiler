public static String print ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int M = Integer . parseInt ( input ( ) ) ;
  int [ ] A = new int [ M ] ;
  int [ ] B = new int [ M ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    A [ i ] = 0 ;
    B [ i ] = 0 ;
  }
  dp = new int [ N + 1 ] ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    dp [ a ] += 1 ;
  }
  for ( int b = 0 ;
  b < N ;
  b ++ ) {
    dp [ b ] += 1 ;
  }
  String ans = "YES" ;
  return ans ;
}
