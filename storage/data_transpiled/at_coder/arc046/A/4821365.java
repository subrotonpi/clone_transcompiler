public static int N ( ) {
  int [ ] ls = {
    0 , 9 , 18 , 27 , 36 , 45 , 54 }
    ;
    String ans = "" ;
    if ( N % 9 == 0 ) {
      ans = "9" ;
    }
    else {
      ans = Integer . toString ( N % 9 ) ;
    }
    for ( int i = 0 ;
    i < ls . length ;
    i ++ ) {
      final int x = ls [ i ] ;
      final int y = ls [ i ] ;
      if ( x < N && N <= y ) {
        System . out . println ( ans * ( i + 1 ) ) ;
      }
    }
    return ans . length ( ) ;
  }
  