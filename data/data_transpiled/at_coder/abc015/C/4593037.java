public static int [ ] [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] T = new int [ N ] [ K ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int [ ] tmp = T [ 0 ] ;
  int i = 0 ;
  while ( i != N - 1 ) {
    int [ ] nex = new int [ K ] ;
    for ( int j = 0 ;
    j < tmp . length ;
    j ++ ) {
      for ( int k = 0 ;
      k < K ;
      k ++ ) {
        nex [ j ] = tmp [ j ] ^ T [ i + 1 ] [ k ] ;
      }
    }
    tmp = nex ;
    i ++ ;
  }
  if ( 0 == tmp . length ) {
    System . out . println ( "Found" ) ;
  }
  else {
    System . out . println ( "Nothing" ) ;
  }
  return T ;
}
