static final void addNeighbours ( int H , int N , int M , int [ ] [ ] floors , int [ ] [ ] ceils , int [ ] [ ] q , int i , int j , int time ) {
  for ( int k = i , l = j - 1 ;
  k < N && l < M ;
  k ++ , l ++ ) {
    if ( 0 <= k && k < N && 0 <= l && l < M ) {
      if ( ceils [ k ] [ l ] - Math . max ( floors [ i ] [ j ] , floors [ k ] [ l ] ) >= 50 && ceils [ i ] [ j ] - floors [ k ] [ l ] >= 50 ) {
        int dtime ;
        if ( time == 0 && ceils [ k ] [ l ] - H >= 50 ) {
          dtime = 0 ;
        }
        else {
          int water = H - 10 * time ;
          int mini = Math . min ( water , ceils [ k ] [ l ] - 50 ) ;
          dtime = ( water - mini ) / 10 ;
          if ( mini - floors [ i ] [ j ] >= 20 ) {
            dtime ++ ;
          }
          else {
            dtime += 10 ;
          }
        }
        HeapPriorityQueue . offer ( q , new HeapPriorityQueue . Double ( time + dtime , k , l ) ) ;
      }
    }
  }
  /* solve */
  int start = 0 , finish = N - 1 , M - 1 ;
  HashMap < Integer , Integer > map = new HashMap < Integer , Integer > ( ) ;
  map . put ( start , 0 ) ;
  PriorityQueue < Integer > queue = new PriorityQueue < Integer > ( ) ;
  addNeighbours ( H , N , M , floors , ceils , q , 0 , 0 , 0 ) ;
  while ( queue . size ( ) > 0 ) {
    int time = heapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheap @ @