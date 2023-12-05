public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = Integer . parseInt ( input ) ;
  int ans = ( 200 * 200 ) * 100 ;
  for ( int i = - 100 ;
  i < 101 ;
  i ++ ) {
    int tmp = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) tmp += ( A [ j ] - i ) * ( A [ j ] - i ) ;
    ans = Math . min ( ans , tmp ) ;
  }
  System . out . println ( ans ) ;
}
