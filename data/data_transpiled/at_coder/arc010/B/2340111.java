@ Test public static void main ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  boolean [ ] hol = new boolean [ 366 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) hol [ i ] = i % 7 == 0 || i % 6 == 0 ;
  Instant epoch = Instant . of ( 2012 , 1 , 1 ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int m = Integer . parseInt ( input ( ) ) ;
    int d = Integer . parseInt ( input ( ) ) ;
    Instant cur = Instant . of ( 2012 , m , d ) ;
    int days = ( cur . toEpochMilli ( ) - epoch . toEpochMilli ( ) ) ;
    for ( int j = days ;
    j < 366 ;
    j ++ ) {
      if ( hol [ j ] ) continue ;
      hol [ j ] = true ;
      break ;
    }
  }
  hol = StringUtils . toZeroPaddedString ( hol ) ;
  System . out . println ( Math . max ( Integer . parseInt ( hol ) , 0 ) ) ;
}
