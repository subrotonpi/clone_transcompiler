public static void input ( Scanner in ) {
  int lenA = in . nextInt ( ) ;
  int [ ] A1 = in . nextInt ( ) ;
  int [ ] A2 = in . nextInt ( ) - lenA / 2 ;
  if ( A1 == A2 ) {
    if ( lenA % 2 == 0 ) {
      System . out . println ( 25 * lenA ) ;
      exit ( ) ;
    }
    else {
      System . out . println ( 25 * lenA - 25 ) ;
      exit ( ) ;
    }
  }
  int count = 0 ;
  for ( int i = 0 , z = A1 . length ;
  i < z ;
  i ++ ) {
    if ( A1 [ i ] != A2 [ i ] ) {
      count ++ ;
    }
  }
  if ( count == 1 ) {
    System . out . println ( ( lenA - 2 ) * 25 + 24 * 2 ) ;
  }
  else {
    System . out . println ( lenA * 25 ) ;
  }
}
