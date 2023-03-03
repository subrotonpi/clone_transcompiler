@ VisibleForTesting static void go ( String filename ) throws IOException {
  final Scanner scanner = new Scanner ( new File ( filename ) ) ;
  try ( final PrintStream output = new PrintStream ( new FileOutputStream ( "out.txt" ) ) ) {
    for ( int testCase = 1 ;
    testCase <= Integer . parseInt ( scanner . nextLine ( ) ) ;
    testCase ++ ) {
      output . print ( "Case #" + testCase + ": " ) ;
      final int [ ] input = new int [ 4 ] ;
      for ( int v : scanner . nextLine ( ) . split ( " " ) ) {
        input [ 0 ] = Integer . parseInt ( scanner . nextLine ( ) ) ;
      }
      final int boosters = input [ 0 ] ;
      final int buildT = input [ 1 ] ;
      final int stars = input [ 2 ] ;
      final String [ ] pattern = input [ 4 ] ;
      final int [ ] times = new int [ stars ] ;
      for ( int s = 0 ;
      s < stars ;
      s ++ ) {
        times [ s ] = 2 * pattern [ s % pattern . length ] ;
      }
      final int [ ] savings = new int [ boosters ] ;
      int b = buildT ;
      for ( int s = 0 ;
      s < stars ;
      s ++ ) {
        int t = times [ s ] ;
        if ( b > 0 ) {
          t -= b ;
        }
        if ( t > 0 ) {
          t /= 2 ;
        }
        else {
          t = 0 ;
        }
        savings [ s ] = t ;
        b -= times [ s ] ;
      }
      Arrays . sort ( savings , Collections . reverseOrder ( ) ) ;
      output . println ( String . format ( "%s\n" , Arrays . toString ( times ) - Arrays . toString ( savings , 0 , boosters ) ) ) ;
      System . out . println ( testCase ) ;
    }
  }
}
