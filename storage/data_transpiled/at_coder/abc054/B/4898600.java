public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int s [ ] [ ] = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] = input . nextInt ( ) ;
  int t [ ] [ ] = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) t [ i ] = input . nextInt ( ) ;
  boolean found = false ;
  for ( int i = 0 ;
  i <= n - m ;
  i ++ ) {
    for ( int j = 0 ;
    j <= n - m ;
    j ++ ) {
      boolean f = true ;
      for ( int k = 0 ;
      k < m ;
      k ++ ) {
        for ( int l = 0 ;
        l < m ;
        l ++ ) {
          if ( t [ k ] [ l ] != s [ i + k ] [ j + l ] ) {
            f = false ;
            break ;
          }
        }
      }
      if ( f == true ) found = true ;
    }
  }
  if ( found ) System . out . println ( "Yes" ) ;
  else System . out . println ( "No" ) ;
}
