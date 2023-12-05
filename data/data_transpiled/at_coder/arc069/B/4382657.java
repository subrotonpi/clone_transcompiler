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
    ret += ans [ a ] ? "S" : "W" ;
  }
  System . out . println ( ret ) ;
  /* Next if we get the same result */
  if ( isSame ) {
    if ( isSheep ) {
      /* We want to do anything */
      ans [ 0 ] = ans [ ind - 1 ] ;
    }
    else {
      /* We want to do anything */
    }
  }
  /* Check first and last */
  ans [ 0 ] = last ;
  ans [ 1 ] = first ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    ans [ i + 1 ] = next ( i , s . charAt ( i - 1 ) == 'o' , ans [ i ] ) ;
  }
  /* Exit */
  System . out . println ( "-1" ) ;
}
