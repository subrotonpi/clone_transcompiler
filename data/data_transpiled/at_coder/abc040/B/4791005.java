static final void solve ( int n ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  int i ;
  int w ;
  int n ;
  while ( scanner . hasNextLine ( ) ) {
    n = scanner . nextInt ( ) ;
    for ( i = 1 ;
    i <= ( int ) Math . sqrt ( n ) ;
    i ++ ) {
      w = ( int ) ( n / i ) ;
      ans = Math . min ( ans , Math . abs ( i - w ) + n - ( i * w ) ) ;
    }
    System . out . println ( ans ) ;
    return ;
  }
  /* Iterate through the tokens */
  scanner . useDelimiter ( "\\s+" ) ;
  while ( scanner . hasNext ( ) ) {
    final String line = scanner . next ( ) ;
    for ( final String word : line . split ( " " ) ) {
      scanner . next ( ) ;
    }
  }
  scanner . close ( ) ;
  final List < String > tokens = scanner . getTokens ( ) ;
  n = Integer . parseInt ( ( String ) tokens . get ( 0 ) ) ;
  solve ( n ) ;
}
