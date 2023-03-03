public static int [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l = new int [ N ] , r = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    l [ i ] = a ;
    r [ i ] = b ;
  }
  Arrays . sort ( l , Collections . reverseOrder ( ) ) ;
  Arrays . sort ( r , Collections . reverseOrder ( ) ) ;
  int res = 0 ;
  int tmp = 0 ;
  int i = 0 ;
  while ( true ) {
    if ( l [ i ] > tmp ) {
      res += l [ i ] - tmp ;
      tmp = l [ i ] ;
    }
    else break ;
    if ( r [ i ] < tmp ) {
      res += tmp - r [ i ] ;
      tmp = r [ i ] ;
    }
    else break ;
    i ++ ;
  }
  res += Math . abs ( tmp ) ;
  int res0 = res ;
  res = tmp = i = 0 ;
  while ( true ) {
    if ( r [ i ] < tmp ) {
      res += tmp - r [ i ] ;
      tmp = r [ i ] ;
    }
    else break ;
    if ( l [ i ] > tmp ) {
      res += l [ i ] - tmp ;
      tmp = l [ i ] ;
    }
    else break ;
    i ++ ;
  }
  res += Math . abs ( tmp ) ;
  if ( res0 < res ) System . out . println ( res ) ;
  else System . out . println ( res0 ) ;
  return l ;
}
