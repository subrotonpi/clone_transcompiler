public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int temp = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    temp += i ;
  }
  int flag = 0 ;
  if ( n == 1 ) {
    System . out . println ( "BOWWOW" ) ;
  }
  else {
    for ( int i = 2 ;
    i <= temp ;
    i ++ ) {
      if ( temp % i == 0 && i != temp ) {
        System . out . println ( "BOWWOW" ) ;
        flag = 1 ;
        break ;
      }
    }
    if ( flag == 0 ) {
      System . out . println ( "WANWAN" ) ;
    }
  }
}
