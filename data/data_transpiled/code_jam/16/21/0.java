static final double [ ] [ ] solve ( ) {
  final String [ ] names = {
    "ZERO" , "ONE" , "TWO" , "THREE" , "FOUR" , "FIVE" , "SIX" , "SEVEN" , "EIGHT" , "NINE" }
    ;
    final int [ ] [ ] a = new int [ 26 ] [ 10 ] ;
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      for ( int j = 0 ;
      j < a [ i ] . length ;
      j ++ ) {
        a [ ( int ) ( a [ i ] [ j ] - 'A' ) ] [ i ] ++ ;
      }
    }
    final int T = Integer . parseInt ( input ( ) ) ;
    for ( int testCase = 0 ;
    testCase < T ;
    testCase ++ ) {
      String s = input ( ) ;
      final int [ ] b = new int [ 26 ] ;
      for ( int j = 0 ;
      j < b . length ;
      j ++ ) {
        b [ ( int ) ( b [ i ] [ j ] - 'A' ) ] ++ ;
      }
      final double [ ] [ ] x = solve ( a , b ) ;
      System . out . print ( "Case #" + ( testCase + 1 ) + ": " ) ;
      for ( int i = 0 ;
      i < x . length ;
      i ++ ) {
        for ( int j = 0 ;
        j < ( int ) Math . round ( x [ i ] [ j ] ) ;
        j ++ ) {
          System . out . print ( i + ", " ) ;
        }
      }
      System . out . println ( ) ;
    }
    return a ;
  }
  