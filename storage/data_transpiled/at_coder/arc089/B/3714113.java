@ GwtIncompatible ( "java.util.BitSet" ) public static int [ ] [ ] input ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int K = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] m = new int [ 3 * K ] [ 3 * K ] ;
  int L = 2 * K ;
  int o = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = input [ i ] ;
    int y = input [ i + 1 ] ;
    char c = input [ i + 2 ] ;
    x = ( int ) x % L ;
    y = ( int ) y % L ;
    int t = c == 'W' ? 1 : 2 * t - 1 ;
    m [ i ] [ y ] += 2 * t ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    m [ i ] [ i ] = m [ i ] [ i ] ;
  }
  return m ;
}
