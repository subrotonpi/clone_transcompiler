public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int g = M / N ;
  g > 0 ;
  g -- ) {
    if ( M % g == 0 ) {
      System . out . println ( g ) ;
      return ;
    }
  }
  if ( getClass ( ) . isAnonymousClass ( ) ) {
    main ( ) ;
  }
}
