@ VisibleForTesting static LinkedHashMap < Integer , Integer > getDijkstra ( ) {
  final int h = Integer . parseInt ( input . nextLine ( ) ) ;
  final int w = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] c = new int [ 10 ] [ h ] ;
  for ( int i = 0 ;
  i < c . length ;
  i ++ ) {
    c [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final int [ ] [ ] a = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final int INF = 10 * 9 ;
  class Dijkstra {
    int [ ] [ ] adj ;
    int num = adj . length ;
    int [ ] dist = new int [ num ] ;
    int [ ] prev = new int [ num ] ;
    int [ ] q = new int [ num ] ;
    @ Override public void reset ( ) {
      dist = new int [ num ] ;
      prev = new int [ num ] ;
      q [ 0 ] = INF ;
    }
    @ Override public int [ ] calc ( int start , int goal ) {
      dist [ start ] = 0 ;
      heapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheap @ @