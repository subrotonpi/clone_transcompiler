@ VisibleForTesting static Iterable < Map < Integer , Integer >> combinations ( ) {
  final int n = ( Integer ) input . nextInt ( ) ;
  final int x = ( Integer ) input . nextInt ( ) ;
  final int [ ] w = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    w [ i ] = Integer . parseInt ( input . next ( ) ) ;
  }
  return new Iterable < Map < Integer , Integer >> ( ) {
    @ Override public Iterator < Map < Integer , Integer >> iterator ( ) {
      return new Iterator < Map < Integer , Integer >> ( ) {
        @ Override public boolean hasNext ( ) {
          return n < 17 ;
        }
        @ Override public Map < Integer , Integer > next ( ) {
          Map < Integer , Integer > q = new HashMap < Integer , Integer > ( ) ;
          for ( int i : new int [ ] {
            0 , 1 }
            ) {
              int num = 0 ;
              for ( int j = 0 ;
              j < m ;
              j ++ ) num += w [ j ] * i [ j ] ;
              q . put ( num , 1 ) ;
            }
            return q ;
          }
        }
        ;
      }
    }
    ;
  }
  