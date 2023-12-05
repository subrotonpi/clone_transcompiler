public static int [ ] [ ] getBanks ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] boss = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) boss [ i ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    boss [ a - 1 ] [ i ] = i + 2 ;
  }
  int [ ] [ ] salary = new int [ n ] [ n ] ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    if ( boss [ i ] . length == 0 ) salary [ i ] = 1 ;
    else if ( boss [ i ] . length == 1 ) salary [ i ] = salary [ boss [ i ] . length - 1 ] * 2 + 1 ;
    else {
      int [ ] pool = new int [ boss [ i ] . length ] ;
      for ( int b = 0 ;
      b < boss [ i ] . length ;
      b ++ ) pool [ b ] = salary [ b - 1 ] ;
      salary [ i ] += max ( pool ) + min ( pool ) + 1 ;
    }
  }
  return salary ;
}
