public static int [ ] ints ( ) {
  return ArrayUtil . ints ( new Scanner ( System . in ) . nextLine ( ) . split ( " " ) ) ;
  int numCases = ints ( ) , walktime ;
  for ( int caseNum = xrange ( 1 , numCases + 1 ) ;
  caseNum <= numCases ;
  caseNum ++ ) {
    int X = ints ( ) ;
    int S = ints ( ) ;
    int R = ints ( ) ;
    int t = ints ( ) ;
    int N = ints ( ) ;
    S = Double . parseDouble ( S ) ;
    R = Double . parseDouble ( R ) ;
    walks = new int [ N ] ;
    for ( int i = xrange ( N ) ;
    i < N ;
    i ++ ) {
      int b = ints ( ) ;
      int e = ints ( ) ;
      int w = ints ( ) ;
      walks [ i ] = new int [ w ] ;
      walks [ i ] [ 0 ] = e - b ;
    }
    int length = Arrays . stream ( walks ) . mapToInt ( walk -> walk . getValue ( ) ) . sum ( ) ;
    walks [ N ] = new int [ X - length ] ;
    Arrays . stream ( walks ) . sorted ( ) . forEach ( walk -> {
      int ws = walk . getKey ( ) ;
      int wl = walk . getValue ( ) ;
      int runspeed = ws + R ;
      int walkspeed = ws + S ;
      int runtime = Math . min ( t , wl / runspeed ) ;
      total += runtime ;
      t -= runtime ;
      int rundist = runtime * runspeed ;
      int walkdist = wl - rundist ;
      int walktime = walkdist / walkspeed ;
      total += walktime ;
    }
    ) ;
  }
  System . out . println ( "Case #" + caseNum + ": " + total ) ;
  return new int [ ] {
  }
  ;
}
