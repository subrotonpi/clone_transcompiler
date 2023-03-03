static final int [ ] [ ] getChars ( ) {
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  char [ ] s = new char [ R ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) s [ i ] = input . charAt ( i ) ;
  int [ ] [ ] cs = new int [ R + C + 1 ] [ R + C + 1 ] ;
  for ( int i = 0 , j = 0 ;
  i < C ;
  i ++ ) {
    if ( s [ i ] [ j ] == 'x' ) cs [ C + i - j ] [ i + j + 1 ] = 1 ;
  }
  cs = Arrays . copyOf ( cs , C ) ;
  cs = Arrays . copyOf ( cs , C ) ;
  int ans = 0 ;
  int k = K - 1 ;
  for ( int i = R , j = k ;
  i < C ;
  j = k ) {
    int x = C + i - j ;
    int y = i + j + 1 ;
    int rec = cs [ x + k ] [ y + k ] ;
    rec -= cs [ x + k ] [ y - k - 1 ] ;
    rec -= cs [ x - k - 1 ] [ y + k ] ;
    rec += cs [ x - k - 1 ] [ y - k - 1 ] ;
    if ( rec == 0 ) ans ++ ;
  }
  System . out . println ( ans ) ;
  return cs ;
}
