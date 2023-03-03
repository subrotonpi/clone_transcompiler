public static void main ( String input ) {
  int [ ] a = new int [ N ] ;
  int num_len = Integer . parseInt ( input ) ;
  int [ ] b = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) b [ i ] = Integer . parseInt ( input ) ;
  int N = 100 ;
  for ( int i = 0 ;
  i < num_len ;
  i ++ ) {
    if ( b [ i ] - 1 <= a . length ) {
      a [ i ] = b [ i ] - 1 ;
      flag = true ;
    }
    else {
      flag = false ;
      break ;
    }
  }
  if ( flag ) {
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      System . out . println ( a [ i ] ) ;
    }
  }
  else {
    System . out . println ( - 1 ) ;
  }
}
