public static int [ ] A ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    System . out . println ( A [ i ] == M ? 1 : A [ i ] == m ? 3 : 2 ) ;
  }
  return A ;
}
