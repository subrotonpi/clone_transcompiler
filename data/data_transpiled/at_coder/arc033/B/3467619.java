public static void print ( String A_N , String B_N ) {
  Set < Integer > A_line = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < A_N ;
  i ++ ) {
    A_line . add ( i ) ;
  }
  for ( int i = 0 ;
  i < B_N ;
  i ++ ) {
    B_line . add ( i ) ;
  }
  Set < Integer > uni = new HashSet < Integer > ( ) ;
  uni . add ( A_line ) ;
}
