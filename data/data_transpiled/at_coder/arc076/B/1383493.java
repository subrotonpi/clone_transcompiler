public static Edge < Integer , Integer > createEdge ( int u , int v , int cost ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int x [ ] = new int [ N ] ;
  int y [ ] = new int [ N ] ;
  List < Coordinate > Coordinates = new ArrayList < Coordinate > ( ) ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    x [ i ] = i ;
    y [ i ] = i ;
  }
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  Edges . add ( new Edge < Integer , Integer > ( x [ i ] , y [ i ] , n ) ) ;
  int [ ] par = new int [ N ] ;
  int [ ] rank = new int [ N ] ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    par [ i ] = i ;
    rank [ i ] = 0 ;
  }
  int V = 2 * ( N - 1 ) ;
  System . out . println ( kruskal ( ) ) ;
}
