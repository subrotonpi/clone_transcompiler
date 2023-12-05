static final Scanner solve = new Scanner ( System . in ) {
  final Scanner fin = new Scanner ( System . in ) ;
  final PrintWriter fout = new PrintWriter ( System . out ) ;
  final int P = Integer . parseInt ( fin . nextLine ( ) ) ;
  final int W = Integer . parseInt ( fin . nextLine ( ) ) ;
  final Set < Integer > adjanced = new HashSet < > ( ) ;
  for ( String w : fin . nextLine ( ) . split ( "\\s+" ) ) {
    final int i = Integer . parseInt ( w ) ;
    final int j = Integer . parseInt ( w ) ;
    adjanced . add ( i ) ;
    adjanced . add ( j ) ;
  }
  final TIntHashSet map = new TIntHashSet ( ) ;
  map . add ( 1 ) ;
  final int q [ ] = new int [ 1 ] ;
  while ( q . length > 0 ) {
    final int p = q [ 0 ] ;
    for ( int j : adjanced . get ( p ) ) {
      if ( ! map . contains ( j ) ) {
        map . add ( j ) ;
        map . add ( map . get ( p ) + 1 ) ;
        q [ 0 ] ++ ;
      }
    }
  }
  print ( map . get ( 0 ) ) ;
  bestLen = 1e10 ;
  bestThreatened = - 1e10 ;
  {
    final Set < Integer > result = new HashSet < > ( ) ;
    for ( int p : planets ) {
      result . addAll ( adjanced . get ( p ) ) ;
    }
    int result = result . size ( ) ;
    if ( planets . length > 1 ) {
      result . removeAll ( planets ) ;
    }
    return result ;
  }
  final int [ ] path = new int [ 1 ] ;
  {
    final int dd = map . get ( path [ path . length - 1 ] ) - 1 ;
    if ( dd == 0 ) {
      final int threatened = threatens ( path ) ;
      if ( threatened > bestThreatened ) {
        bestThreatened = threatened ;
      }
      return result ;
    }
    for ( int next : adjanced . get ( path [ path . length - 1 ] ) ) {
      if ( map . get ( next ) == dd ) {
        path [ path . length - 1 ] = next ;
        rec ( ) ;
        path [ path . length - 1 ] = next ;
      }
    }
  }
}
