static final String print ( String str ) {
  int inf = 10 * 20 ;
  int mod = 10 * 9 + 7 ;
  /* LI */
  int [ ] li = str . split ( " " ) ;
  /* LI_ */
  int [ ] li = new int [ li . length - 1 ] ;
  /* LF */
  for ( int i = 0 ;
  i < li . length ;
  i ++ ) li [ i ] = Integer . parseInt ( li [ i ] ) ;
  /* LS */
  for ( int i = 0 ;
  i < li . length ;
  i ++ ) li [ i ] = mod ;
  return str ;
}
