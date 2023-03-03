public static int N = Integer . parseInt ( input ) {
  int res = 0 ;
  for ( int i = 0 ;
  i < 10 * 6 ;
  i ++ ) {
    String tmp = String . valueOf ( i ) . substring ( 0 , 1 ) ;
    boolean flag = true ;
    for ( int j = 0 ;
    j < String . valueOf ( i ) . length ( ) ;
    j ++ ) {
      if ( tmp . compareTo ( String . valueOf ( i ) . substring ( j , j + 1 ) ) != 0 ) {
        flag = false ;
        break ;
      }
    }
    if ( flag == true ) {
      res ++ ;
    }
    if ( res == N + 1 ) {
      System . out . println ( i ) ;
      break ;
    }
  }
  return res ;
}
