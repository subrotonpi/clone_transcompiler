public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( a ) ;
  int [ ] acum = new int [ n + 1 ] ;
  acum [ n ] = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    acum [ i + 1 ] += a [ i ] ;
  }
  int ans = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] <= 2 * acum [ i + 1 ] ) {
      ans ++ ;
    }
    else {
      break ;
    }
  }
  System . out . println ( ans ) ;
}
