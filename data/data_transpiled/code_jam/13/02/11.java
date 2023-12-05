public static String [ ] [ ] rotated ( String [ ] [ ] P ) {
  String [ ] [ ] res = new String [ P [ 0 ] . length ] [ P [ 0 ] . length ] ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < P [ 0 ] . length ;
    j ++ ) {
      res [ i ] [ j ] = P [ i ] [ j ] ;
    }
  }
  /* solve */
  int [ ] rows = ArrayUtil . max ( P ) ;
  int [ ] cols = ArrayUtil . max ( rotated ( P ) ) ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < P [ 0 ] . length ;
    j ++ ) {
      if ( Math . min ( rows [ i ] , cols [ j ] ) > P [ i ] [ j ] ) {
        return "NO" ;
      }
    }
  }
  /* solve */
  int t = input . nextInt ( ) ;
  for ( int testc = 1 ;
  testc <= t ;
  testc ++ ) {
    System . out . println ( "Case #" + testc + ":" ) ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int m = Integer . parseInt ( input . nextLine ( ) ) ;
    P = new String [ n ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      P [ i ] = map ( P [ i ] [ i ] , P [ i ] ) ;
    }
    System . out . println ( solve ( P ) ) ;
  }
  return res ;
}
