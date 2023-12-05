static int getN ( ) {
  return Integer . parseInt ( input . nextLine ( ) ) ;
  /* getMN() */
  String [ ] a = input . nextLine ( ) . split ( " " ) ;
  int [ ] b = new int [ a . length ] ;
  for ( int i = 0 ;
  i < b . length ;
  i ++ ) b [ i ] = Integer . parseInt ( a [ i ] ) ;
  /* get the number of numbers */
  long MOD = 1000000007 ;
  int n = getMN ( ) ;
  int m = getMN ( ) ;
  long [ ] anums = asList ( a ) ;
  long [ ] bnums = asList ( b ) ;
  /* calc accumWidth */
  long xPosAcc = 0 ;
  long xWidthAcc = 0 ;
  for ( int i = 0 ;
  i < nums . length ;
  i ++ ) {
    xWidthAcc += nums [ i ] * nums [ i ] - xPosAcc ;
    xPosAcc += nums [ i ] ;
  }
  return xWidthAcc ;
}
