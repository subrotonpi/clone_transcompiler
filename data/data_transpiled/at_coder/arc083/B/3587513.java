public static int [ ] inpl ( ) {
  return Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] A = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] [ i ] = 10 * 9 + 1 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      final int mindis = Math . min ( A [ i ] [ j ] , A [ i ] [ j ] ) ;
      if ( mindis > A [ i ] [ j ] ) {
        ans += A [ i ] [ j ] ;
        continue ;
      }
      if ( mindis < A [ i ] [ j ] ) {
        System . out . println ( - 1 ) ;
        System . exit ( 0 ) ;
      }
    }
  }
  System . out . println ( ans ) ;
  return A ;
}
