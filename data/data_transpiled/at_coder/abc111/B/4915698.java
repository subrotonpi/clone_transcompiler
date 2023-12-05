public static void main ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] num = {
    111 , 222 , 333 , 444 , 555 , 666 , 777 , 888 , 999 }
    ;
    int min_ = 111 ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < num . length ;
    i ++ ) {
      if ( num [ i ] - n < 0 ) {
        null ;
      }
      else {
        if ( min_ > num [ i ] - n ) {
          ans = num [ i ] ;
        }
      }
    }
    System . out . println ( ans ) ;
  }
  