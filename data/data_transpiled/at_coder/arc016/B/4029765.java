public static void bMusic ( int N , String [ ] Music ) {
  final String [ ] [ ] matrix = new String [ N ] [ ] {
    "" , "" , "" , "" }
    ;
    final String [ ] [ ] musicRotate = rotateCounterClockwise ( Music ) ;
    int ans = 0 ;
    for ( String row : musicRotate ) {
      row = row . replaceAll ( "ro{2,}" , "o" ) ;
      ans += row . indexOf ( 'x' ) + row . indexOf ( 'o' ) ;
    }
  }
  