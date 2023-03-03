@ VisibleForTesting static void from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  boolean [ ] hol = new boolean [ 366 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) hol [ i ] = ( i + 1 ) % 7 < 2 ;
  Instant epoch = Instant . of ( 2012 , 1 , 1 ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int m = Integer . parseInt ( input ) ;
    int d = Integer . parseInt ( input ) ;
    Instant cur = Instant . of ( 2012 , m , d ) ;
    int days = ( cur . toEpochMilli ( ) - epoch ) ;
    for ( int j = days ;
    j < 366 ;
    j ++ ) {
      if ( hol [ j ] ) continue ;
      hol [ j ] = true ;
      break ;
    }
  }
  hol = StringUtils . join ( hol , "01" ) ;
  System . out . println ( Collections . max ( hol , "0" ) ) ;
}
