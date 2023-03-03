public static int [ ] getN ( int N , int L , int T ) {
  int [ ] X = new int [ N ] ;
  int [ ] W = new int [ N ] ;
  int [ ] E = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = 0 ;
    W [ i ] = 0 ;
  }
  int count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    W [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( W [ i ] == 1 ) {
      int end = X [ i ] + T ;
      end = end % L ;
    }
    if ( W [ i ] == 2 ) {
      int end = X [ i ] - T ;
      end = end % L ;
      if ( end < 0 ) end += L ;
    }
    E [ i ] = end ;
    double shu = L / 2.0 ;
    if ( i > 0 && W [ i ] == 2 && W [ 0 ] == 1 ) {
      int sa = X [ i ] - X [ 0 ] ;
      if ( sa < 0 ) sa += L ;
      double gikan = sa / 2.0 ;
      count += ( T - gikan ) / shu + 1 ;
      if ( ( T - gikan ) % shu == 0 ) count -- ;
    }
    if ( i > 0 && W [ i ] == 1 && W [ 0 ] == 2 ) {
      int sa = X [ 0 ] - X [ i ] ;
      if ( sa < 0 ) sa += L ;
      double gikan = sa / 2.0 ;
      count -= ( T - gikan ) / shu + 1 ;
    }
  }
  count = count % N ;
  if ( count < 0 ) count += N ;
  count = ( int ) count ;
  int basho = E [ 0 ] ;
  Arrays . sort ( E ) ;
  int ind = E . indexOf ( basho ) ;
  int [ ] result = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int newind = ind + i ;
    if ( newind >= N ) newind -= N ;
    result [ count ] = E [ newind ] ;
    count ++ ;
    if ( count >= N ) count -= N ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( result [ i ]