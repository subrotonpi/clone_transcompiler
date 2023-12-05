public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Arrays . stream ( a ) . mapToInt ( Integer :: valueOf ) . sum ( ) == 1 ) {
    System . out . println ( 0 ) ;
  }
  else if ( Arrays . stream ( a ) . mapToInt ( Integer :: valueOf ) . sum ( ) % n != 0 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    int ans = 0 ;
    int x = Arrays . stream ( a ) . mapToInt ( Integer :: valueOf ) . sum ( ) / n ;
    for ( int i = 1 ;
    i < n ;
    i ++ ) {
      if ( Arrays . stream ( a , 0 , i ) . mapToInt ( Integer :: valueOf ) . sum ( ) > x * i ) {
        ans ++ ;
      }
      if ( Arrays . stream ( a , i , a . length ) . mapToInt ( Integer :: valueOf ) . sum ( ) > x * ( n - i ) ) {
        ans ++ ;
      }
    }
    System . out . println ( ans ) ;
  }
}
