public static int [ ] getN ( int N , int K , int Q ) {
  int [ ] A = new int [ N ] ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    A [ a ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int minSub = 10 * 10 ;
  for ( int a : A ) {
    boolean start = false ;
    int end = 0 ;
    int [ ] subarray = new int [ N ] , newarray = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( A [ i ] >= a ) {
        newarray [ end ++ ] = A [ i ] ;
        start = true ;
      }
      else {
        if ( start ) {
          start = false ;
          if ( newarray . length >= K ) {
            Arrays . sort ( subarray ) ;
            for ( int j = 0 ;
            j < newarray . length - K + 1 ;
            j ++ ) subarray [ j ] = newarray [ j ] ;
          }
          newarray = new int [ end ] ;
        }
      }
    }
    if ( start ) {
      minSub = Math . min ( minSub , subarray [ Q - 1 ] - a ) ;
    }
  }
  return subarray ;
}
