@ Nonnull public static < T > PriorityQueue < T > dijkstra ( T source , Function < T , Integer > visit , @ Nullable String weight , T target , float infinity ) {
  if ( weight == null ) {
    return new PriorityQueue < T > ( ) {
      @ Override public int size ( ) {
        return 1 ;
      }
    }
    ;
  }
  if ( target == null ) {
    return new PriorityQueue < T > ( ) {
      @ Override public boolean isEmpty ( ) {
        return false ;
      }
    }
    ;
  }
  final HashMap < T , Integer > distances = new HashMap < T , Integer > ( ) ;
  final HashMap < T , Integer > parents = new HashMap < T , Integer > ( ) ;
  final PriorityQueue < T > queue = new PriorityQueue < T > ( ) ;
  queue . add ( new PriorityQueue < T > ( 0 , source ) ) ;
  visited . add ( source ) ;
  while ( queue . size ( ) > 0 ) {
    int R = Integer . parseInt ( readLine ( ) ) ;
    int C = Integer . parseInt ( readLine ( ) ) ;
    int F = Integer . parseInt ( readLine ( ) ) ;
    int [ ] [ ] maze = new int [ R ] [ C ] ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      maze [ i ] = new PriorityQueue < T > ( ) ;
    }
    int cost = solve ( R , C , F , maze ) ;
    if ( cost != 0 && target . equals ( source ) ) {
      break ;
    }
    visited . add ( source ) ;
    for ( int i = 0 ;
    i < C ;
    i ++ ) {
      T neighbor = visit . apply ( source ) ;
      if ( ! visited . contains ( neighbor ) ) {
        int newNeighborDist = sourceDist + weight ( source , neighbor ) ;
        int oldNeighborDist = distances . putIfAbsent ( neighbor , infinity ) ;
        if ( newNeighborDist < oldNeighborDist ) {
          distances . put ( neighbor , newNeighborDist ) ;
          parents . put ( neighbor , new ArrayList < T > ( ) ) ;
          queue . add ( neighbor ) ;
        }
      }
    }
    while ( queue . size ( ) > 0 && visited . contains ( queue . poll ( ) ) ) {
      queue . remove ( queue . poll ( ) ) ;
    }
  }
  return new PriorityQueue < T > ( distances , parents ) ;
}
