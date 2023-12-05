@ GwtIncompatible ( "Doubles.solve" ) public static void main ( String input ) {
  String [ ] digs = {
    "ZERO" , "ONE" , "TWO" , "THREE" , "FOUR" , "FIVE" , "SIX" , "SEVEN" , "EIGHT" , "NINE" }
    ;
    char [ ] [ ] A = new char [ 26 ] [ 10 ] ;
    for ( int d = 0 ;
    d < A . length ;
    d ++ ) {
      for ( int i = 0 ;
      i < digs [ d ] . length ( ) ;
      i ++ ) {
        A [ ( char ) ( digs [ d ] - 'A' ) ] [ d ] ++ ;
      }
    }
    int T = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int t = 0 ;
    t < T ;
    t ++ ) {
      String s = input . trim ( ) ;
      char [ ] freks = new char [ 26 ] ;
      for ( int i = 0 ;
      i < s . length ( ) ;
      i ++ ) {
        freks [ ( char ) ( s . charAt ( i ) - 'A' ) ] ++ ;
      }
      String ans = "" ;
      int sol = lstsq ( A , freks ) [ 0 ] ;
      for ( int i = 0 ;
      i < 10 ;
      i ++ ) {
        int x = Math . round ( sol ) ;
        ans += ( char ) ( '0' + i ) * x ;
      }
      System . out . println ( "Case #" + ( t + 1 ) + ": " + ans ) ;
    }
  }
  