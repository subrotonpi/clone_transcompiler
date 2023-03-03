public static void print ( int n ) {
  int [ ] arr1 = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    arr1 [ i ] = input . nextInt ( ) ;
  }
  int m = input . nextInt ( ) ;
  int [ ] arr2 = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    arr2 [ i ] = input . nextInt ( ) ;
  }
  int max = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int tmp = arr1 [ i ] - arr2 [ i ] ;
    if ( tmp > max ) {
      max = tmp ;
    }
  }
  System . out . println ( max ) ;
}
