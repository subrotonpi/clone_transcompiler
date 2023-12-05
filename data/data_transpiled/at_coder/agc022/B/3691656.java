public static int [ ] [ ] getCandi22 ( int N ) {
  int N1 = N ;
  int [ ] candi22 = new int [ 4997 ] ;
  int [ ] candi24 = new int [ 5000 ] ;
  int [ ] candi3 = new int [ 4998 ] ;
  int [ ] candi6 = new int [ 5000 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    candi22 [ i ] = 20 + 6 * i ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    candi22 [ i ] = 4 + 6 * i ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    candi24 [ i ] = 4 + 6 * i ;
  }
  int [ ] candi3 = new int [ 4998 ] ;
  int [ ] candi6 = new int [ 5000 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    candi3 [ i ] = 15 + 6 * i ;
  }
  int [ ] ans ;
  if ( N == 3 ) {
    System . out . println ( 2 , 5 , 63 ) ;
  }
  else if ( N == 4 ) {
    System . out . println ( 2 , 5 , 20 , 63 ) ;
  }
  else if ( N >= 15000 ) {
    ans = new int [ N ] [ ] ;
    ans [ 0 ] = 2 ;
    ans [ 1 ] = 8 ;
    ans [ 2 ] = 14 ;
    ans [ 3 ] = 9 ;
    ans [ 3 ] = candi22 [ i ] + candi24 [ i ] + candi3 [ i ] + candi6 [ i ] ;
    System . arraycopy ( candi22 , 0 , ans , 2 , N - 15000 ) ;
  }
  else {
    ans = new int [ N ] [ ] ;
    ans [ 0 ] = 2 ;
    ans [ 1 ] = 8 ;
    ans [ 2 ] = 14 ;
    ans [ 3 ] = 3 ;
    ans [ 3 ] = 9 ;
  }
  N -= 5 ;
  int c22 = Math . min ( 4995 , N / 3 * 3 ) ;
  N -= c22 ;
  int c24 = Math . min ( 4998 , N / 3 * 3 ) ;
  N -= c24 ;
  int c3 = Math . min ( 4998 , N / 2 * 2 ) ;
  N -= c3 ;
  int c6 = N ;
  ans [ 0 ] = candi22 [ i ] + candi24 [ i ] + candi3 [ i ] + candi6 [ i ] ;
  ans [ 1 ] = c6