@ GwtIncompatible ( "java.util.Scanner" ) private static String go ( ) {
  final String [ ] L = {
    "ZERO" , "ONE" , "TWO" , "THREE" , "FOUR" , "FIVE" , "SIX" , "SEVEN" , "EIGHT" , "NINE" }
    ;
    final Map < Character , Integer > D = new HashMap < Character , Integer > ( ) ;
    final Scanner input = new Scanner ( System . in ) ;
    final int T = input . nextInt ( ) ;
    final String [ ] num1 = new String [ T + 1 ] ;
    int num2 = 0 ;
    for ( char c : L [ T ] ) {
      D . put ( c , c ) ;
    }
    int num0 = D . get ( 'Z' ) ;
    remove ( 0 , num0 ) ;
    int num2 = 0 ;
    for ( char c : L [ T ] ) {
      D . put ( c , c ) ;
    }
    int num4 = 0 ;
    for ( char c : L [ T ] ) {
      D . put ( c , c ) ;
    }
    int num6 = 0 ;
    for ( char c : L [ T ] ) {
      D . put ( c , c ) ;
    }
    int num7 = 0 ;
    for ( char c : L [ T ] ) {
      D . put ( c , c ) ;
    }
    int num8 = 0 ;
    for ( char c : L [ T ] ) {
      D . put ( c , c ) ;
    }
    int num5 = 0 ;
    for ( char c : L [ T ] ) {
      D . put ( c , c ) ;
    }
    int num1 = 0 ;
    for ( char c : L [ T ] ) {
      D . put ( c , c ) ;
    }
    int num9 = 0 ;
    for ( char c : L [ T ] ) {
      D . put ( c , c ) ;
    }
    int num0 = 0 ;
    for ( char c : L [ T ] ) {
      D . put ( c , c ) ;
    }
    int num0 = 0 ;
    for ( char c : L ) {
      D . put ( c , c ) ;
    }
    int num0 = 0 ;
    for ( char c : L ) {
      D . put ( c , c ) ;
    }
    int num1 = 0 ;
    for ( int t = 1 ;
    t <= T ;
    t ++ ) {
      M = input . nextInt ( ) ;
      System . out . println ( "Case #" + t + ": " + go