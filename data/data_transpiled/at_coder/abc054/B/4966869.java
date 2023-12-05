public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] arr1 = new int [ n ] [ m ] ;
  int [ ] [ ] arr2 = new int [ n ] [ m ] ;
  int count = 0 ;
  for ( int i = 0 ;
  i < n - m + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < n - m + 1 ;
    j ++ ) {
      boolean flag = true ;
      for ( int k = 0 ;
      k < m ;
      k ++ ) {
        for ( int l = 0 ;
        l < m ;
        l ++ ) {
          if ( arr1 [ i + k ] [ j + l ] != arr2 [ k ] [ l ] ) {
            flag = false ;
          }
        }
      }
      if ( flag ) {
        count ++ ;
      }
    }
  }
  if ( count >= 1 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
