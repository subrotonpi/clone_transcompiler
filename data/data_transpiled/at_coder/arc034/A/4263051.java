public static int [ ] getN ( ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String [ ] temp = input . split ( "\\s+" ) ;
    Arrays . sort ( temp ) ;
    int total = 0 ;
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      total += temp [ j ] ;
    }
    total += temp [ 4 ] * 110 / 900 ;
    a [ i ] = total ;
  }
  System . out . println ( max ( a ) ) ;
  return a ;
}
