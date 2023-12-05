public static int [ ] inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int N = inpl ( ) ;
  int K = inpl ( ) ;
  final int [ ] [ ] H = new int [ K ] [ K ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = input . nextInt ( ) ;
    int y = input . nextInt ( ) ;
    char c = input . charAt ( ) ;
    x = ( int ) x ;
    y = ( int ) y ;
    boolean t = c == 'B' ;
    x %= 2 * K ;
    y %= 2 * K ;
    if ( x >= K ) {
      x -= K ;
      t = ! t ;
    }
    if ( y >= K ) {
      y -= K ;
      t = ! t ;
    }
    if ( t ) {
      H [ x ] [ y ] ++ ;
      continue ;
    }
    H [ x ] [ y ] -- ;
  }
  H = H [ K - 1 ] [ K - 1 ] ;
  H = H [ K - 1 ] ;
  for ( int i = 0 ;
  i < H . length ;
  i ++ ) {
    H [ i ] -= H [ i ] [ K - 1 ] ;
  }
  int Hans = ( N - checkH [ K - 1 ] [ K - 1 ] ) / 2 + checkH ;
  System . out . println ( Math . max ( Math . max ( Hans , N - Math . amin ( Hans ) ) ) ) ;
}
