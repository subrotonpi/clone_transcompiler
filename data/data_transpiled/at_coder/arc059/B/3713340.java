public static int input ( ) {
  int count = 0 ;
  if ( a . length ( ) > 3 ) {
    for ( int i = 0 ;
    i < a . length ( ) - 2 ;
    i ++ ) {
      if ( a [ i ] == a [ i + 1 ] || a [ i ] == a [ i + 2 ] || a [ i + 1 ] == a [ i + 2 ] ) {
        System . out . println ( i + 1 + " " + i + 3 ) ;
        count ++ ;
        break ;
      }
    }
  }
  else {
    if ( a [ 0 ] == a [ 1 ] ) {
      System . out . println ( 1 + " " + 2 ) ;
      count ++ ;
    }
  }
  if ( count == 0 ) {
    System . out . println ( - 1 + " " + - 1 ) ;
  }
  return count ;
}
