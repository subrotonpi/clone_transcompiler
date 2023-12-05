public static boolean dfs ( int start ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] ed = new int [ n ] [ m ] ;
  int [ ] [ ] v = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    ed [ l - 1 ] [ r ] = new int [ r - 1 ] ;
    ed [ r - 1 ] [ l ] = new int [ r ] ;
    ed [ l - 1 ] [ r ] = new int [ d ] ;
    v [ l - 1 ] [ r ] = 0 ;
  }
  boolean [ ] visited = new boolean [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Stack < Integer > s = new Stack < Integer > ( ) ;
    s . push ( start ) ;
    v [ i ] = 0 ;
    while ( s . size ( ) > 0 ) {
      int label = s . pop ( ) ;
      if ( visited [ label ] == false ) {
        visited [ label ] = true ;
        for ( int j = 0 ;
        j < ed [ label ] . length ;
        j ++ ) {
          int to = ed [ label ] [ j ] ;
          int dist = ed [ label ] [ j ] ;
          if ( v [ to ] == 0 ) {
            v [ to ] = v [ label ] + dist ;
            s . push ( to ) ;
          }
          else {
            if ( v [ to ] != v [ label ] + dist ) {
              return false ;
            }
          }
        }
      }
    }
  }
  boolean isExist = true ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( v [ i ] == 0 ) {
      if ( ! dfs ( i ) ) {
        System . out . println ( "No" ) ;
        isExist = false ;
        break ;
      }
    }
  }
  if ( isExist ) {
    System . out . println ( "Yes" ) ;
  }
  return true ;
}
