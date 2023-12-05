public static int cnt500 ( ) {
  int cnt100 = Integer . parseInt ( input . nextLine ( ) ) ;
  int cnt50 = Integer . parseInt ( input . nextLine ( ) ) ;
  int price = Integer . parseInt ( input . nextLine ( ) ) ;
  int cnt = 0 ;
  for ( int a = 0 ;
  a < cnt500 + 1 ;
  a ++ ) {
    if ( cnt500 * a > price ) break ;
    for ( int b = 0 ;
    b < cnt100 + 1 ;
    b ++ ) {
      if ( cnt100 * b > price ) break ;
      for ( int c = 0 ;
      c < cnt50 + 1 ;
      c ++ ) {
        if ( cnt50 * c > price ) break ;
        if ( a * 500 + b * 100 + c * 50 == price ) cnt ++ ;
      }
    }
  }
  return cnt ;
}
