public static void ans ( ) {
  List < Integer > [ ] A = new List [ 4 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  boolean f = false ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      if ( ( i != 3 ) && ( A [ i ] [ j ] == A [ i + 1 ] [ j ] ) ) {
        f = true ;
      }
      else if ( ( i != 0 ) && ( A [ i ] [ j ] == A [ i ] [ j - 1 ] ) ) {
        f = true ;
      }
    }
  }
  ans ( ) ;
}
