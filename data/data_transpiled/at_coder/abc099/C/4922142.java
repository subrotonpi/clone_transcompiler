public static int [ ] getDistance ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] dp = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < dp . length ;
  i ++ ) dp [ i ] = 0 ;
  dp [ 1 ] = 1 ;
  ArrayList < Integer > kazu = new ArrayList < > ( ) ;
  kazu . add ( 1 ) ;
  int i = 6 ;
  while ( i <= N ) {
    kazu . add ( i ) ;
    i *= 6 ;
  }
  i = 9 ;
  while ( i <= N ) {
    kazu . add ( i ) ;
    i *= 9 ;
  }
  Collections . sort ( kazu ) ;
  int kazulazor = kazu . size ( ) ;
  int [ ] temp = new int [ N + 1 ] ;
  temp [ 0 ] = 1 ;
  int lentemp = 1 ;
  int index = 1 ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    int [ ] kouho = new int [ N + 1 ] ;
    if ( index < kazulazor && i == kazu . get ( index ) ) {
      temp [ index ] = i ;
      index ++ ;
      lentemp ++ ;
    }
    for ( int j = 0 ;
    j < lentemp ;
    j ++ ) kouho [ j ] = dp [ i - temp [ j ] ] + 1 ;
    dp [ i ] = Math . min ( kouho , 0 ) ;
  }
  System . out . println ( String . valueOf ( dp [ N ] ) ) ;
  return dp ;
}
