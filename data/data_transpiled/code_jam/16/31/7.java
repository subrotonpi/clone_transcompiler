public static int T = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    N = Integer . parseInt ( input . nextLine ( ) ) ;
    String line = input . nextLine ( ) ;
    String [ ] t = line . split ( " " ) ;
    char [ ] [ ] a = new char [ N ] [ ] ;
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      a [ i ] = new char [ ] {
        ( char ) ( 'A' + i ) , Integer . parseInt ( t [ i ] ) }
        ;
      }
      int tot = Integer . valueOf ( a [ 0 ] [ 1 ] ) ;
      StringBuilder res = new StringBuilder ( ) ;
      while ( tot > 0 ) {
        Arrays . sort ( a , Collections . reverseOrder ( ) ) ;
        if ( 2 * a [ 1 ] [ 1 ] <= tot - 1 ) {
          a [ 0 ] [ 1 ] -- ;
          tot -- ;
          res . append ( a [ 0 ] [ 0 ] ) ;
        }
        else {
          a [ 0 ] [ 1 ] -- ;
          a [ 1 ] [ 1 ] -- ;
          tot -= 2 ;
          res . append ( a [ 0 ] [ 0 ] + a [ 1 ] [ 0 ] ) ;
        }
      }
      System . out . println ( "Case #" + testCase + ": " + res . toString ( ) ) ;
    }
    return N ;
  }
  