public static String input ( ) {
  String S = input ( ) ;
  String T = input ( ) ;
  String [ ] lll = {
    "a" , "t" , "c" , "o" , "d" , "e" , "r" }
    ;
    if ( S . equals ( T ) ) {
      System . out . println ( "You can win" ) ;
      exit ( ) ;
    }
    if ( ! S . contains ( "@" ) && ! T . contains ( "@" ) ) {
      System . out . println ( "You will lose" ) ;
      exit ( ) ;
    }
    for ( int i = 0 ;
    i < S . length ( ) ;
    i ++ ) {
      String w = S . substring ( i ) ;
      if ( "@" . equals ( w ) ) {
        String r = T . substring ( i ) ;
        if ( ! lll [ i ] . equals ( r ) ) {
          if ( "@" . equals ( r ) ) {
            continue ;
          }
          else {
            System . out . println ( "You will lose" ) ;
            exit ( ) ;
          }
        }
      }
    }
    return T ;
  }
  