static final String input ( ) {
  long dp = 1 ;
  for ( int x : map . values ( ) ) dp |= dp << x ;
  long h = Math . ceil ( ( format . length ( ) - 1 ) / 2 ) ;
  System . out . println ( h + Integer . toBinaryString ( dp > h ) . substring ( 0 , h - 1 ) . indexOf ( '1' ) ) ;
}
