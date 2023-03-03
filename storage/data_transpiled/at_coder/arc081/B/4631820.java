public static int getN ( ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > S = new LinkedList < Integer > ( ) ;
  S . add ( input ) ;
  List < Integer > d = new ArrayList < Integer > ( ) ;
  int i = 0 ;
  while ( i < N - 1 ) {
    if ( S . get ( i ) == S . get ( i + 1 ) ) {
      d . add ( 2 ) ;
      i ++ ;
    }
    else {
      d . add ( 1 ) ;
    }
    i ++ ;
  }
  if ( N - 1 - i == 0 ) {
    d . add ( 1 ) ;
  }
  int n = d . size ( ) ;
  int dp ;
  if ( d . get ( 0 ) == 1 ) {
    dp = 3 ;
  }
  else {
    dp = 6 ;
  }
  for ( i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( d . get ( i ) == 1 ) {
      dp = dp * 2 ;
    }
    else if ( d . get ( i ) == 2 && d . get ( i + 1 ) == 2 ) {
      dp = dp * 3 ;
    }
    else {
    }
    dp = dp % 1000000007 ;
  }
  System . out . println ( dp ) ;
  return dp ;
}
