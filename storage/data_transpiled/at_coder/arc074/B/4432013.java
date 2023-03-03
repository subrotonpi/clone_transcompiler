static final long [ ] getBinaryHeaps ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  HeapHeap1 heap1 = new Heap1 ( ) ;
  Heap2 heap2 = new Heap2 ( ) ;
  int [ ] aMax = new int [ n ] ;
  int [ ] bMax = new int [ n ] ;
  long s = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    heap1 . heapAppend ( heap1 , a [ i ] ) ;
    s += a [ i ] ;
  }
  aMax [ n ] = s ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    heap1 . heapAppend ( heap1 , a [ n + i ] ) ;
    int mini = heap1 . heapAppend ( heap1 , a [ n + i ] ) ;
    s = s + a [ n + i ] - mini ;
    aMax [ n + i ] = s ;
  }
  s = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    heap2 . heapAppend ( heap2 , - a [ 2 * n + i ] ) ;
    s = s - a [ 2 * n + i ] ;
  }
  bMax [ n ] = s ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    heap2 . heapAppend ( heap2 , - a [ 2 * n - 1 - i ] ) ;
    int mini = heap2 . heapAppend ( heap2 , a [ 2 * n - 1 - i ] - mini ) ;
    bMax [ n + i ] = s ;
  }
  long ans = aMax [ 0 ] + bMax [ bMax . length - 1 ] ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    long res = aMax [ i ] + bMax [ bMax . length - ( i + 1 ) ] ;
    ans = Math . max ( ans , res ) ;
  }
  System . out . println ( ans ) ;
  return aMax ;
}
