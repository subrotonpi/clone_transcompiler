static final int [ ] getBits ( InputStream in , int [ ] bits , int prevoffset ) throws IOException {
  DEBUG = false ;
  int [ ] parts ;
  int got ;
  int [ ] known = new int [ bits . length ] ;
  int index ;
  int d ;
  boolean answered ;
  int diff ;
  int poss ;
  int expected ;
  int index ;
  int poss ;
  int poss ;
  {
    parts = in . available ( ) ;
    got = 0 ;
    known [ index ] = 0 ;
    poss = 0 ;
    while ( bit <= index ) {
      diff = ( ( index & bit ) - ( ( index - 1 ) & bit ) ) / bit ;
      if ( diff == 0 ) {
        d ++ ;
        bit = 1 << d ;
        continue ;
      }
      if ( known [ d ] == 0 ) {
        answered = false ;
        break ;
      }
      total += known [ d ] * diff ;
      d ++ ;
      bit = 1 << d ;
    }
    if ( poss != 0 && poss != total ) return "UNKNOWN" ;
    poss = total ;
  }
  /* print bit, known */
  if ( bits [ 0 ] != 0 ) {
    known [ bit ] = 0 ;
  }
  else {
    known [ bit ] = 0 ;
    poss = 1 ;
  }
  int digit ;
  int poss ;
  int i ;
  int pos = 0 ;
  do {
    digit = bits [ pos ++ ] ;
    digit = bits [ pos ++ ] ;
    poss = 0 ;
  }
  while ( poss != 0 && poss != total ) ;
  if ( i < bits . length ) {
    /* print out */
    if ( in instanceof InputStream && in . read ( ) != - 1 ) {
      in . read ( ) ;
    }
    else {
      in . read ( ) ;
    }
  }
  /* print out */
  if ( in instanceof InputStream ) in . close ( ) ;
  else in . close ( ) ;
  if ( in instanceof InputStream ) in . close ( ) ;
  int ncases = ( ( InputStream ) in ) . skip ( 1 ) ;
  for ( i = 0 ;
  i < ncases ;
  i ++ ) {
    int skip = bits [ i ] ;
    int len = in . read ( ) ;
    int pos = pos - skip ;
    if ( pos >= 0 ) pos -= skip ;
    poss = 0 ;
  }
  /* print out */
  if ( pos < bits . length ) poss = pos ;
  else out . write ( ) ;
  return new int [ ] {
    pos }
    ;
  }
  