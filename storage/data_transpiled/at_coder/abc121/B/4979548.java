public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) . split ( " " ) [ 0 ] ) ;
  int C = Integer . parseInt ( input . nextLine ( ) . split ( " " ) [ 0 ] ) ;
  int count = 0 ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] A = Integer . parseInt ( input . nextLine ( ) . split ( " " ) [ 0 ] ) ;
    for ( int k = 0 ;
    k < M ;
    k ++ ) {
      sum = sum + A [ k ] * B [ k ] ;
    }
    if ( sum + C > 0 ) {
      count = count + 1 ;
    }
    sum = 0 ;
  }
  System . out . println ( count ) ;
  return count ;
}
