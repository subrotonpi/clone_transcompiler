public static void initializeSolver ( ) {
}
{
  int n , p ;
  int [ ] a = read ( ) ;
  int [ ] counts = new int [ p ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) counts [ a [ i ] % p ] ++ ;
  int res = counts [ 0 ] ;
  if ( p == 2 ) {
    solveTestCase ( ) ;
  }
  else {
    int totalCases = read ( ) ;
    for ( int caseNumber = 1 ;
    caseNumber <= totalCases ;
    caseNumber ++ ) {
      write ( outputFormat . replace ( "%d" , Integer . toString ( caseNumber ) ) ) ;
      write ( ) ;
    }
  }
  if ( tfile != null ) tfile . close ( ) ;
  int packs = Math . min ( counts [ 1 ] , counts [ 2 ] ) ;
  counts [ 1 ] -= packs ;
  counts [ 2 ] -= packs ;
  res += packs ;
  res += ( counts [ 1 ] + 2 ) / 3 + ( counts [ 2 ] + 2 ) / 3 ;
  if ( p == 4 ) {
    int p1 = Math . min ( counts [ 1 ] , counts [ 3 ] ) ;
    counts [ 1 ] -= p1 ;
    counts [ 3 ] -= p1 ;
    res += p1 + counts [ 2 ] / 2 ;
    counts [ 2 ] %= 2 ;
    if ( counts [ 2 ] == 1 && counts [ 1 ] >= 2 ) {
      res += 1 ;
      counts [ 2 ] = 0 ;
      counts [ 1 ] -= 2 ;
    }
    else if ( counts [ 2 ] == 1 && counts [ 3 ] >= 2 ) {
      res += 1 ;
      counts [ 2 ] = 0 ;
      counts [ 3 ] -= 2 ;
    }
    if ( counts [ 2 ] == 1 && ( counts [ 1 ] + counts [ 3 ] > 0 ) ) counts [ 2 ] = 0 ;
    res += ( counts [ 1 ] + 3 ) / 4 + ( counts [ 2 ] + 1 ) / 2 + ( counts [ 3 ] + 3 ) / 4 ;
  }
  return res ;
}
