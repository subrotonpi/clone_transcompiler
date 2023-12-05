@ VisibleForTesting static int [ ] dijkstra ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = Lists . newArrayList ( ) ;
  int [ ] start = new int [ m ] ;
  int [ ] goal = new int [ m ] ;
  int [ ] time = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    start [ i ] = a - 1 ;
    goal [ i ] = b - 1 ;
    time [ i ] = c ;
  }
  Path path1 = new Path ( time , start , goal ) ;
  Path path2 = new Path ( time , goal , start ) ;
  int [ ] time1 = dijkstra ( path1 , 0 ) ;
  int [ ] time2 = dijkstra ( path2 , 0 ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans = Math . max ( x [ i ] * ( t - time1 [ i ] - time2 [ i ] ) , ans ) ;
  }
  System . out . println ( ( int ) ans ) ;
  return null ;
}
