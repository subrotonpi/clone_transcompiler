public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  int now = 0 ;
  int [ ] ans = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( A [ i ] != 0 ) {
      ans [ i ] = 1 ;
      now ++ ;
    }
    else if ( now >= A [ i ] ) {
      ans [ i ] = 1 ;
      now = A [ i ] ;
    }
    else {
      ans [ i ] = - 1 ;
      break ;
    }
  }
  return ans ;
}
