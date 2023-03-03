static final int [ ] getCounts ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  Counter < Integer > counterA = new Counter < Integer > ( A ) ;
  int diversity = counterA . size ( ) - K ;
  int ans = 0 ;
  if ( diversity <= 0 ) {
    System . out . println ( ans ) ;
    exit ( ) ;
  }
  return A ;
}
