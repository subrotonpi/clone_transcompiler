public static int [ ] inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int N = Integer . parseInt ( input ) ;
  int [ ] a = inpl ( ) ;
  int [ ] b = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) b [ i ] = a [ i ] ;
  int [ ] left = new int [ N + 2 ] ;
  int [ ] right = new int [ N + 2 ] ;
  for ( int i = N ;
  i > 0 ;
  i -- ) {
    int x = b [ i ] ;
    ans += i * ( right [ x ] - x + 1 ) * ( x - left [ x ] + 1 ) ;
    right [ left [ x ] - 1 ] = right [ x ] ;
    left [ right [ x ] + 1 ] = left [ x ] ;
  }
  System . out . println ( ans ) ;
}
