@ VisibleForTesting static int [ ] getBinaryKeys ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  Tuple [ ] ps = new Tuple [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ps [ i ] = tuple ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  /* Dist the rad and p to the range */
  double radtmp = 2 * Math . PI * rad / maxcut ;
  /* Distance the nearest to the range */
  double tmp = dist ( rad , ps [ 0 ] ) ;
  int itmp = 0 ;
  for ( int i = 1 ;
  i < ps . length ;
  i ++ ) {
    Tuple pp = ps [ i ] ;
    double tmp2 = dist ( rad , pp ) ;
    if ( tmp2 < tmp ) {
      itmp = i ;
      tmp = tmp2 ;
    }
  }
  /* Distance the nearest to the range */
  maxcut = 2 * 20 ;
  Map < Integer , Integer > binary = new HashMap < Integer , Integer > ( ) ;
  binary . put ( 0 , closest ( 0 ) ) ;
  binary . put ( maxcut , binary . get ( 0 ) ) ;
  binary . put ( maxcut / 2 , closest ( maxcut / 2 ) ) ;
  binary . put ( maxcut / 4 , closest ( maxcut / 4 ) ) ;
  binary . put ( 3 * maxcut / 4 , closest ( 3 * maxcut / 4 ) ) ;
  /* Fill the binary */
  if ( binary . get ( ll ) != binary . get ( rr ) && rr - ll != 1 ) {
    int mm = ( ll + rr ) / 2 ;
    binary . put ( mm , closest ( mm ) ) ;
    fillBinary ( ll , mm ) ;
    fillBinary ( mm , rr ) ;
  }
  /* Fill the binary */
  fillBinary ( 0 , maxcut / 4 ) ;
  fillBinary ( maxcut / 4 , maxcut / 2 ) ;
  fillBinary ( maxcut / 2 , 3 * maxcut / 4 ) ;
  fillBinary ( 3 * maxcut / 4 , maxcut ) ;
  Set < Integer > binkeys = new TreeSet < Integer > ( binary . keySet ( ) ) ;
  int [ ] ansli = new int [ n ] ;
  int beforekey = 0 ;
  for ( int i : binkeys ) {
    ansli [ i ] += i - beforekey ;
    