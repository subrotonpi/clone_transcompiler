public static int [ ] [ ] graph ( Scanner input , int N , int M ) {
  int [ ] [ ] G = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = input . nextInt ( ) ;
    int b = input . nextInt ( ) ;
    G [ a - 1 ] [ b - 1 ] = input . nextInt ( ) ;
    G [ b - 1 ] [ a - 1 ] = input . nextInt ( ) ;
  }
  List < Integer > V = new ArrayList < > ( ) ;
  int D = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( G [ i ] . length % 2 != 0 ) {
      System . out . println ( "No" ) ;
      break ;
    }
    D = Math . max ( G [ i ] . length , D ) ;
    if ( G [ i ] . length == 4 ) {
      V . add ( i ) ;
    }
  }
  else {
    if ( D >= 6 ) {
      System . out . println ( "Yes" ) ;
    }
    else if ( V . size ( ) != 2 ) {
      System . out . println ( V . size ( ) > 2 ? "Yes" : "No" ) ;
    }
    else {
      int s = V . get ( 0 ) ;
      for ( int i = 0 ;
      i < 3 ;
      i ++ ) {
        int t = G [ s ] [ i ] ;
        G [ t ] [ i ] = G [ t ] [ i ] ;
        while ( ! V . contains ( t ) ) {
          int d = G [ t ] [ i ] ;
          G [ d ] [ i ] = G [ d ] [ i ] ;
          t = d ;
        }
        if ( s == t ) {
          System . out . println ( "Yes" ) ;
          break ;
        }
        else {
          s = t ;
        }
      }
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  return V . toArray ( ) ;
}
