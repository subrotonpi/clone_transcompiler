{
  m = new int [ 4 ] [ 3 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    m [ i ] [ 0 ] = input . nextInt ( ) ;
  }
  for ( int i = 3 ;
  i >= 0 ;
  i -- ) {
    String ans = "" ;
    for ( int j = 6 ;
    j >= 0 ;
    j -- ) {
      ans += m [ i ] [ j ] ;
    }
    System . out . println ( ans ) ;
  }
  return m ;
}
