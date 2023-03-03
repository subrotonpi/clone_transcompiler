public static boolean pick ( int N , int [ ] P , int [ ] R , List < List < Integer >> Q , int size ) {
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    do {
      if ( Q . get ( i ) . size ( ) == 0 ) {
        return false ;
      }
      else if ( Q . get ( i ) . get ( 0 ) * 10 < R [ i ] * size * 9 ) {
        Q . remove ( i ) ;
      }
      else if ( Q . get ( i ) . get ( 0 ) * 10 <= R [ i ] * size * 11 ) {
        break ;
      }
      else {
        return false ;
      }
    }
    while ( Q . get ( i ) . size ( ) == 0 ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Q . remove ( i ) ;
  }
  /* solve for loop */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Q . set ( new ArrayList < Integer > ( Q . get ( i ) ) ) ;
  }
  size = 1 ;
  int cnt = 0 ;
  do {
    if ( pick ( N , P , R , Q , size ) ) {
      cnt ++ ;
    }
    else {
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        if ( Q . get ( i ) . size ( ) == 0 ) {
          return cnt ;
        }
        else {
          int a = Q . get ( i ) . get ( 0 ) * 10 ;
          int b = R [ i ] * 11 ;
          size = Math . max ( size , ( a - 1 ) / b + 1 ) ;
        }
      }
    }
  }
  while ( size > 0 ) ;
  /* main program */
  int ntest = Integer . parseInt ( input ( ) ) ;
  for ( int itest = 0 ;
  itest < ntest ;
  itest ++ ) {
    N = Integer . parseInt ( input ( ) . trim ( ) ) ;
    P = Integer . parseInt ( input ( ) ) ;
    R = Collections . singletonList ( R [ i ] ) ;
    Q = new ArrayList < List < Integer >> ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      Q . add ( Collections . singletonList ( new Integer ( input ( ) ) ) ) ;
    }
    cnt = solve ( N , P , R , Q ) ;
    System . out . println ( "Case #" + ( itest + 1 ) + ": " + cnt )