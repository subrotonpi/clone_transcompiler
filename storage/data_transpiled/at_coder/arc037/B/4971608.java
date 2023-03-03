public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] connect = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int u = Integer . parseInt ( input ) ;
    int v = Integer . parseInt ( input ) ;
    connect [ u - 1 ] [ v - 1 ] = 1 ;
    connect [ v - 1 ] [ u - 1 ] = 1 ;
  }
  ArrayList < Integer > visited = new ArrayList < Integer > ( ) ;
  Stack < Integer > stack = new Stack < Integer > ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ! visited . contains ( i ) ) {
      visited . add ( i ) ;
      stack . push ( i ) ;
      boolean flag = true ;
      while ( stack . size ( ) > 0 ) {
        int p = stack . pop ( ) ;
        for ( int j = 0 ;
        j < n ;
        j ++ ) {
          if ( connect [ p ] [ j ] == 1 ) {
            connect [ p ] [ j ] = 0 ;
            connect [ j ] [ p ] = 0 ;
            stack . push ( j ) ;
            if ( ! visited . contains ( j ) ) {
              visited . add ( j ) ;
            }
            else {
              flag = false ;
            }
          }
        }
      }
      if ( flag ) {
        ans ++ ;
      }
    }
  }
  System . out . println ( ans ) ;
}
