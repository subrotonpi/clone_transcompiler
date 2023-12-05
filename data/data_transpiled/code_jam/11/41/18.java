@ GwtIncompatible ( "Doubles.sort" ) private static void Sort ( ArrayList < ArrayList < Pair < Double , Double >>> WalkList ) {
  ArrayList < Double > V = new ArrayList < > ( ) ;
  ArrayList < ArrayList < Pair < Double , Double >>> Ret = new ArrayList < > ( ) ;
  for ( Pair < Double , Double > pair : WalkList ) {
    V . add ( pair . getValue ( ) ) ;
  }
  Collections . sort ( V ) ;
  while ( WalkList . size ( ) > 0 ) {
    for ( ArrayList < Pair < Double , Double >> row : WalkList ) {
      if ( row . getValue ( ) == V . get ( 0 ) ) {
        V . remove ( 0 ) ;
        Ret . add ( row ) ;
        WalkList . remove ( row ) ;
      }
    }
  }
  Collections . sort ( Ret ) ;
  int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
    Arrays . stream ( X . split ( scanner . nextLine ( ) ) ) . forEach ( X -> {
      double S = scanner . nextDouble ( ) ;
      double R = scanner . nextDouble ( ) ;
      double t = scanner . nextDouble ( ) ;
      double N = scanner . nextDouble ( ) ;
      ArrayList < Double > Data = new ArrayList < > ( ) ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        Data . add ( Double . parseDouble ( scanner . nextLine ( ) ) ) ;
      }
      ArrayList < Double > Walks = new ArrayList < > ( ) ;
      double ToDo = X ;
      for ( Double row : Data ) {
        Walks . add ( row . doubleValue ( ) - row . doubleValue ( ) ) ;
        ToDo -= row . doubleValue ( ) - row . doubleValue ( ) ;
      }
      Walks . add ( ToDo , 0 ) ;
      ArrayList < Pair < Double , Double >> SWalks = Sort ( Walks ) ;
      double Time = 0. ;
      double CanRun = t + 0. ;
      for ( Pair < Double , Double > pair : SWalks ) {
        double t0 = pair . doubleValue ( ) / ( R + pair . doubleValue ( ) + 0. ) ;
        if ( t0 <= CanRun ) {
          Time += t0 ;
          CanRun -= t0 ;
        }
        else {
          double d1 = ( CanRun ) * ( pair . doubleValue ( ) + R ) ;
          double d2 = pair .