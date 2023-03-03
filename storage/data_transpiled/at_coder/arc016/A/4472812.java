public static void ans ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( ( i != M ) && ( i != N ) ) {
      System . out . println ( i ) ;
      break ;
    }
  }
}
