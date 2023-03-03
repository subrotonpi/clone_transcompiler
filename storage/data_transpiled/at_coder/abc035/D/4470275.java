static final int [ ] [ ] getDistance ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  int t = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] A = new int [ n ] [ ] ;
  int [ ] [ ] dis = new int [ n ] [ ] ;
  int [ ] [ ] disrev = new int [ n ] [ ] ;
  double [ ] mindis = new double [ n ] ;
  double [ ] mindisrev = new double [ n ] ;
  PriorityQueue < int [ ] > q = new PriorityQueue < int [ ] > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    int c = Integer . parseInt ( input . readLine ( ) ) ;
    dis [ a - 1 ] [ b ] = ( int ) c ;
    disrev [ b - 1 ] [ a ] = ( int ) c ;
  }
  heapq . add ( q ) ;
  while ( q . size ( ) != 0 ) {
    int cost = heapq . poll ( ) ;
    int town = dis [ 0 ] [ 0 ] ;
    if ( mindis [ town ] < cost ) continue ;
    mindis [ town ] = cost ;
    for ( int [ ] adj : dis [ town ] ) {
      int adjTown = adj [ 0 ] ;
      double adjCost = adj [ 1 ] ;
      heapq . add ( q ) ;
    }
  }
  heapq . add ( q ) ;
  while ( q . size ( ) != 0 ) {
    int cost = heapq . poll ( ) ;
    int town = disrev [ 0 ] [ 0 ] ;
    if ( mindisrev [ town ] < cost ) continue ;
    mindisrev [ town ] = cost ;
    for ( int [ ] adj : disrev [ town ] ) {
      int adjTown = adj [ 0 ] ;
      double adjCost = adj [ 1 ] ;
      heapq . add ( q ) ;
    }
  }
  int ans = 0 ;
  for ( int town = 0 ;
  town < n ;
  town ++ ) {
    int time = mindis [ town ] + mindisrev [ town ] ;
    if ( t < time ) continue ;
    int money = ( t - time ) * A [ town ] ;
    ans = Math . max ( ans , money ) ;
  }
  