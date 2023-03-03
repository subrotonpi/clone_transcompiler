public static int cases = Integer . parseInt ( scanner . nextLine ( ) ) {
  for ( int i = 0 ;
  i < xrange ( cases ) ;
  i ++ ) {
    int sampleCount = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int [ ] samples = ArrayUtil . fromIntArray ( scanner . nextLine ( ) . split ( " " ) ) ;
    int maxDec = 0 ;
    int prev = 0 ;
    int eaten1 = 0 ;
    for ( int x : samples ) {
      eaten1 += Math . max ( 0 , prev - x ) ;
      maxDec = Math . max ( maxDec , prev - x ) ;
      prev = x ;
    }
    prev = 0 ;
    int eaten2 = 0 ;
    for ( int x : samples ) {
      eaten2 += Math . min ( prev , maxDec ) ;
      prev = x ;
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + eaten1 + " " + eaten2 ) ;
  }
  return cases ;
}
