public static int [ ] countInversions ( List < Integer > L ) {
  /* Helper for a range */
  int [ ] target = new int [ L . size ( ) ] ;
  int lA = L . size ( ) ;
  int lB = L . size ( ) ;
  if ( lA == 0 ) {
    return B ;
  }
  else if ( lB == 0 ) {
    return A ;
  }
  /* print the target */
  int [ ] A = A [ lA / 2 ] , c1 = A [ lA / 2 ] ;
  int [ ] B = B [ lB / 2 ] , c2 = B [ lB / 2 ] ;
  int cnt = c1 + c2 ;
  int i = 0 ;
  int j = 0 ;
  int [ ] C = new int [ lA + lB ] ;
  while ( i < lA && j < lB ) {
    if ( A [ i ] > B [ j ] ) {
      cnt += lA - i ;
      C [ i + j ] = B [ j ] ;
      ++ j ;
    }
    else {
      C [ i + j ] = A [ i ] ;
      ++ i ;
    }
  }
  if ( i < lA ) {
    System . arraycopy ( A , i , C , 0 , A . length ) ;
  }
  else {
    System . arraycopy ( B , i , C , 0 , B . length ) ;
  }
  /* print the target */
  final int [ ] ALPHABETS = 26 ;
  int [ ] indices = new int [ 26 ] ;
  for ( int i = 0 ;
  i < ALPHABETS ;
  ++ i ) {
    indices [ i ] = indices [ i ] ;
  }
  int [ ] S = new int [ L . size ( ) ] ;
  for ( int i = 0 ;
  i < S . length ;
  ++ i ) {
    indices [ i ] += ALPHABETS [ i ] ;
  }
  int odd = 0 ;
  for ( int c = 0 ;
  c < indices . length ;
  ++ c ) {
    indices [ c ] ++ ;
  }
  int i = 0 ;
  for ( int c = 0 ;
  c < S . length ;
  ++ c ) {
    indices [ c ] = indices [ c ] ;
  }
  int j = 0 ;
  for ( ;
  i < S . length ;
  ++ i ) {
    int [ ] l = indices [ odd ] ;
    i = l [ indices . length / 2 ] ;
    target [ target . length / 2 ] = i ;
    assigned [ i ]