public static void print ( int n , int c , int k ) {
  int [ ] s = new int [ n ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( s ) ;
  int num = 0 ;
  int i = s [ 0 ] ;
  int m = s [ 0 ] + k ;
  int p = 1 ;
  for ( int j = 1 ;
  j < s . length ;
  j ++ ) {
    if ( j <= m && p < c ) p ++ ;
    else {
      p = 1 ;
      num ++ ;
      m = j + k ;
    }
    i = j ;
  }
  num ++ ;
  System . out . println ( num ) ;
}
