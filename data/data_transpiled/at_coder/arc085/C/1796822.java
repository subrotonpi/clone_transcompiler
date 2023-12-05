static final double INF = Double . MAX_VALUE ;
return ( new fulkerson ( ) {
  int [ ] [ ] graph = new int [ N + 2 ] [ N + 1 ] ;
  int srcId = 0 ;
  int dstId = N + 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int n = graph [ i ] . length ;
    int [ ] [ ] matrix = new int [ n ] [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      int N = Integer . parseInt ( input . nextLine ( ) ) ;
      int [ ] [ ] bothDirGraph = new int [ n ] [ n ] ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        int nodeId = graph [ i ] [ j ] ;
        for ( int nodeId2 = 0 ;
        nodeId2 < graph [ i ] . length ;
        nodeId2 ++ ) {
          int flowLimit = graph [ i ] [ j ] ;
          matrix [ nodeId ] [ nodeId2 ] = flowLimit ;
          bothDirGraph [ nodeId ] [ nodeId2 ] = graph [ i ] [ j ] ;
        }
      }
      int n ;
      if ( getClass ( ) . getName ( ) . equals ( "main" ) ) {
        main ( ) ;
      }
      else {
        int [ ] path = findPath ( bothDirGraph , matrix , src , sink ) ;
        if ( path . length == 0 ) {
          break ;
        }
        int v = Math . min ( matrix [ path [ 0 ] ] [ path [ 1 ] ] , matrix [ path [ 0 ] . length - 1 ] ) ;
        for ( int i = 0 ;
        i < path . length - 1 ;
        i ++ ) {
          int node1 = path [ i ] ;
          int node2 = path [ i + 1 ] ;
          matrix [ node1 ] [ node2 ] -= v ;
          matrix [ node2 ] [ node1 ] += v ;
        }
      }
      return ( new int [ ] {
        Integer . parseInt ( graph [ src ] [ dstId ] ) }
        ) ;
      }
    }
    private int findPath ( int [ ] [ ] bothDirGraph , int [ ] [ ] matrix , int src , int sink ) {
      int [ ] prevs = new int [ matrix . length ] ;
      HashSet < Integer > q = new HashSet < Integer > ( ) ;
      for ( int i = 0 ;
      i < graph . length ;
      i ++ ) {
        prevs [ i ] = null ;
      }
      HashSet < Integer > path = new HashSet < Integer > ( )