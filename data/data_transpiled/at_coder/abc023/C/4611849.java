static final String [ ] getStrings ( String [ ] inputLines ) {
  final String [ ] strings = new String [ inputLines . length ] ;
  for ( int sl = 0 ;
  sl < inputLines . length ;
  sl ++ ) {
    strings [ sl ] = inputLines [ sl ] . trim ( ) . split ( " " ) ;
  }
  final String [ ] strings = new String [ strings . length ] ;
  for ( int sl = 0 ;
  sl < strings . length ;
  sl ++ ) {
    strings [ sl ] = strings [ sl ] . trim ( ) ;
  }
  final int [ ] rCandies = new int [ R ] ;
  final int [ ] cCandies = new int [ C ] ;
  for ( int i = 0 ;
  i < strings . length ;
  i ++ ) {
    final int r = i ;
    final int c = i ;
    rCandies [ r - 1 ] ++ ;
    cCandies [ c - 1 ] ++ ;
  }
  final Counter < Integer > rSums = new Counter < Integer > ( ) ;
  final Counter < Integer > cSums = new Counter < Integer > ( ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < K + 1 ;
  i ++ ) {
    count += rSums . getCount ( i ) * cSums . getCount ( K - i ) ;
  }
  for ( int r = 0 ;
  r < strings . length ;
  r ++ ) {
    final int c = i ;
    final int gotCandies = rCandies [ r - 1 ] + cCandies [ c - 1 ] ;
    if ( gotCandies == K ) {
      count -- ;
    }
    if ( gotCandies == K + 1 ) {
      count ++ ;
    }
  }
  return strings ;
}
