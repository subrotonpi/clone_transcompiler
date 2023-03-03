public static int [ ] [ ] A ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] A = new int [ N ] [ 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] [ 0 ] = i + 1 ;
    A [ i ] [ 1 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  boolean flag = false ;
  int cnt = 0 ;
  int b , new = A [ 0 ] [ 0 ] ;
  for ( int i = 0 ;
  i < 2 * N ;
  i ++ ) {
    if ( b == 2 ) {
      flag = true ;
      break ;
    }
    cnt ++ ;
    b = A [ new - 1 ] [ 0 ] ;
  }
  if ( flag ) {
    System . out . println ( cnt ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return A ;
}
