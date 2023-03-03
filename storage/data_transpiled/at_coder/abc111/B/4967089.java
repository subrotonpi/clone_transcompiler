public static int N ( ) {
  int [ ] list = {
    111 , 222 , 333 , 444 , 555 , 666 , 777 , 888 , 999 , 1000000 }
    ;
    int ans = 0 ;
    for ( int l : list ) {
      if ( N > l ) {
        continue ;
      }
      else {
        ans = l ;
        break ;
      }
    }
    System . out . println ( ans ) ;
    return ans ;
  }
  