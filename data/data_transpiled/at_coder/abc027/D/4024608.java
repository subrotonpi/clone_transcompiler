public static void input ( Scanner s ) {
  int n = s . nextInt ( ) ;
  int [ ] plus = new int [ n ] ;
  int [ ] minus = new int [ n ] ;
  int [ ] diff = new int [ n ] ;
  int pCnt = 0 ;
  int mCnt = 0 ;
  for ( int i = 0 ;
  i < s . nextInt ( ) ;
  i ++ ) {
    char w = s . next ( ) ;
    if ( w == '+' ) pCnt ++ ;
    else if ( w == '-' ) mCnt ++ ;
    plus [ i ] = pCnt ;
    minus [ i ] = mCnt ;
    diff [ i ] = pCnt - mCnt ;
  }
  int [ ] d = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . next ( ) == 'M' ) d [ i ] = diff [ i ] ;
  }
}
