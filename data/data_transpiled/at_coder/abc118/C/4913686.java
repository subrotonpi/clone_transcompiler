public static int N ( ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  int m = Math . min ( A . length , N ) ;
  while ( true ) {
    boolean flag = false ;
    int temp = m ;
    for ( int i = 0 ;
    i < A . length ;
    i ++ ) {
      if ( A [ i ] % m > 0 && ( A [ i ] % m ) < temp ) {
        temp = A [ i ] % m ;
        flag = true ;
      }
    }
    if ( flag == false ) {
      break ;
    }
    else {
      m = temp ;
    }
  }
  System . out . println ( m ) ;
  return m ;
}
