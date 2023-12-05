public static String executorCalcul ( int [ ] entrees ) {
  int N = entrees [ 0 ] ;
  int [ ] parties = entrees ;
  int Case = entrees [ 1 ] ;
  StringBuffer result = new StringBuffer ( ) ;
  while ( ( sum ( parties ) > 0 ) && ( sum ( parties ) > 0 ) ) {
    int evac1 = maximum ( parties ) ;
    parties [ evac1 ] = parties [ evac1 ] - 1 ;
    int evac2 = maximum ( parties ) ;
    if ( ( 2 * parties [ evac2 ] > sum ( parties ) ) && ( sum ( parties ) > 0 ) ) {
      parties [ evac2 ] = parties [ evac2 ] - 1 ;
      result . append ( ' ' ) ;
      result . append ( ( char ) ( evac1 + 65 ) ) ;
      result . append ( ( char ) ( evac2 + 65 ) ) ;
    }
    else {
      result . append ( ' ' ) ;
      result . append ( ( char ) ( evac1 + 65 ) ) ;
    }
  }
  /* maximum */
  int maximum = 0 ;
  for ( int i = 0 ;
  i < liste . length ;
  i ++ ) {
    if ( ( liste [ i ] > liste [ maximum ] ) && ( liste [ i ] > liste [ maximum ] ) ) maximum = i ;
  }
  /* maximum */
  boolean multiProcessed = false ;
  if ( ( multiProcessed = true ) || ( className . equals ( " java . util . concurrent . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic . atomic .