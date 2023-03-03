public static void bMusic ( int N , String [ ] Music ) {
  final String [ ] [ ] matrix = new String [ N ] [ ] {
    "" , "" , "" }
    ;
    final String [ ] [ ] musicRotate = rotateCounterClockwise ( Music ) ;
    int ans = 0 ;
    for ( String row : musicRotate ) {
      ans += row . indexOf ( "x" ) ;
      final String [ ] array = row . split ( "[.x]" ) ;
      for ( String element : array ) {
        if ( element . length ( ) > 0 ) ans ++ ;
      }
    }
  }
  