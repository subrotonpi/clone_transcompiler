public static int dijkstra ( int p , List < List < Integer >> edges ) {
  int [ ] conquer = new int [ p + 1 ] ;
  conquer [ 0 ] = 0 ;
  List < List < Integer >> [ ] paths = new List [ p ] ;
  for ( int i = 0 ;
  i < p ;
  i ++ ) paths [ i ] = new ArrayList < > ( ) ;
  paths [ 0 ] = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < p ;
  i ++ ) paths [ i ] . add ( new ArrayList < > ( ) ) ;
  paths [ 0 ] = new ArrayList < > ( ) ;
  for ( int distance = 0 ;
  distance < p ;
  distance ++ ) {
    List < Integer > choices = Splitter . on ( ',' ) . splitToList ( conquer [ i ] ) ;
    for ( int target = 0 ;
    target < p ;
    target ++ ) {
      if ( conquer [ target ] > distance ) {
        for ( Integer choice : choices ) {
          if ( ( choice = edges . get ( choice ) ) . contains ( target ) ) {
            conquer [ target ] = distance + 1 ;
            for ( List < Integer > path : paths [ choice ] ) paths [ choice ] . add ( path . add ( target ) ) ;
          }
        }
      }
      if ( conquer [ 1 ] <= p ) return distance + 1 ;
    }
  }
  return p + 1 ;
}
