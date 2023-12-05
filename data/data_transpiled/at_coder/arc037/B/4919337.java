public static int notwent ( int [ ] camefrom ) {
  for ( int i = 0 ;
  i < camefrom . length ;
  i ++ ) {
    if ( camefrom [ i ] == N ) {
      return ( i ) ;
    }
  }
  final FastScanner input = new FastScanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final boolean [ ] [ ] Lines = new boolean [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Lines [ i ] = new boolean [ N ] ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int u = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
    final int v = Integer . parseInt ( input . nextLine ( ) ) ;
    Lines [ u ] [ v ] = true ;
    Lines [ v ] [ u ] = true ;
  }
  camefrom = new int [ N ] ;
  final Queue < Integer > togo = new LinkedList < Integer > ( ) ;
  while ( ! Arrays . asList ( camefrom ) . contains ( apijwe ) ) {
    int curpos = notwent ( camefrom ) ;
    togo . add ( curpos ) ;
    int itsloop = 0 ;
    camefrom [ curpos ] = curpos ;
    while ( togo . size ( ) > 0 ) {
      curpos = togo . poll ( ) ;
      for ( int to = 0 ;
      to < Lines [ curpos ] . length ;
      to ++ ) {
        final boolean p = Lines [ curpos ] [ to ] ;
        if ( p && to != camefrom [ curpos ] ) {
          if ( camefrom [ to ] != N && itsloop == 0 ) {
            ans -- ;
            itsloop = 1 ;
          }
          else if ( camefrom [ to ] == N ) {
            togo . add ( to ) ;
            camefrom [ to ] = curpos ;
          }
        }
      }
    }
    ans ++ ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
