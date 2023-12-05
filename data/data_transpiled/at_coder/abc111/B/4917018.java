public static int input ( ) {
  int digit_3 = Integer . parseInt ( N . substring ( 2 ) ) ;
  int N = Integer . parseInt ( N ) ;
  int [ ] nums = {
    111 , 222 , 333 , 444 , 555 , 666 , 777 , 888 , 999 }
    ;
    for ( int i = nums . length - 1 ;
    i >= 0 ;
    i -- ) {
      int num = nums [ i ] ;
      int temp = num - N ;
      if ( temp < 111 ) {
        System . out . println ( num ) ;
        break ;
      }
    }
    return - 1 ;
  }
  