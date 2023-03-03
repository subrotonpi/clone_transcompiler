private static int Dijkstra ( int N , int M , int Tide , int [ ] [ ] Ceil , int [ ] [ ] Floor ) {
  int height = Tide ;
  int [ ] [ ] Best = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Best [ i ] [ 0 ] = 9e9 ;
  int [ ] [ ] = new int [ M ] [ M ] ;
  int [ ] [ ] Best [ 0 ] [ 0 ] = 0 ;
  int [ ] [ ] Start = new int [ N ] [ M ] ;
  while ( Start [ 0 ] != 0 ) {
    Arrays . fill ( Best [ 0 ] [ 0 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 1 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 1 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 1 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 2 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 2 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 3 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 4 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 5 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 6 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 7 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 8 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 9 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 9 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 9 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 9 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 9 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 9 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 9 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 9 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 9 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 9 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 9 ] , 0 ) ;
    Arrays . fill ( Best [ 0 ] [ 9 ] , 0 ) ;
  }
  System . out . println ( Best [ N - 1 ] [