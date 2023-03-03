public static int N = Integer . parseInt ( input ) {
  int [ ] fn = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) fn [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] pn = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) pn [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] bitf = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int temp = 0 ;
    for ( int j = 0 ;
    j < 10 ;
    j ++ ) temp += ( ( 2 * j ) * fn [ i ] [ j ] ) ;
    bitf [ i ] = temp ;
  }
  int ans = ( - 1 ) * 10 * 10 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    int temp = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) temp += pn [ j ] [ i ] ;
    ans = Math . max ( ans , temp ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
