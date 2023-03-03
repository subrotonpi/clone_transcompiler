public static void findTree ( int [ ] vertex ) {
  int N = ( Integer ) input . nextInt ( ) ;
  int M = ( Integer ) input . nextInt ( ) ;
  boolean [ ] [ ] E = new boolean [ N ] [ M ] ;
  int [ ] [ ] V = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int u = ( Integer ) input . nextInt ( ) ;
    int v = ( Integer ) input . nextInt ( ) ;
    E [ i ] [ 0 ] = u ;
    V [ i ] [ 1 ] = v ;
    V [ i ] [ 2 ] = true ;
  }
  int cnTrees = 0 ;
  /* find tree */
  boolean flag = true ;
  int index = vertex [ 0 ] ;
  int reached = vertex [ 1 ] ;
  if ( reached == 0 ) V [ index - 1 ] [ 1 ] = 1 ;
  searched_vertex [ 0 ] = index ;
  while ( searched_vertex [ 0 ] != - 1 ) {
    int i = searched_vertex [ searched_vertex . length - 1 ] ;
    for ( int edgeIndex = 0 ;
    edgeIndex < E . length ;
    edgeIndex ++ ) {
      int u = E [ edgeIndex ] [ 0 ] ;
      int v = E [ edgeIndex ] [ 1 ] ;
      boolean unused = E [ edgeIndex ] [ 2 ] ;
      if ( unused ) {
        if ( u == i ) {
          E [ edgeIndex ] [ 2 ] = false ;
          for ( int ind = 0 ;
          ind < searched_vertex . length ;
          ind ++ ) {
            if ( v == searched_vertex [ ind ] ) {
              flag = false ;
              break ;
            }
          }
          else {
            V [ v - 1 ] [ 1 ] = 1 ;
            searched_vertex [ ind ] = v ;
            break ;
          }
        }
        else if ( v == i ) {
          E [ edgeIndex ] [ 2 ] = false ;
          for ( int ind = 0 ;
          ind < searched_vertex . length ;
          ind ++ ) {
            if ( u == searched_vertex [ ind ] ) {
              flag = false ;
              break ;
            }
          }
          else {
            V [ u - 1 ] [ 1 ] = 1 ;
            searched_vertex [ ind ] = u ;
            break ;
          }
        }
      }
      else {
        searched_vertex [ 0 ] = i ;
      }
    }
  }
  /* find tree */
  for ( index = 0 ;
  index < V . length ;
  index ++ ) {
    reached = V [ index ] [ 2 ] ;
    if ( reached ==