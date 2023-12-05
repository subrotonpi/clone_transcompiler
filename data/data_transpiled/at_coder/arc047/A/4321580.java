public static int aTab ( int N , int L , String S ) {
  int numOpenedTabs = 1 ;
  int numCrashedBrowser = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    switch ( S . charAt ( i ) ) {
      case '+' : numOpenedTabs ++ ;
      if ( numOpenedTabs == L + 1 ) {
        numCrashedBrowser ++ ;
        numOpenedTabs = 1 ;
      }
      break ;
      case '-' : numOpenedTabs -- ;
    }
  }
  return numCrashedBrowser ;
}
