public static void input ( Scanner in ) {
  String s = in . next ( ) ;
  int t = in . nextInt ( ) ;
  int [ ] c = {
    0 , 0 }
    ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      String s_ = in . next ( ) ;
      if ( s_ . equals ( "L" ) ) {
        c [ 0 ] += - 1 ;
      }
      else if ( s_ . equals ( "R" ) ) {
        c [ 0 ] += 1 ;
      }
      else if ( s_ . equals ( "U" ) ) {
        c [ 1 ] += 1 ;
      }
      else if ( s_ . equals ( "D" ) ) {
        c [ 1 ] += - 1 ;
      }
    }
    int ques = s . indexOf ( "?" ) ;
    int ans = Math . abs ( c [ 0 ] ) + Math . abs ( c [ 1 ] ) ;
    if ( t == 1 ) {
      ans += ques ;
    }
    else {
      for ( int i = 0 ;
      i < ques ;
      i ++ ) {
        if ( ans > 0 ) ans -- ;
        else if ( ans == 0 ) ans ++ ;
      }
    }
    System . out . println ( ans ) ;
  }
  