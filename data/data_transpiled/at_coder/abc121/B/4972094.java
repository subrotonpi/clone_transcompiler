public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] B = new int [ N ] ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int sum = 0 ;
  for ( int j = 0 ;
  j < M ;
  j ++ ) {
    sum += A [ j ] * B [ j ] ;
  }
  if ( sum + C > 0 ) {
    cnt ++ ;
  }
  return cnt ;
}
