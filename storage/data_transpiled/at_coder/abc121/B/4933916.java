public static int n ( ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] [ i ] = 1 ;
  }
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int total = 0 ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      total += a [ i ] [ j ] * b [ j ] ;
    }
    total += c ;
    if ( total > 0 ) {
      count ++ ;
    }
  }
  return count ;
}
