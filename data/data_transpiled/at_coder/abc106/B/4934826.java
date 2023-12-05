public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] dp = new int [ N + 1 ] ;
  int ans = 0 ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    int div = 1 ;
    while ( i * div <= N ) {
      dp [ i * div ] ++ ;
      div ++ ;
    }
    if ( dp [ i ] == 8 && i % 2 == 1 ) ans ++ ;
  }
  System . out . println ( ans ) ;
  if ( getClass ( ) . isClassPresent ( MainApp . class ) ) {
    MainApp . main ( ) ;
  }
}
