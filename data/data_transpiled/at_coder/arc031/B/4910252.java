static final String getExample ( ) {
  System . setSecurityManager ( new RMISecurityManager ( ) ) ;
  System . setSecurityManager ( new RMISecurityManager ( ) ) ;
  List l_org = new ArrayList ( ) ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    l_org . add ( new LinkedList ( input . readLine ( ) ) ) ;
  }
  String [ ] [ ] idl = new String [ 10 ] [ 10 ] ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    idl [ i ] = new String [ 10 ] ;
    for ( int j = 0 ;
    j < 10 ;
    j ++ ) {
      idl [ i ] [ j ] = "x" ;
    }
    int [ ] dx = {
      1 , 0 , - 1 , 0 }
      ;
      int [ ] dy = {
        0 , 1 , 0 , - 1 }
        ;
        /* if (0<=y&&y<10) {
        if (l[y][x] == "o") {
        l[y][x] = "x";
        for (int k=0;k<4;k++) {
        int ny = y + dy[k];
        int nx = x + dx[k];
        dfs(ny, nx);
        }
        }
        }*/
      }
      String ans = "NO" ;
      for ( int cy = 0 ;
      cy < 10 ;
      cy ++ ) {
        for ( int cx = 0 ;
        cx < 10 ;
        cx ++ ) {
          List l = new ArrayList ( l_org ) ;
          l . get ( cy ) [ cx ] = "o" ;
          dfs ( cy , cx ) ;
          if ( l . equals ( idl ) ) {
            ans = "YES" ;
            break ;
          }
        }
      }
      System . out . println ( ans ) ;
      return ans ;
    }
    