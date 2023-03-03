public static void print ( int N ) {
  int [ ] L = Integer . parseInt ( input ( ) ) ;
  boolean [ ] TF = new boolean [ 10 * 5 + 1 ] ;
  int startindex = 0 ;
  int endindex = 0 ;
  int ans = 0 ;
  int cnt = 0 ;
  while ( endindex < N ) {
    if ( TF [ L [ endindex ] ] != true ) {
      TF [ L [ endindex ] ] = true ;
      cnt ++ ;
      endindex ++ ;
      ans = Math . max ( ans , cnt ) ;
    }
    else {
      TF [ L [ startindex ] ] = false ;
      cnt -- ;
      startindex ++ ;
    }
  }
  System . out . println ( ans ) ;
}
