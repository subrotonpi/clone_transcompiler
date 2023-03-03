public static void main ( String input ) {
  N = Integer . parseInt ( input ) ;
  D = Integer . parseInt ( input ) ;
  X = Integer . parseInt ( input ) ;
  int choco = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A = Integer . parseInt ( input ) ;
    for ( int j = 0 ;
    j < 101 ;
    j ++ ) {
      if ( 1 + j * A <= D ) {
        choco ++ ;
      }
      else {
        break ;
      }
    }
  }
  System . out . println ( choco + X ) ;
}
