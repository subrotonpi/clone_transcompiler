public static String flip ( char c ) {
  if ( c == '0' ) {
    return "1" ;
  }
  else {
    return "0" ;
  }
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int z = 0 ;
  z <= T ;
  z ++ ) {
    int N = Integer . parseInt ( readLine ( ) ) ;
    int L = Integer . parseInt ( readLine ( ) ) ;
    char [ ] [ ] flow = readLine ( ) . toCharArray ( ) ;
    char [ ] [ ] devices = readLine ( ) . toCharArray ( ) ;
    HashSet < Character > sd = new HashSet < Character > ( devices . length ) ;
    sd . add ( new Character ( c ) ) ;
    int best = 1000000 ;
    for ( int i = 0 ;
    i < xrange ;
    i ++ ) {
      int numFlips = 0 ;
      boolean [ ] flipped = new boolean [ xrange ( L ) ] ;
      for ( int j = 0 ;
      j < xrange ( L ) ;
      j ++ ) {
        if ( flow [ 0 ] [ j ] != devices [ i ] [ j ] ) {
          numFlips ++ ;
          flipped [ j ] = true ;
        }
      }
      String [ ] realFlow = new String [ flow . length ] ;
      for ( char [ ] f : flow ) {
        StringBuffer sb = new StringBuffer ( ) ;
        for ( int j = 0 ;
        j < xrange ( L ) ;
        j ++ ) {
          char cur = f [ j ] ;
          if ( flipped [ j ] ) {
            cur = flip ( cur ) ;
          }
          sb . append ( cur ) ;
        }
        realFlow [ z ] = sb . toString ( ) ;
      }
      HashSet < Character > rf = new HashSet < Character > ( realFlow ) ;
      if ( rf . equals ( sd ) ) {
        best = Math . min ( best , numFlips ) ;
      }
    }
    if ( best <= L ) {
      System . out . println ( "Case #" + z + ": " + best ) ;
    }
    else {
      System . out . println ( "Case #" + z + ": NOT POSSIBLE" ) ;
    }
  }
  return "" ;
}
