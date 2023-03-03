public static int [ ] [ ] getDigits ( ) {
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  if ( H % h == 0 && W % w == 0 ) {
    System . out . println ( "No" ) ;
  }
  else {
    System . out . println ( "Yes" ) ;
    int [ ] [ ] ans = new int [ H ] [ W ] ;
    for ( int i = 0 ;
    i < H ;
    i += h ) ans [ i ] = new int [ w ] ;
    int num = 0 ;
    for ( int i = h - 1 ;
    i < H ;
    i += h ) for ( int j = w - 1 ;
    j < W ;
    j += w ) ans [ i ] [ j ] = - ( h * w - 1 ) * 1000 - 1 ;
    num ++ ;
    for ( int [ ] nu : ans ) System . out . println ( Arrays . toString ( nu ) ) ;
    return ans ;
  }
}
