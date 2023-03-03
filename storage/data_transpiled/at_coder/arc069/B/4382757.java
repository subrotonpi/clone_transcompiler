static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) . substring ( 0 , s . length ( ) - 1 ) ;
  int [ ] ans = new int [ N + 2 ] ;
  Arrays . fill ( ans , 1 ) ;
  /* Print ans */
  String ret = "" ;
  for ( int a = 1 ;
  a < ans . length - 1 ;
  a ++ ) {
    ret += a > 0 ? "S" : "W" ;
  }
  System . out . println ( ret ) ;
  /* Next is the same or sheep */
  next ( ind , isSame , isSheep ) ;
  /* Check first and last */
  ans [ 0 ] = last ;
  ans [ 1 ] = first ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    for ( int j = 0 ;
    j <= N ;
    j ++ ) {
      if ( check ( j , first , last ) ) {
        /* Check ans */
        printAnts ( ans ) ;
        exit ( ) ;
      }
    }
  }
  System . out . println ( "-1" ) ;
}
