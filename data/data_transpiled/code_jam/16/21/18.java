static final String solve ( ) {
  final String input = "Enter a number of letters and numbers of numbers: " ;
  final int T = Integer . parseInt ( input ) ;
  final String [ ] dic = {
    "ZERO" , "ONE" , "TWO" , "THREE" , "FOUR" , "FIVE" , "SIX" , "SEVEN" , "EIGHT" , "NINE" }
    ;
    final char [ ] chars = new char [ ] {
      Character . toString ( ( char ) 0 ) , Character . toString ( ( char ) 0 ) }
      ;
      final int R = chars . length ;
      final Matrix M = new Matrix ( R , R ) ;
      for ( int i = 0 ;
      i < R ;
      i ++ ) {
        for ( int j = 0 ;
        j < 10 ;
        j ++ ) {
          M . add ( new Matrix ( ) . multAdd ( chars [ i ] , chars [ j ] ) ) ;
        }
      }
      for ( int testCase = 1 ;
      testCase <= T ;
      testCase ++ ) {
        final String S = input ;
        final Matrix b = new Matrix ( ) ;
        for ( int i = 0 ;
        i < R ;
        i ++ ) {
          b . add ( new Matrix ( ) . multAdd ( chars [ i ] , chars [ i ] ) ) ;
        }
        final int [ ] sol = new int [ S ] ;
        for ( int i = 0 ;
        i < S ;
        i ++ ) {
          sol [ i ] = ( int ) ( S + 0.5 ) ;
        }
        final String result = new String ( Integer . toString ( i ) * sol [ i ] ) ;
        System . out . println ( "Case #" + testCase + ": " + result ) ;
      }
      return input ;
    }
    