public static double x = Integer . parseInt ( input ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) , y = Integer . parseInt ( input . nextLine ( ) ) ;
  double cnt = Double . MAX_VALUE ;
  for ( int first = - 1 , addCntF = 1 ;
  first < 0 ;
  first ++ ) {
    double xx = x * first ;
    for ( int last = - 1 , addCntL = 1 ;
    last < 0 ;
    last ++ , addCntL = 1 ) {
      double yy = y * last ;
      if ( yy >= xx ) {
        cnt = Math . min ( cnt , addCntF + addCntL + yy - xx ) ;
      }
    }
  }
  return cnt ;
}
