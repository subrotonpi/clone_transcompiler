public static void print ( int N ) {
  int [ ] [ ] m = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    m [ i ] [ i ] = input . nextInt ( ) ;
  }
  int b = 0 ;
  boolean cont = false ;
  for ( int j = 0 ;
  j < 9 ;
  j ++ ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      char f = m [ i ] [ j ] ;
      if ( f != 'o' ) {
        if ( cont == true ) cont = false ;
        if ( f == 'x' ) b ++ ;
      }
      else {
        if ( ! cont ) {
          b ++ ;
          cont = true ;
        }
      }
    }
  }
  System . out . println ( b ) ;
}
