static final int [ ] input ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) , A = Integer . parseInt ( input . readLine ( ) ) , B = Integer . parseInt ( input . readLine ( ) ) ;
  int BIT = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ( 1 << i ) & A != ( 1 << i ) & B ) {
      BIT ++ ;
    }
  }
  if ( BIT % 2 == 1 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
    System . exit ( 0 ) ;
  }
  int [ ] check = new int [ 1 << N ] ;
  int [ ] ANS = new int [ N ] ;
  check [ A ] = 1 ;
  check [ B ] = 1 ;
  /* Route the first bit to the second bit */
  int NOW = N ;
  ANS [ 0 ] = NOW ;
  for ( int i = 1 << j ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( ( 1 << j ) & A != ( 1 << j ) & B && checkbit [ j ] == 0 ) {
        break ;
      }
    }
    A = route ( A , j , i ) ;
    checkbit [ j ] = 1 ;
  }
  ANS [ N ] = B ;
  System . out . println ( ANS ) ;
}
