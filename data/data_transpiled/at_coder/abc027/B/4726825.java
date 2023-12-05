public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Arrays . binarySearch ( a , a ) % n != 0 ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  if ( a . length == n ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int p = Arrays . binarySearch ( a , a ) / n ;
  int count = 0 ;
  while ( a . length > 0 ) {
    if ( a [ a . length - 1 ] == p ) {
      a [ a . length - 1 ] = 0 ;
      continue ;
    }
    int tmp = 1 ;
    int sums = a [ a . length - 1 ] ;
    a [ a . length - 1 ] = sums ;
    while ( true ) {
      if ( sums == tmp * p ) break ;
      tmp ++ ;
      sums += a [ a . length - 1 ] ;
    }
    count += tmp - 1 ;
  }
  System . out . println ( count ) ;
}
