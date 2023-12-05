public static int N ( Scanner input ) {
  int [ ] dp = new int [ 100010 ] ;
  dp [ 0 ] = 0 ;
  for ( int i = 1 ;
  i < 100010 ;
  i ++ ) {
    dp [ i ] = Double . MAX_VALUE ;
    int power = 1 ;
    while ( ( power <= i ) && ( i < dp [ i - power ] ) ) {
      dp [ i ] = Math . min ( dp [ i ] , dp [ i - power ] + 1 ) ;
      power = power * 6 ;
    }
    power = 1 ;
    while ( ( power <= i ) && ( i < dp [ i ] ) ) {
      dp [ i ] = Math . min ( dp [ i ] , dp [ i - power ] + 1 ) ;
      power = power * 9 ;
    }
  }
  System . out . println ( dp [ N ] ) ;
  return N ;
}
