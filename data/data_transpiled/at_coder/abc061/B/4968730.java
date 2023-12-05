private static int [ ] a ( Scanner input , int n , int m ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int b = input . nextInt ( ) ;
    int c = input . nextInt ( ) ;
    a [ b - 1 ] ++ ;
    a [ c - 1 ] ++ ;
  }
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    System . out . println ( a [ i ] ) ;
  }
  return a ;
}
