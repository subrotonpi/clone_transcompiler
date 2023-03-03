static int getInt ( ) {
  return Integer . parseInt ( input . nextLine ( ) ) ;
  /* IntList */
  IntList list = new IntList ( ) ;
  for ( String s : input . nextLine ( ) . split ( " " ) ) {
    list . add ( Integer . parseInt ( s ) ) ;
  }
  /* db */
  if ( debug ) {
    System . out . println ( list ) ;
  }
  /* count */
  int cnt = 0 ;
  int [ ] A = list . toArray ( ) ;
  int initSum = 0 ;
  int nextSum = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    nextSum = sm + A [ i + 1 ] ;
    db ( ( sm > 0 ) ? 1 : 0 ) ;
    if ( sm > 0 && nextSum >= 0 ) {
      cnt += Math . abs ( nextSum ) + 1 ;
      sm = - 1 ;
    }
    else if ( sm < 0 && nextSum <= 0 ) {
      cnt += Math . abs ( nextSum ) + 1 ;
      sm = 1 ;
    }
    else {
      sm = nextSum ;
    }
    db ( cnt ) ;
  }
  /* probC */
  int N = getInt ( ) ;
  int [ ] A = list . toArray ( ) ;
  db ( ( N == 0 ) ? 1 : 0 ) ;
  int cnt1 ;
  int cnt2 ;
  if ( A [ 0 ] != 0 ) {
    initSum = A [ 0 ] ;
  }
  else {
    initSum = 1 ;
  }
  cnt1 = count ( N , A , initSum ) ;
  db ( ( N == 0 ) ? ? ? ? ▁ or ▁ - 1 : ▁ " , cnt1 ) ; return Math . min ( cnt1 , cnt2 ) ; }