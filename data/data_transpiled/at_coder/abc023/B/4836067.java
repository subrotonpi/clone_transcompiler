public static void print ( String s ) {
  int N = Integer . parseInt ( s ) ;
  String S = s . substring ( 0 , ( int ) ( ( N - 1 ) / 2 ) ) ;
  if ( N % 2 == 0 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    char [ ] begin = s . toCharArray ( ) ;
    char middle = s . charAt ( ( int ) ( ( N - 1 ) / 2 ) ) ;
    char [ ] end = s . toCharArray ( ) ;
    if ( middle != 'b' ) {
      System . out . println ( - 1 ) ;
    }
    else {
      int i = 0 ;
      while ( i < begin . length ) {
        if ( i % 3 == 0 ) {
          if ( begin [ begin . length - i - 1 ] == 'a' && end [ i ] == 'c' ) {
            i ++ ;
          }
          else {
            System . out . println ( - 1 ) ;
            break ;
          }
        }
        else if ( i % 3 == 1 ) {
          if ( begin [ begin . length - i - 1 ] == 'c' && end [ i ] == 'a' ) {
            i ++ ;
          }
          else {
            System . out . println ( - 1 ) ;
            break ;
          }
        }
        else {
          if ( begin [ begin . length - i - 1 ] == 'b' && end [ i ] == 'b' ) {
            i ++ ;
          }
          else {
            System . out . println ( - 1 ) ;
            break ;
          }
        }
      }
      if ( i == begin . length ) {
        System . out . println ( i ) ;
      }
    }
  }
}
