public static void print ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = input . nextInt ( ) ;
  }
  int count = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( a [ i ] - 1 != a [ i + 1 ] ) {
      count ++ ;
    }
  }
  final int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b [ i ] = a [ i ] ;
  }
  if ( b [ 1 ] >= 2 ) {
    count ++ ;
  }
  if ( count == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
