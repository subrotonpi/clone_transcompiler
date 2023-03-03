private static void print ( String input ) {
  int n = Integer . parseInt ( input . substring ( 0 , 1 ) ) ;
  int m = Integer . parseInt ( input . substring ( 1 , n ) ) ;
  int [ ] [ ] A = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    A [ i ] [ 0 ] = i + 1 ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . substring ( 0 , i + 1 ) ) - 1 ;
    A [ a ] [ 0 ] = i + 1 ;
  }
  Arrays . sort ( A , Collections . reverseOrder ( ) ) ;
  List < Integer > K = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( A [ i ] [ 0 ] == 0 ) {
      int [ ] array = A [ i ] ;
      Arrays . sort ( array ) ;
      for ( int j = 0 ;
      j < array . length ;
      j ++ ) {
        K . add ( array [ j ] [ 1 ] ) ;
      }
      break ;
    }
    else {
      K . add ( A [ i ] [ 1 ] ) ;
    }
  }
  for ( int i : K ) {
    System . out . println ( i ) ;
  }
}
