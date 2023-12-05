static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    A [ i - 1 ] -= i ;
  }
  int ans = 0 ;
  if ( Arrays . equals ( A , args ) ) {
    ans = 0 ;
  }
  else {
    int seq = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( A [ i ] == 0 ) {
        seq ++ ;
      }
      else {
        ans += ( seq + 1 ) / 2 ;
        seq = 0 ;
      }
    }
    ans += ( seq + 1 ) / 2 ;
  }
  System . out . println ( ans ) ;
}
