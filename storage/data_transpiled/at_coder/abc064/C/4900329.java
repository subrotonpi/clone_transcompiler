public static int [ ] getColors ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] Color = new int [ 9 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < 9 ;
    j ++ ) {
      if ( ( j == 0 ) || ( ( 1 <= A [ i ] ) && ( A [ i ] < 400 ) ) ) Color [ j ] = 1 ;
      else if ( ( 1 <= A [ i ] ) && ( A [ i ] < 400 * ( j + 1 ) ) ) Color [ j ] ++ ;
    }
  }
  int anMin ;
  int anMax ;
  if ( ( N == Color [ Color . length - 1 ] ) ) anMin = 1 ;
  else anMin = Integer . MAX_VALUE ;
  else anMax = Integer . MAX_VALUE ;
  return Color ;
}
