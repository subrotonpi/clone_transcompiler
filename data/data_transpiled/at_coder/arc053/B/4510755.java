public static void input ( Scanner in ) {
  String [ ] A = {
    "a" , "b" , "c" , "d" , "e" , "f" , "g" , "h" , "i" , "j" , "k" , "l" , "m" , "n" , "o" , "p" , "q" , "r" , "s" , "t" , "u" , "v" , "w" , "x" , "y" , "z" }
    ;
    int odd = 0 ;
    for ( int i = 0 ;
    i < 26 ;
    i ++ ) {
      if ( S . indexOf ( A [ i ] ) % 2 == 1 ) {
        odd ++ ;
      }
    }
    if ( odd == 0 ) {
      System . out . println ( S . length ( ) ) ;
    }
    else {
      for ( int i = 0 ;
      i < 1000000 ;
      i ++ ) {
        if ( S . length ( ) < ( 1 + 2 * i ) * odd ) {
          break ;
        }
      }
      System . out . println ( 1 + 2 * ( i - 1 ) ) ;
    }
  }
  