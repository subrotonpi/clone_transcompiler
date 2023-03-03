public static void main ( String input ) {
  N = Integer . parseInt ( input ) ;
  D = Integer . parseInt ( input ) ;
  X = Integer . parseInt ( input ) ;
  int M = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A = Integer . parseInt ( input ) ;
    for ( int j = 0 ;
    j < 100 ;
    j ++ ) {
      if ( ( A * j + 1 ) <= D ) {
        M ++ ;
      }
      else {
        break ;
      }
    }
  }
  System . out . println ( M + X ) ;
}
