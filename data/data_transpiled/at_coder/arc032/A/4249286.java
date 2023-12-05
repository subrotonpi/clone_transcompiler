public static final int getPrime ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = n * ( n + 1 ) / 2 ;
  boolean flag = false ;
  if ( n == 1 ) {
    System . out . println ( "BOWWOW" ) ;
  }
  else {
    for ( int i = 2 ;
    i < Math . ceil ( Math . sqrt ( ( ( n + 1 ) * ( n + 1 ) * ( n + 1 ) ) / 2 ) ) ;
    i ++ ) {
      if ( k % i == 0 ) {
        flag = true ;
        break ;
      }
      else {
        null ;
      }
    }
  }
  if ( flag ) {
    System . out . println ( "BOWWOW" ) ;
  }
  else {
    System . out . println ( "WANWAN" ) ;
  }
  return n ;
}
