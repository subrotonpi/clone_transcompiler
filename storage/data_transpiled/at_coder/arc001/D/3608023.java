@ VisibleForTesting static Iterable < String > permutations ( ) {
  List < List < String >> C = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    C . add ( Collections . singletonList ( input . next ( ) ) ) ;
  }
  List < List < Integer >> Qlist = new ArrayList < > ( ) ;
  List < Integer > xlist = new LinkedList < > ( ) ;
  List < Integer > ylist = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 8 ;
    j ++ ) {
      if ( C . get ( i ) . get ( j ) . equals ( "Q" ) ) {
        Qlist . add ( Arrays . asList ( i , j ) ) ;
        try {
          xlist . remove ( i ) ;
          ylist . remove ( j ) ;
        }
        catch ( IllegalArgumentException e ) {
          System . out . println ( "No Answer" ) ;
          exit ( 0 ) ;
        }
      }
    }
  }
  for ( List < Integer > p : permutations ( xlist ) ) {
    Set < Integer > x_p_y = new HashSet < > ( ) , x_m_y = new HashSet < > ( ) ;
    for ( Integer el : Qlist ) {
      x_p_y . add ( el . intValue ( ) + el . intValue ( ) ) ;
      x_m_y . add ( el . intValue ( ) - el . intValue ( ) ) ;
    }
    List < Integer > temp = Lists . newArrayList ( p ) ;
    for ( int i = 0 ;
    i < 5 ;
    i ++ ) {
      x_p_y . add ( p . get ( i ) + ylist . get ( i ) ) ;
      x_m_y . add ( p . get ( i ) - ylist . get ( i ) ) ;
    }
    if ( x_p_y . size ( ) >= 8 && x_m_y . size ( ) >= 8 ) {
      for ( int i = 0 ;
      i < 5 ;
      i ++ ) {
        Qlist . add ( Arrays . asList ( temp . get ( i ) , ylist . get ( i ) ) ) ;
      }
      List < String > ans = new ArrayList < > ( 8 ) ;
      for ( Integer el : Qlist ) {
        ans . set ( el . intValue ( ) , el . intValue ( ) ) ;
      }
      for ( int i = 0 ;
      i < 8 ;
      i ++ ) {
        System . out . println ( ans . get ( i ) )