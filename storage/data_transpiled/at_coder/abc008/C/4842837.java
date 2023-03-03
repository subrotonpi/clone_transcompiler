public static int N = Integer . parseInt ( input ) {
  int [ ] c = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) c [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] e = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) e [ i ] = 0 ;
  for ( int cc : c ) {
    if ( c [ i ] % cc == 0 ) c [ i ] -= 1 ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) ans += ( e [ i ] / 2 + 1 ) / ( e [ i ] + 1 ) ;
  return ans ;
}
