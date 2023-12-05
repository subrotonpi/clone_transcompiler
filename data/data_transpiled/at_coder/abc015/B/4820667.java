static final double ceil ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int cnt = 0 ;
  double res = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( a [ i ] != 0 ) {
      cnt ++ ;
      res += a [ i ] ;
    }
  }
  System . out . println ( Math . ceil ( res / cnt ) ) ;
  return 0 ;
}
