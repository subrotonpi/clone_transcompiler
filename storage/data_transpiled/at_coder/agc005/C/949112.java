public static int N = Integer . parseInt ( input ) {
  List < Integer > A = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  Collections . sort ( A ) ;
  int maxv1 = A . get ( A . size ( ) - 1 ) ;
  int maxv2 = A . get ( A . size ( ) - 2 ) ;
  if ( maxv1 != maxv2 ) {
    System . out . println ( "Impossible" ) ;
    exit ( ) ;
  }
  int K = maxv1 ;
  if ( K % 2 == 0 ) {
    for ( int i = 0 ;
    i < K / 2 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 2 ;
      j ++ ) {
        if ( A . contains ( K - i ) ) {
          A . remove ( K - i ) ;
        }
        else {
          System . out . println ( "Impossible" ) ;
          exit ( ) ;
        }
      }
    }
    if ( A . contains ( K / 2 ) ) {
      A . remove ( K / 2 ) ;
    }
    else {
      System . out . println ( "Impossible" ) ;
      exit ( ) ;
    }
  }
  else {
    for ( int i = 0 ;
    i < K / 2 + 1 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 2 ;
      j ++ ) {
        if ( A . contains ( K - i ) ) {
          A . remove ( K - i ) ;
        }
        else {
          System . out . println ( "Impossible" ) ;
          exit ( ) ;
        }
      }
    }
  }
  if ( A . size ( ) == 0 ) {
    System . out . println ( "Possible" ) ;
    exit ( ) ;
  }
  else {
    for ( int a : A ) {
      if ( K % 2 == 0 ) {
        if ( a < K / 2 + 1 ) {
          System . out . println ( "Impossible" ) ;
          exit ( ) ;
        }
      }
      else {
        if ( a < ( K + 1 ) / 2 + 1 ) {
          System . out . println ( "Impossible" ) ;
          exit ( ) ;
        }
      }
    }
    System . out . println ( "Possible" ) ;
  }
  return A . size ( ) ;
}
