public static int [ ] getDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    a [ i ] = x ;
    b [ i ] = y ;
  }
  Arrays . sort ( a ) ;
  Arrays . sort ( b ) ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int ac = a [ i ] + cnt ;
    if ( ac % b [ i ] != 0 ) {
      cnt += b [ i ] * ( ac / b [ i ] + 1 ) - ac ;
    }
  }
  System . out . println ( cnt ) ;
  return a ;
}
