public static int [ ] getA ( ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ L ] ;
  int [ ] B = new int [ R ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) A [ i ] = i ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) B [ i ] = i ;
  int [ ] tmp1 = new int [ 100 ] ;
  int [ ] tmp2 = new int [ 100 ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) tmp1 [ A [ i ] - 1 ] ++ ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) tmp2 [ B [ i ] - 1 ] ++ ;
  int res = 0 ;
  for ( int i = 0 ;
  i < 100 ;
  i ++ ) {
    res += Math . min ( tmp1 [ i ] , tmp2 [ i ] ) ;
  }
  System . out . println ( res ) ;
  return tmp1 ;
}
