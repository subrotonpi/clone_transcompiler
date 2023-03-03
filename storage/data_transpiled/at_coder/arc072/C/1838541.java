public static int N = Integer . parseInt ( input ) {
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ds = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < ds . length ;
  i ++ ) {
    ds [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > querys = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    querys . add ( Integer . parseInt ( input . nextLine ( ) ) - 1 ) ;
  }
  int [ ] ps = new int [ N + 1 ] ;
  ps [ 0 ] = D ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ps [ i + 1 ] = Math . min ( Math . abs ( ps [ i ] - ds [ i ] ) , ps [ i ] ) ;
  }
  if ( ps [ N ] != 0 ) {
    System . out . println ( Arrays . toString ( Arrays . copyOf ( ps , Q ) ) ) ;
    exit ( ) ;
  }
  int [ ] ms = new int [ N + 1 ] ;
  for ( int i = N ;
  i >= 0 ;
  i -- ) {
    if ( ms [ i + 1 ] + 1 >= ds [ i ] - ms [ i + 1 ] ) {
      ms [ i ] = ms [ i + 1 ] + ds [ i ] ;
    }
    else {
      ms [ i ] = ms [ i + 1 ] ;
    }
  }
  for ( int q : querys ) {
    if ( ps [ q ] <= ms [ q + 1 ] ) {
      System . out . println ( "NO" ) ;
    }
    else {
      System . out . println ( "YES" ) ;
    }
  }
  return q ;
}
