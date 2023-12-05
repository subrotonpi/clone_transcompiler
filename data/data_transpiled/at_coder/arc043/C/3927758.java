public static int [ ] read ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  * A = Integer . parseInt ( input . nextLine ( ) ) ;
  * B = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] C = new int [ N + 1 ] ;
  int [ ] D = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    C [ A [ i ] ] = i ;
    D [ B [ i ] ] = i ;
  }
  int [ ] data = new int [ N + 1 ] ;
  /* get the k */
  int s = 0 ;
  while ( k > 0 ) {
    s += data [ k ] ;
    k -= k & - k ;
  }
  /* add the k */
  while ( k <= N ) {
    data [ k ] += data [ k ] ;
    k += k & - k ;
  }
  int s = 0 ;
  int [ ] R = new int [ N ] ;
  for ( int i = 0 ;
  i < B . length ;
  i ++ ) {
    int b = B [ i ] ;
    int c = C [ b ] - get ( C [ b ] + 1 ) ;
    s += c ;
    R [ i ] = c ;
    /* add the k */
  }
  if ( s % 2 == 1 ) {
    System . out . println ( - 1 ) ;
    exit ( 0 ) ;
  }
  int r = s / 2 ;
  int j = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int b = i ;
    int c = C [ b ] - get ( C [ b ] + 1 ) ;
    s += c ;
    R [ i ] = c ;
    /* add the k */
  }
  if ( s % 2 == 1 ) {
    System . out . println ( - 1 ) ;
    exit ( 0 ) ;
  }
  int r = s / 2 ;
  int j = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( r < R [ i ] ) {
      j = i ;
      break ;
    }
    r -= R [ i ] ;
  }
  int [ ] V = new int [ j ] ;
  for ( int i = 0 ;
  i < j ;
  i ++ ) {
    V [ i ] = B [ i ] ;
  }
  for ( int a = 0 ;
  a < A . length ;
  a ++ ) {
    if ( D [ a ] <