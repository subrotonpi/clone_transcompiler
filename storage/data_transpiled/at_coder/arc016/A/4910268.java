public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( i != m ) {
      System . out . println ( i ) ;
      return ;
    }
  }
  if ( getClass ( ) . isAnonymousClass ( ) ) {
    new Main ( ) ;
  }
}
