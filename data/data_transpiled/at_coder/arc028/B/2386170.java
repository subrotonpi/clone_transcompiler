@ VisibleForTesting static void heapSort ( ) {
  int n = ( Integer ) input . nextInt ( ) ;
  int k = ( Integer ) input . nextInt ( ) ;
  int [ ] x = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) x [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ k ] [ n ] ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) a [ i ] = new int [ ] {
    - x [ i ] , i + 1 }
    ;
    Arrays . sort ( a ) ;
    System . out . println ( a [ 0 ] [ 1 ] ) ;
    for ( int i = k ;
    i < n ;
    i ++ ) {
      heapSort ( a , - x [ i ] , i + 1 ) ;
      System . out . println ( a [ 0 ] [ 1 ] ) ;
    }
  }
  