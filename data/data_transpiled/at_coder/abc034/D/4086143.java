public static int n = Integer . parseInt ( input ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] g = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int w = Integer . parseInt ( input . nextLine ( ) ) ;
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    g [ i ] [ j ] = p / 100 * w ;
  }
  int i = 0 , j = 1 ;
  int b = j ;
  for ( int i = 0 ;
  i < 100 ;
  i ++ ) {
    if ( Integer . compare ( Integer . parseInt ( g [ i ] [ 1 ] ) - j * Integer . parseInt ( g [ i ] [ 0 ] ) , g [ i ] [ 1 ] ) < 0 ) {
      b = j ;
      j = ( j + i ) / 2 ;
    }
    else {
      int t = j ;
      j = ( b + j ) / 2 ;
      i = t ;
    }
  }
  System . out . println ( j * 100 ) ;
}
