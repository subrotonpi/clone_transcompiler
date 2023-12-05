public static int [ ] [ ] getStdIn ( int n , int d , int k ) {
  int [ ] [ ] LR = new int [ d ] [ n ] ;
  for ( int i = 0 ;
  i < d ;
  i ++ ) {
    LR [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int [ ] [ ] ST = new int [ k ] [ n ] ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    ST [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int [ ] ans = new int [ k ] ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    int [ ] L = LR [ i ] ;
    int [ ] R = LR [ i ] ;
    for ( int j = 0 ;
    j < k ;
    j ++ ) {
      int [ ] S = ST [ j ] ;
      int [ ] T = ST [ j ] ;
      if ( S < T ) {
        if ( L <= S && S < R ) {
          ST [ j ] [ 0 ] = Math . min ( T , R ) ;
          if ( ST [ j ] [ 0 ] == T ) ans [ j ] = i + 1 ;
        }
      }
      else if ( S > T ) {
        if ( L < S && S <= R ) {
          ST [ j ] [ 0 ] = Math . max ( T , L ) ;
          if ( ST [ j ] [ 0 ] == T ) ans [ j ] = i + 1 ;
        }
      }
    }
  }
  for ( int x : ans ) {
    System . out . println ( x ) ;
  }
  return ans ;
}
