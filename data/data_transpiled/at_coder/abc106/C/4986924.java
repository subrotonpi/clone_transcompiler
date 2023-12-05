public static void input ( Scanner input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int oneRow = 0 ;
  for ( int i = 0 ;
  i <= S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == '1' ) {
      oneRow ++ ;
    }
    else {
      break ;
    }
  }
  if ( K <= oneRow ) {
    System . out . println ( 1 ) ;
  }
  else {
    System . out . println ( Integer . parseInt ( S . charAt ( oneRow ) ) ) ;
  }
}
