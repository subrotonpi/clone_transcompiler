public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] c = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) c [ i ] = Integer . parseInt ( input ) ;
  int maxSeq = 0 ;
  int tempSeq = 1 ;
  int firstSeq = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( c [ i ] == c [ i + 1 ] ) tempSeq ++ ;
    else {
      if ( firstSeq == 0 ) firstSeq = tempSeq ;
      maxSeq = Math . max ( maxSeq , tempSeq ) ;
      tempSeq = 1 ;
    }
  }
  if ( c [ 0 ] == c [ c . length - 1 ] && firstSeq > 0 ) tempSeq += firstSeq ;
  maxSeq = Math . max ( maxSeq , tempSeq ) ;
  if ( maxSeq == N ) System . out . println ( - 1 ) ;
  else System . out . println ( ( maxSeq + 1 ) / 2 ) ;
}
