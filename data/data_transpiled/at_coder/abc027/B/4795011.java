public static int bIslandInt ( int N , int [ ] A ) {
  int s = Arrays . stream ( A ) . sum ( ) ;
  if ( s % N != 0 ) {
    return - 1 ;
  }
  return Arrays . stream ( A ) . filter ( i -> Integer . parseInt ( i ) != s / N * i ) . count ( ) ;
}
