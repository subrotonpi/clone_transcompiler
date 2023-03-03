public static int N = Integer . parseInt ( input ) {
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . filter ( i -> i < N ) . toArray ( ) ;
  if ( Arrays . equals ( a , a [ 1 ] ) ) {
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  final int keta_count = 19 ;
  a = Arrays . stream ( a ) . filter ( v -> v <= keta_count ) . map ( v -> v - 1 ) . collect ( Collectors . toList ( ) ) ;
  a = Arrays . stream ( a ) . filter ( i -> ! i < a [ i ] > k ) . collect ( Collectors . toList ( ) ) ;
  if ( a . length == 1 ) {
    System . out . println ( 2 ) ;
    exit ( ) ;
  }
  int ok = a . length , ng = 1 ;
  while ( ok - ng > 1 ) {
    int mid = ( ok + ng ) / 2 ;
    int [ ] keta = new int [ keta_count ] ;
    for ( int i = 1 , prev = a . length ;
    i < mid ;
    i ++ ) {
      int current = a [ i ] ;
      if ( prev < current ) {
        for ( int j = current ;
        j > prev ;
        j -- ) {
          keta [ j ] = 0 ;
        }
      }
      else {
        int kuriage = 0 ;
        for ( int j = prev ;
        j > current ;
        j -- ) {
          kuriage = ( kuriage + j ) / mid ;
        }
        keta [ j ] += kuriage + 1 ;
      }
    }
    for ( int i = a . length - 1 ;
    i > 0 ;
    i -- ) {
      keta [ i - 1 ] += keta [ i ] / mid ;
    }
    if ( keta [ 0 ] >= mid ) {
      ng = mid ;
    }
    else {
      ok = mid ;
    }
  }
  System . out . println ( ok ) ;
  return ok ;
}
