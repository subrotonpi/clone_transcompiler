public static int [ ] readIntList ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] classroom = new int [ N + 1 + 1 ] ;
  int [ ] start = new int [ M ] ;
  int [ ] end = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    start [ i ] = s ;
    end [ i ] = t ;
    classroom [ s ] ++ ;
    classroom [ t + 1 ] -- ;
  }
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    classroom [ i + 1 ] += classroom [ i ] ;
  }
  int [ ] classCover = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    classCover [ i ] = classroom [ i ] == 1 ? 1 : 0 ;
  }
  int i = 0 ;
  int j = 1 ;
  while ( i <= N ) {
    if ( classCover [ i ] == 1 ) ++ j ;
    classroom [ i ] = j ;
    i ++ ;
  }
  int soujiCount = 0 ;
  ArrayList < Integer > soujiList = new ArrayList < Integer > ( ) ;
  for ( ;
  i < N ;
  i ++ ) {
    final int s = start [ i ] ;
    final int e = end [ i ] ;
    if ( classroom [ e ] - classroom [ s - 1 ] == 0 ) {
      soujiCount ++ ;
      soujiList . add ( i + 1 ) ;
    }
  }
  System . out . println ( soujiCount ) ;
  if ( soujiCount > 0 ) {
    for ( int soujiNum : soujiList ) {
      System . out . println ( soujiNum ) ;
    }
  }
  return soujiList . toArray ( new Integer [ soujiCount ] ) ;
}
