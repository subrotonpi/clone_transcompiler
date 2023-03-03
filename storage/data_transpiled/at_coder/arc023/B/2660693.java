public static int [ ] [ ] a ( ) {
  int r = Integer . parseInt ( input . nextLine ( ) ) , c = Integer . parseInt ( input . nextLine ( ) ) , d = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ r ] [ c ] ;
  for ( int j = 0 ;
  j < r ;
  j ++ ) {
    for ( int i = 0 ;
    i < c ;
    i ++ ) {
      if ( j > 1 ) {
        a [ j ] [ i ] = Math . max ( a [ j ] [ i ] , a [ j - 2 ] [ i ] ) ;
      }
      if ( i > 1 ) {
        a [ j ] [ i ] = Math . max ( a [ j ] [ i ] , a [ j ] [ i - 2 ] ) ;
      }
      if ( i > 0 && j > 0 ) {
        a [ j ] [ i ] = Math . max ( a [ j ] [ i ] , a [ j - 1 ] [ i - 1 ] ) ;
      }
    }
  }
  if ( d + 2 > r + c ) d = r + c - 2 - ( r + c + d ) % 2 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i <= d ;
  i ++ ) {
    int j = d - i ;
    if ( j < r && i < c ) ans = Math . max ( ans , a [ j ] [ i ] ) ;
  }
  System . out . println ( ans ) ;
  return a ;
}
