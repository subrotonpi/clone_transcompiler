public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] march = new int [ 5 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = input . next ( ) ;
    switch ( s . charAt ( 0 ) ) {
      case 'M' : march [ 0 ] ++ ;
      break ;
      case 'A' : march [ 1 ] ++ ;
      break ;
      case 'R' : march [ 2 ] ++ ;
      break ;
      case 'C' : march [ 3 ] ++ ;
      break ;
      case 'H' : march [ 4 ] ++ ;
      break ;
    }
  }
  int [ ] P = {
    0 , 0 , 0 , 0 , 0 , 0 , 1 , 1 , 1 , 2 }
    ;
    int [ ] Q = {
      1 , 1 , 1 , 2 , 2 , 3 , 2 , 2 , 3 , 3 }
      ;
      int [ ] R = {
        2 , 3 , 4 , 3 , 4 , 4 , 3 , 4 , 4 , 4 }
        ;
        int res = 0 ;
        for ( int i = 0 ;
        i < 10 ;
        i ++ ) {
          res += march [ P [ i ] ] * march [ Q [ i ] ] * march [ R [ i ] ] ;
        }
        System . out . println ( res ) ;
      }
      