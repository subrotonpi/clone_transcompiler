public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] aArray = new int [ n ] [ n ] ;
  int [ ] [ ] bArray = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < n - m + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < n - m + 1 ;
    j ++ ) {
      boolean f = true ;
      for ( int k = 0 ;
      k < m ;
      k ++ ) {
        for ( int l = 0 ;
        l < m ;
        l ++ ) {
          if ( aArray [ i + k ] [ j + l ] != bArray [ k ] [ l ] ) {
            f = false ;
            break ;
          }
        }
        if ( ! f ) {
          break ;
        }
      }
    }
  }
  System . out . println ( "No" ) ;
}
