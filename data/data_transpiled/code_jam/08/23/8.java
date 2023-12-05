static final String nextLine ( ) {
  String line = System . console ( ) . readLine ( ) ;
  line = line . replaceAll ( " " , "" ) ;
  int cases = Integer . parseInt ( line ) ;
  for ( int testCase = 0 ;
  testCase <= cases ;
  testCase ++ ) {
    int K = Integer . parseInt ( System . console ( ) . readLine ( ) . trim ( ) ) ;
    int [ ] ds = ArrayUtil . split ( line . split ( " " ) ) ;
    Arrays . fill ( ds , 0 , 1 ) ;
    int [ ] indexes = new int [ K ] ;
    int [ ] cards = new int [ K ] ;
    int i = 0 ;
    for ( int X : xrange ( 0 , K ) ) {
      I += X ;
      I = I % ( indexes . length ) ;
      int ii = I % ( K - X ) ;
      i = indexes [ ii ] ;
      indexes [ ii ] = i ;
      cards [ i ] = X ;
    }
    System . out . print ( "Case #" + ( testCase + 1 ) + ":" ) ;
    for ( int d : ds ) System . out . print ( " " + ( cards [ d - 1 ] + 1 ) ) ;
    System . out . println ( ) ;
  }
  return line ;
}
