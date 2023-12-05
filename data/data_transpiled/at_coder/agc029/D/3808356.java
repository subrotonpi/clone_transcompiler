static void ? ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int H = input . nextInt ( ) ;
  final int W = input . nextInt ( ) ;
  final int N = input . nextInt ( ) ;
  final Map < ? , Integer > dT = new HashMap < > ( ) ;
  int ? = H ;
  if ( N > 0 ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int x = input . nextInt ( ) - 1 ;
      int y = input . nextInt ( ) ;
      if ( x >= y ) {
        ? ? = x - y ;
        ? ? = x + y ;
        if ( dT . containsKey ( ? ? ? : dT . get ( x ) ) ) {
          if ( ? ? < dT . get ( ? ? ? ? ) . intValue ( ) ) {
            dT . put ( ? ? ? ? , new Integer ( x ) ) ;
          }
        }
        else {
          dT . put ( ? ? ? ? , new Integer ( x ) ) ;
        }
      }
    }
    final List < Entry < Integer , Integer >> aB = new ArrayList < > ( dT . entrySet ( ) ) ;
    int iL = aB . size ( ) ;
    if ( iL == 1 ) {
      if ( 0 < aB . get ( 0 ) . intValue ( ) ) {
        ? ? = aB . get ( 0 ) . intValue ( ) ;
      }
    }
    else if ( 1 < iL ) {
      final List < Entry < Integer , Integer >> aG = new ArrayList < > ( ) ;
      for ( int i = 1 ;
      i < iL ;
      i ++ ) {
        if ( aB . get ( i ) . intValue ( ) - 1 == aB . get ( i - 1 ) . intValue ( ) ) {
          if ( aB . get ( i ) . intValue ( ) < aG . get ( i - 1 ) . intValue ( ) ) {
            aG . add ( aB . get ( i ) . intValue ( ) ) ;
          }
        }
        else {
          aG . add ( aB . get ( i ) . intValue ( ) ) ;
        }
      }
      if ( aG . size ( ) > 0 ) {
        ? = new ArrayList < > ( aG ) ;
      }
    }
  }
  System . out . println ( ? ? ? ) ;
}
