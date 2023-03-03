@ VisibleForTesting static String from ( int t , int n ) {
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int n = input . nextInt ( ) ;
    String [ ] sets = new String [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      sets [ j ] = new String ( sets [ j ] ) ;
      if ( i == 0 || sets [ j ] . length ( ) != 0 ) {
        impossible = true ;
        break ;
      }
    }
    int res = ( res * factorial [ loose [ j ] . length ( ) ] ) % MOD ;
    loose [ j ] = 0 ;
    parts ++ ;
  }
  for ( char c : alph ) {
    if ( loose [ c ] != 0 ) {
      res = ( res * factorial [ loose [ c ] . length ( ) ] ) % MOD ;
      parts ++ ;
    }
  }
  res = ( res * factorial [ parts ] ) % MOD ;
  if ( impossible ) {
    res = 0 ;
  }
  System . out . println ( "Case #" + ( t + 1 ) + ": " + res ) ;
  return res ;
}
