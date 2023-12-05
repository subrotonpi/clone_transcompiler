public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Arrays . stream ( args ) . mapToInt ( m -> Integer . parseInt ( m ) ) . toArray ( ) ;
  int [ ] p = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i == n - 1 ) {
      p [ i ] = a [ 0 ] - a [ n - 1 ] ;
    }
    else {
      p [ i ] = a [ i + 1 ] - a [ i ] ;
    }
  }
  int k = Arrays . stream ( a ) . mapToInt ( Integer :: parseInt ) . sum ( ) / ( ( n * ( n + 1 ) ) / 2 ) ;
  if ( Integer . parseInt ( k ) != k ) {
    System . out . println ( "NO" ) ;
    exit ( ) ;
  }
  m = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int mi = ( k - p [ i ] ) / n ;
    if ( Integer . parseInt ( mi ) != mi || mi < 0 ) {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
    else {
      m [ i ] = mi ;
    }
  }
  if ( Arrays . stream ( m ) . mapToInt ( Integer :: parseInt ) . sum ( ) == k ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
