public static void input ( ) {
  T = input . nextInt ( ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    String [ ] in = readLine ( ) . split ( " " ) ;
    Arrays . stream ( in ) . skip ( 3 ) . forEach ( s -> {
      N ++ ;
      S ++ ;
      p ++ ;
    }
    ) ;
    int [ ] ts = new int [ in . length ] ;
    for ( int i = 0 ;
    i < ts . length ;
    i ++ ) {
      ts [ i ] = Integer . parseInt ( in [ i ] ) ;
    }
    int minWithoutSurprise = p + 2 * Math . max ( p - 1 , 0 ) ;
    int minWithSurprise = p + 2 * Math . max ( p - 2 , 0 ) ;
    int withoutSurprise = 0 ;
    int withSurprise = 0 ;
    for ( int ti : ts ) {
      if ( ti >= minWithoutSurprise ) {
        withoutSurprise ++ ;
      }
      else if ( ti >= minWithSurprise ) {
        withSurprise ++ ;
      }
    }
    int answer = withoutSurprise + Math . min ( withSurprise , S ) ;
    System . out . println ( "Case #" + t + ": " + answer ) ;
  }
}
