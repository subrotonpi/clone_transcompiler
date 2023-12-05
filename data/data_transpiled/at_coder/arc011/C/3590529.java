@ VisibleForTesting static void input ( ) {
  final String first = input . nextLine ( ) ;
  final String last = input . nextLine ( ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final Set < String > wordSet = new THashSet < > ( ) ;
  for ( String l : System . in ) wordSet . add ( l . replaceAll ( " " , "" ) ) ;
  wordSet . add ( first ) ;
  wordSet . add ( last ) ;
  final char [ ] alphabets = new char [ 97 ] ;
  for ( int i = 97 ;
  i < 123 ;
  i ++ ) alphabets [ i ] = ( char ) i ;
  final Deque < String > dq = new ArrayDeque < > ( ) ;
  dq . add ( new String ( first ) ) ;
  final Deque < String > popLeft = dq . pop ( ) ;
  final Deque < String > append = dq . append ( first ) ;
  final Set < String > used = new THashSet < > ( ) ;
  used . add ( first ) ;
  final Set < String > addUsed = used . add ( last ) ;
  while ( dq . size ( ) > 0 ) {
    final String word = popLeft . poll ( ) ;
    final String [ ] path = new String [ alphabets . length ] ;
    for ( int i = 0 ;
    i < path . length ;
    i ++ ) {
      path [ i ] = path [ i ] ;
      if ( word . equals ( last ) ) {
        if ( path . length == 1 ) path [ i ] += path [ i ] ;
        System . out . println ( path . length - 2 ) ;
        System . out . print ( ( char ) path [ i ] ) ;
        exit ( ) ;
      }
    }
    final Set < String > s = wordSet . stream ( ) . filter ( word -> word . substring ( 0 , i ) + c + word . substring ( i + 1 ) ) . collect ( Collectors . toSet ( ) ) ;
    for ( String w : s ) {
      addUsed . add ( w ) ;
      append . add ( new String ( w ) ) ;
    }
  }
  else {
    System . out . println ( - 1 ) ;
  }
}
