public static void input ( ) {
  Scanner S = new Scanner ( System . in ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = - 1 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) != '1' ) {
      n = i ;
      break ;
    }
  }
  if ( n == - 1 ) {
    System . out . println ( 1 ) ;
  }
  else if ( K - 1 < n ) {
    System . out . println ( 1 ) ;
  }
  else {
    System . out . println ( S . charAt ( n ) ) ;
  }
}
