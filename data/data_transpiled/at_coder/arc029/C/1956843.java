@ VisibleForTesting static void heapSort ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] parent = new int [ N + 1 ] ;
  Arrays . fill ( parent , 0 ) ;
  int [ ] rank = new int [ N + 1 ] ;
  int [ ] roads = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    heapSort ( roads , new int [ ] {
      Integer . parseInt ( input . nextLine ( ) ) , 0 , i }
      ) ;
    }
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      int a = Integer . parseInt ( input . nextLine ( ) ) ;
      int b = Integer . parseInt ( input . nextLine ( ) ) ;
      int r = Integer . parseInt ( input . nextLine ( ) ) ;
      heapSort ( roads , new int [ ] {
        r , a , b }
        ) ;
      }
      /* get root */
      if ( parent [ 0 ] == node ) {
        return ;
      }
      int root = root ( parent [ 0 ] ) ;
      parent [ 0 ] = root ;
      /* is group */
      if ( root == root ) {
        return ;
      }
      /* union */
      int rank [ ] ;
      int rootA = root ( a ) ;
      int rootB = root ( b ) ;
      int rankA = rank [ rootA ] ;
      int rankB = rank [ rootB ] ;
      if ( rankA < rankB ) {
        parent [ rootA ] = rootB ;
      }
      else {
        parent [ rootB ] = rootA ;
        if ( rankA == rankB ) {
          rank [ rootA ] ++ ;
        }
      }
      int ans = 0 ;
      for ( int i = 0 ;
      i < roads . length ;
      i ++ ) {
        int cost = heapSort ( roads , i ) ;
        int a = parent [ i ] ;
        int b = parent [ i ] ;
        if ( isGroup ( a , b ) ) {
          continue ;
        }
        /* union */
        ans += cost ;
      }
      System . out . println ( ans ) ;
    }
    