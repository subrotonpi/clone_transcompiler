@ VisibleForTesting static int solve ( ) {
  String s = input . nextLine ( ) ;
  int patlen = s . length ( ) ;
  boolean [ ] pat = new boolean [ patlen ] ;
  for ( int i = 0 ;
  i < patlen ;
  i ++ ) pat [ i ] = ( i == 'o' ) ? true : false ;
  int len = pat . length * 2 ;
  for ( int i = 0 ;
  i < patlen + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      boolean [ ] [ ] zure = new boolean [ i ] [ j ] ;
      for ( int k = 0 ;
      k < i ;
      k ++ ) zure [ k ] = pat [ j ] [ k ] ;
      boolean [ ] newpat = new boolean [ patlen ] ;
      for ( int pl = 0 ;
      pl < patlen ;
      pl ++ ) for ( int j = 0 ;
      j < i ;
      j ++ ) newpat [ pl ] |= zure [ j ] [ pl ] ;
      if ( ! false == newpat [ pl ] ) return i ;
    }
  }
  System . out . println ( solve ( ) ) ;
  return patlen ;
}
