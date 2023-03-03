static final class Edge {
  int i ;
  int j ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Edge > G [ ] = new LinkedList [ N ] ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    G [ i ] = new LinkedList < Edge > ( ) ;
  }
  for ( i = 0 ;
  i < W ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    G [ a - 1 ] . add ( new Edge ( b - 1 , c ) ) ;
    G [ b - 1 ] . add ( new Edge ( a - 1 , c ) ) ;
  }
  return new Edge ( ) {
    @ Override public List < Edge > getEdges ( int o ) {
      double [ ] d = new double [ N ] ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        d [ j ] = Double . POSITIVE_INFINITY ;
      }
      d [ o ] = 0 ;
      LinkedList < Edge > hq = new LinkedList < Edge > ( ) ;
      LinkedList < List < Integer >> prev = new LinkedList < List < Integer >> ( ) ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        prev . add ( new ArrayList < Integer > ( ) ) ;
      }
      HeapSort . sort ( hq , new int [ ] {
        0 , o }
        ) ;
        while ( hq . size ( ) > 0 ) {
          Pair < Integer , Integer > p = HeapSort . sort ( hq ) ;
          int v = p . second ;
          if ( ( d [ v ] < p . first ) && ( d [ v ] > p . first ) ) {
            continue ;
          }
          for ( Edge i : G [ v ] ) {
            if ( ( d [ i . to ] > d [ v ] + i . cost ) ) {
              d [ i . to ] = d [ v ] + i . cost ;
              prev [ i . to ] = prev [ v ] . add ( new ArrayList < Integer > ( ) ) ;
              HeapSort . sort ( hq , new int [ ] {
                d [ i . to ] , i . to }
                ) ;
              }
            }
          }
          return d ;
        }
      }
      ;
    }
    