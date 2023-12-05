static final PriorityQueue < Integer > TRIES_QUILER = new PriorityQueue < Integer > ( ) {
  private final int N ;
  private int M ;
  private int T ;
  private PriorityQueue < Integer > queue ;
  private PriorityQueue < Integer > set ;
  {
    this . set = set ;
    this . count = 0 ;
  }
  public boolean isEmpty ( ) {
    return this . count == 0 ;
  }
  public Integer dequeue ( ) {
    if ( this . isEmpty ( ) ) {
      throw new IllegalStateException ( "empty" ) ;
    }
    this . count -- ;
    return heapq . size ( ) ;
  }
  public void enqueue ( int v ) {
    this . count ++ ;
    heapq . add ( v ) ;
  }
  public int size ( ) {
    return this . count ;
  }
}
;
/* dijkstra */
private static int [ ] dijkstra ( @ Nonnull int [ ] [ ] graph , int s ) {
  final float INF = Float . POSITIVE_INFINITY ;
  final float [ ] d = new float [ graph . length ] ;
  Arrays . fill ( d , INF ) ;
  d [ s ] = 0 ;
  PriorityQueue < Integer > q = new PriorityQueue < Integer > ( ) ;
  q . enqueue ( new PriorityQueue < Integer > ( d , s ) ) ;
  while ( ! q . isEmpty ( ) ) {
    final int u = q . dequeue ( ) ;
    for ( int v = 0 ;
    v < graph [ u ] . length ;
    v ++ ) {
      final int c = graph [ u ] [ v ] ;
      final float alt = d [ u ] + c ;
      if ( alt < d [ v ] ) {
        d [ v ] = alt ;
        q . enqueue ( new PriorityQueue < Integer > ( d [ v ] , v ) ) ;
      }
    }
    return d ;
  }
  public int treasureHant ( int N , int M , int T , int [ ] [ ] A , int [ ] [ ] edges ) {
    final int [ ] [ ] forward = new int [ N ] [ ] ;
    final int [ ] [ ] backward = new int [ N ] [ ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      forward [ i ] = new int [ M ] ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        forward [ j ] [ j ] = Integer . parseInt ( input . readLine ( ) ) ;
        backward [ j ] [ j ] = Integer . parseInt ( input . readLine ( ) ) ;
      }
    }
    final int [ ] df = dijkstra ( forward , 0 )