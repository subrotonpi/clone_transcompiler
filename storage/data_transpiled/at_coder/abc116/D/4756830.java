private static int sn , int tn , String ... s = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) {
  int [ ] [ ] sy_oi = new int [ sn ] [ 2 ] ;
  for ( int i = 0 ;
  i < sn ;
  i ++ ) sy_oi [ i ] [ 0 ] = s [ i * 2 ] ;
  Arrays . sort ( sy_oi , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return - o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  int [ ] [ ] cho = sy_oi [ tn - 1 ] ;
  int [ ] [ ] zan = sy_oi [ tn ] ;
  int zn = sn - tn ;
  HashMap < String , Integer > sydic = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < cho . length ;
  i ++ ) {
    if ( sydic . containsKey ( cho [ i ] [ 0 ] ) ) sydic . put ( cho [ i ] [ 0 ] , ++ sydic . get ( cho [ i ] [ 0 ] ) ) ;
    else sydic . put ( cho [ i ] [ 0 ] , 1 ) ;
  }
  int ot = Integer . MAX_VALUE ;
  int mt = sydic . size ( ) ;
  int ans = ot + mt * 2 ;
  int ci = 0 ;
  int zi = 0 ;
  while ( true ) {
    for ( int i = ci ;
    i < tn ;
    i ++ ) {
      if ( sydic . get ( cho [ i ] [ 0 ] ) > 1 ) {
        sydic . get ( cho [ i ] [ 0 ] ) -- ;
        ot -= cho [ i ] [ 1 ] ;
        ci = i + 1 ;
        break ;
      }
    }
    else break ;
    for ( int i = zi ;
    i < zn ;
    i ++ ) {
      if ( ! sydic . containsKey ( zan [ i ] [ 0 ] ) ) {
        sydic . put ( zan [ i ] [ 0 ] , 1 ) ;
        ot += zan [ i ] [ 1 ] ;
        mt ++ ;
        zi = i + 1 ;
        break ;
      }
    }
    else break ;
    ans = Math . max ( ans , ot + mt * 2 ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
