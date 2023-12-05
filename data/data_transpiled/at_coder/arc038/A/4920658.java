public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  a = new ArrayList < > ( a ) ;
  a . sort ( ) ;
  int firstPlayer = 0 ;
  int secondPlayer = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      firstPlayer += a [ i ] ;
    }
    else {
      secondPlayer += a [ i ] ;
    }
  }
  System . out . println ( firstPlayer ) ;
}
