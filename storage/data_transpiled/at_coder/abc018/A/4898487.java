public static void main ( String [ ] args ) {
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    numbers [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  ArrayList < Integer > sNumbers = new ArrayList < Integer > ( numbers ) ;
  Collections . sort ( sNumbers ) ;
  for ( int i = 0 ;
  i < numbers . size ( ) ;
  i ++ ) {
    System . out . println ( ( sNumbers . indexOf ( numbers . get ( i ) ) ) + 1 ) ;
  }
}
