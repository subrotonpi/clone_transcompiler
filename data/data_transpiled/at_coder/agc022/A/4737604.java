public static void input ( ) {
  String S = input . nextLine ( ) ;
  String A = "abcdefghijklmnopqrstuvwxyz" ;
  if ( S . length ( ) < 26 ) {
    for ( int i = 0 ;
    i < A . length ( ) ;
    i ++ ) {
      char c = A . charAt ( i ) ;
      if ( ! c . equals ( S ) ) {
        System . out . println ( S + c ) ;
        break ;
      }
    }
  }
  else if ( S . equals ( "zyxwvutsrqponmlkjihgfedcba" ) ) {
    System . out . println ( - 1 ) ;
  }
  else {
    for ( int i = 24 ;
    i >= 0 ;
    i -- ) {
      for ( int j = 0 ;
      j < A . length ( ) ;
      j ++ ) {
        char c = A . charAt ( j ) ;
        if ( ! c . equals ( S . substring ( 0 , i ) ) && c > S . charAt ( i ) ) {
          System . out . println ( S . substring ( 0 , i ) + c ) ;
          break ;
        }
      }
      else {
        continue ;
      }
      break ;
    }
  }
}
