static final Scanner input = new Scanner ( System . in ) {
  @ Override public void close ( ) {
    int n = input . nextInt ( ) ;
    X = new int [ n ] , Y = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) X [ i ] = input . nextInt ( ) ;
    Y = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) Y [ i ] = input . nextInt ( ) ;
    U = new int [ n ] ;
    V = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) U [ i ] = input . nextInt ( ) - i ;
    V [ i ] = input . nextInt ( ) - i ;
    int d = Math . max ( Math . max ( U . max ( U . min ( ) , V . max ( ) ) , U . max ( V . min ( ) , V . max ( ) ) ) , i ) ;
    for ( int i = 0 , j = ( max ( U . max ( ) - d / 2 , d / 2 + min ( U . min ( ) ) ) ) ;
    j < d ;
    j ++ ) {
      int px = ( i + j ) / 2 , py = ( - i + j ) / 2 ;
      Set < Integer > s = new HashSet < Integer > ( ) ;
      for ( int x = 0 ;
      x < X . length ;
      x ++ ) s . add ( Math . abs ( px - x ) + Math . abs ( py - y ) ) ;
      if ( s . size ( ) > 1 ) break ;
    }
    else {
      System . out . println ( px + " " + py ) ;
      break ;
    }
  }
}
