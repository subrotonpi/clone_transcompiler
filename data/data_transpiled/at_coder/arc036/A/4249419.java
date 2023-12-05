public static int [ ] [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] L = new int [ N ] [ N ] ;
  int p = 0 ;
  int c = 0 ;
  boolean flag = true ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int j = 0 ;
  j < N - 2 ;
  j ++ ) {
    p = L [ j ] + L [ j + 1 ] + L [ j + 2 ] ;
    if ( p < K ) {
      flag = false ;
      c = j + 3 ;
      break ;
    }
    else {
      null ;
    }
  }
  if ( flag ) {
    System . out . println ( - 1 ) ;
  }
  else {
    System . out . println ( c ) ;
  }
  return L ;
}
