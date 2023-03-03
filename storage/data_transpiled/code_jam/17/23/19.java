public static double [ ] [ ] makeBetterDistances ( double [ ] [ ] distances ) {
  int n = distances . length ;
  boolean converged = false ;
  while ( ! converged ) {
    converged = true ;
    for ( int x = 0 ;
    x < n ;
    x ++ ) {
      for ( int y = 0 ;
      y < n ;
      y ++ ) {
        for ( int z = 0 ;
        z < n ;
        z ++ ) {
          if ( x != y && x != z && y != z ) {
            double before = distances [ x ] [ z ] ;
            if ( distances [ x ] [ y ] != - 1 && distances [ y ] [ z ] != - 1 ) {
              distances [ x ] [ z ] = Math . min ( distances [ x ] [ z ] , distances [ x ] [ y ] + distances [ y ] [ z ] ) ;
            }
          }
          double [ ] [ ] res = new double [ n ] [ n ] ;
          for ( int j = 0 ;
          j < n ;
          j ++ ) {
            double [ ] pair = makeBetterDistances ( distances ) ;
            int n = horses . length ;
            double [ ] [ ] minConnections = new double [ n ] [ n ] ;
            for ( int i = 0 ;
            i < n ;
            i ++ ) {
              minConnections [ i ] = new double [ n ] ;
              for ( int j = 0 ;
              j < n ;
              j ++ ) {
                minConnections [ i ] [ j ] = Double . MAX_VALUE ;
              }
            }
            converged = false ;
            while ( ! converged ) {
              converged = true ;
              for ( int y = 0 ;
              y < n ;
              y ++ ) {
                double [ ] horse = horses [ y ] ;
                for ( int z = 0 ;
                z < n ;
                z ++ ) {
                  if ( z != y ) {
                    double distance = distances [ y ] [ z ] ;
                    if ( distance != - 1 ) {
                      if ( distance <= horse [ 0 ] ) {
                        double before = minConnections [ y ] [ z ] ;
                        minConnections [ y ] [ z ] = Math . min ( minConnections [ y ] [ z ] , ( double ) distance / horse [ 1 ] ) ;
                        double after = minConnections [ y ] [ z ] ;
                        if ( before != after ) {
                          converged = false ;
                        }
                      }
                    }
                  }
                }
              }
            }
            return minConnections [ pair [ 0 ] - 1 ] [ pair [ 1 ] - 1 ] ;
          }
        }
      }
    }
    return distances ;
  }
  