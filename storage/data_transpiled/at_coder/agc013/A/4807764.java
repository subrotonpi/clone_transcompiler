public static void print ( int N ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  boolean upflag = true ;
  boolean downflag = true ;
  int answer = 1 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( A [ i ] < A [ i + 1 ] ) downflag = false ;
    if ( A [ i ] > A [ i + 1 ] ) upflag = false ;
    if ( ! ( upflag || downflag ) ) {
      answer ++ ;
      upflag = true ;
      downflag = true ;
    }
  }
  System . out . println ( answer ) ;
}
