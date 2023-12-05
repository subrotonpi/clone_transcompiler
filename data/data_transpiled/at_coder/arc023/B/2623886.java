public static int [ ] readInput ( ) {
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  int d = Integer . parseInt ( input . readLine ( ) ) ;
  int a = 0 ;
  for ( int hi = 0 ;
  hi < h ;
  hi ++ ) {
    int [ ] t = new int [ w ] ;
    for ( int i = 0 ;
    i < w ;
    i ++ ) {
      t [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
    }
    for ( int wi = 0 ;
    wi < w ;
    wi ++ ) {
      int l = hi + wi ;
      if ( l <= d && l % 2 == d % 2 ) {
        a = Math . max ( a , t [ wi ] ) ;
      }
    }
  }
  return a ;
}
