static final String input ( ) {
  int [ ] A = list ( Integer . parseInt ( input ( ) ) ) ;
  int dp = 1 ;
  for ( int x : A ) dp |= dp << x ;
  int h = Math . ceil ( sum ( A ) / 2 ) ;
  System . out . println ( h + Integer . toBinaryString ( dp >> h ) . substring ( 0 , h - 1 ) . indexOf ( '1' ) ) ;
}
