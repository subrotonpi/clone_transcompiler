public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    A [ i ] = i ;
  }
  int [ ] need = {
    0 , 2 , 5 , 5 , 4 , 5 , 6 , 3 , 7 , 6 }
    ;
    int [ ] dp = new int [ N + 1 ] ;
    dp [ 0 ] = - 1 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int a : A ) {
        if ( i + need [ a ] <= N ) {
          dp [ i + need [ a ] ] = Math . max ( dp [ i + need [ a ] ] , dp [ i ] * 10 + a ) ;
        }
      }
    }
    return dp ;
  }
  