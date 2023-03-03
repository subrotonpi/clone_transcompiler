public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Arrays . stream ( args ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  if ( Arrays . stream ( a ) . mapToInt ( Integer :: parseInt ) . sum ( ) % ( n * ( n + 1 ) / 2 ) != 0 ) {
    System . out . println ( "NO" ) ;
    exit ( ) ;
  }
  int k = Arrays . stream ( a ) . mapToInt ( Integer :: parseInt ) . sum ( ) / ( n * ( n + 1 ) / 2 ) ;
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    b [ i ] = a [ i + 1 ] - a [ i ] ;
  }
  b [ n - 1 ] = a [ 0 ] - a [ n - 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b [ i ] -= k ;
  }
  int count = 0 ;
  for ( int nb : b ) {
    if ( ( - nb % n ) != 0 || nb > 0 ) {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
    count += - nb / n ;
  }
  if ( count == k ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
