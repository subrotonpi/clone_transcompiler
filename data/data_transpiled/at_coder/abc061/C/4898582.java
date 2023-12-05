static final int [ ] [ ] getBinaryArray ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] ab = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ab [ i ] = new int [ N ] ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ab [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int idxAB = ab . length ;
  ab = ab [ idxAB ] ;
  int kSum = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] record = ab [ i ] ;
    int a = record [ 0 ] ;
    int b = record [ 1 ] ;
    kSum += b ;
    if ( kSum >= K ) {
      System . out . println ( a ) ;
      break ;
    }
  }
  return Arrays . copyOf ( ab , K ) ;
}
