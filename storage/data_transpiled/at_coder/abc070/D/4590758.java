static final DijkstraSolver < Integer > getSolver ( ) {
  final int nodeNum = graph . size ( ) ;
  final int startPoint = startPoint ;
  final int goalPoint = goalPoint ;
  dist = new double [ nodeNum ] ;
  prev = new int [ nodeNum ] ;
  for ( int i = 0 ;
  i < nodeNum ;
  i ++ ) {
    dist [ i ] = Double . MAX_VALUE ;
    prev [ i ] = Double . MIN_VALUE ;
  }
  return new DijkstraSolver < Integer > ( ) {
    @ Override public Integer run ( ) {
      dist [ i ] = 0 ;
      PriorityQueue < Integer > heapQueue = new PriorityQueue < Integer > ( ) ;
      HeapUtils . heapPriorityQueue ( heapQueue , new HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . HeapUtils . Heap @ @