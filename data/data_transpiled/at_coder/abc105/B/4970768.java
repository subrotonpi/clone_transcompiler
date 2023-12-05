public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  boolean flag = false ;
  for ( int i = 0 ;
  i < N / 4 + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < N / 7 + 1 ;
    j ++ ) {
      if ( 4 * i + 7 * j == N ) {
        flag = true ;
      }
    }
  }
  if ( flag ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
