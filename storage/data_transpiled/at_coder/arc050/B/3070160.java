public static int R = Integer . parseInt ( input ) {
  int x = Integer . parseInt ( input . readLine ( ) ) ;
  int y = Integer . parseInt ( input . readLine ( ) ) ;
  /* if (r-l<=1) return l; */
  int m = ( l + r ) / 2 ;
  if ( B < m ) {
    /* search sub */
    return l ;
  }
  else {
    int t = ( B - m ) / y ;
    if ( R - t >= m * x ) {
      /* search sub */
      return m ;
    }
    else {
      /* search */
      return l ;
    }
  }
  if ( R >= x ) {
    int d = searchsub ( 0 , R / x + 1 ) ;
    System . out . println ( d + ( B - d ) / y ) ;
  }
  else {
    System . out . println ( Math . min ( R , B / y ) ) ;
  }
  return 0 ;
}
