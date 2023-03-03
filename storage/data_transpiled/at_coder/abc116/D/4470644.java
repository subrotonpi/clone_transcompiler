static final int [ ] [ ] getSortedArrays ( ) {
  final int N = Integer . MAX_VALUE ;
  final int K = Integer . MIN_VALUE ;
  final int [ ] [ ] TD = new int [ N ] [ K ] ;
  System . arraycopy ( TD , 0 , TD , 0 , N ) ;
  System . arraycopy ( TD , 0 , TD , 0 , K ) ;
  /* read int */
  final int [ ] [ ] TD = new int [ N ] [ K ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) TD [ i ] [ 0 ] = i ;
  /* read float */
  final float [ ] [ ] TD = new float [ N ] [ K ] ;
  for ( int i = 0 ;
  i < TD . length ;
  i ++ ) TD [ i ] [ 1 ] = i ;
  /* read str */
  final String input = "" ;
  /* write " */
  System . arraycopy ( input , 0 , TD , 0 , N ) ;
  /* read str */
  final long s = System . currentTimeMillis ( ) ;
  /* write " */
  final long [ ] ret = new long [ N ] ;
  /* read str */
  System . arraycopy ( TD , 0 , ret , 0 , N ) ;
  /* read str */
  System . arraycopy ( input , 0 , ret , N , K ) ;
  /* read str */
  final long s = System . currentTimeMillis ( ) ;
  /* write " */
  final long [ ] [ ] TD = new long [ N ] [ K ] ;
  int base = 0 ;
  final int [ ] rc = new int [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    final int t = TD [ i ] [ 1 ] ;
    final int k = TD [ i ] [ 0 ] ;
    c [ t ] ++ ;
    base += k ;
    if ( c [ t ] > 1 ) {
      rc [ N ] = new int [ k ] ;
    }
  }
  int mi = i ;
  final int [ ] ans = new int [ N ] [ ] ;
  ans [ N ] = base + c . length * 2 ;
  do {
    if ( rc . length == 0 ) break ;
    final int rt = rc [ N ] [ 0 ] ;
    final int rk = rc [ N ] [ 1 ] ;
    final int cc = c . length ;
    final int d = ( cc + 1 ) * cc - d ;
    