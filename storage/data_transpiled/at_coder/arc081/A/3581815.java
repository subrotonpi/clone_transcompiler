static final int [ ] getOccurrences ( int N ) {
  final int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final Counter < String > c = new ClassicCounter < String > ( A ) ;
  final List < Entry < String , Integer >> cL = c . entrySet ( ) ;
  final List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( Entry < String , Integer > e : cL ) {
    if ( e . getValue ( ) >= 4 ) {
      l . add ( e . getKey ( ) ) ;
      l . add ( e . getKey ( ) ) ;
    }
    else if ( e . getValue ( ) >= 2 ) {
      l . add ( e . getKey ( ) ) ;
    }
  }
  Collections . sort ( l ) ;
  if ( l . size ( ) >= 2 ) {
    System . out . println ( l . get ( l . size ( ) - 1 ) * l . get ( l . size ( ) - 2 ) ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
  return l . toArray ( new Integer [ l . size ( ) ] ) ;
}
