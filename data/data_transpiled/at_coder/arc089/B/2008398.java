static final int [ ] [ ] getMatrix ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] m = new int [ 3 * K ] [ 3 * K ] ;
  int L = 2 * K ;
  int o = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = input . nextInt ( ) ;
    int y = input . nextInt ( ) ;
    x = ( int ) x % L ;
    y = ( int ) y % L ;
    int t = c == 'W' ? 1 : 2 * t ;
    m [ x ] [ y ] += 1 - 2 * t ;
    o += t ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    m [ i ] [ 0 ] = m [ i ] [ 1 ] ;
  }
  m [ i ] [ 0 ] = m [ i ] [ 0 ] ;
  System . out . println ( o + ( m [ i ] [ 1 ] + m [ i ] [ 2 ] ) ) ;
  return m ;
}
