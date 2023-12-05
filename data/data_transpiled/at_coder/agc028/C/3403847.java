public static double [ ] [ ] getDoubleArray ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] [ ] b = new double [ n ] [ n ] ;
  double ASUM = 0 ;
  double BSUM = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    b [ i ] [ 0 ] = x ;
    b [ i ] [ 1 ] = i ;
    b [ i ] [ 2 ] = y ;
    ASUM += x ;
    BSUM += y ;
  }
  ArrayList < Double [ ] > a = new ArrayList < Double [ ] > ( b ) ;
  int [ ] tuka = new int [ n ] ;
  int flag = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( tuka [ a . get ( i ) [ 1 ] ] == 1 ) {
      flag = 1 ;
      break ;
    }
    else {
      tuka [ a . get ( i ) [ 1 ] ] = 1 ;
    }
  }
  double ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans += a . get ( i ) [ 0 ] ;
  }
  if ( flag == 0 ) {
    double tmp = Double . MAX_VALUE ;
    double [ ] las = a . get ( n - 1 ) ;
    double [ ] bu = a . get ( n - 2 ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( las [ 1 ] == i ) {
        tmp = Math . min ( tmp , Math . max ( b [ i * 2 ] [ 0 ] , b [ i * 2 + 1 ] [ 0 ] ) - bu [ 0 ] ) ;
      }
      else {
        tmp = Math . min ( tmp , Math . max ( b [ i * 2 ] [ 0 ] , b [ i * 2 + 1 ] [ 0 ] ) - las [ 0 ] ) ;
      }
    }
    ans += tmp ;
  }
  ans = Math . min ( ans , ASUM , BSUM ) ;
  System . out . println ( ans ) ;
  return b ;
}
