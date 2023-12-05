public static int input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int p = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int odd_count = a . length ;
  if ( p == 0 ) {
    if ( odd_count == 0 ) {
      System . out . println ( 2 * ( n - odd_count ) ) ;
    }
    else {
      System . out . println ( ( 2 * ( n - odd_count ) ) * ( 2 * ( odd_count - 1 ) ) ) ;
    }
  }
  else {
    if ( odd_count == 0 ) {
      System . out . println ( 0 ) ;
    }
    else {
      System . out . println ( ( 2 * ( n - odd_count ) ) * ( 2 * ( odd_count - 1 ) ) ) ;
    }
  }
  return p ;
}
