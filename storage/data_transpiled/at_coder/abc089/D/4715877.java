public static String solve ( String string ) {
  int h = Integer . parseInt ( string ) ;
  int w = Integer . parseInt ( string ) ;
  int d = Integer . parseInt ( string ) ;
  int ... a = a . length ;
  int n = h * w ;
  a = a [ 0 ] , q = a [ n ] , lr = a [ n + 1 ] ;
  int [ ] index = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int _a = a [ i ] ;
    index [ _a - 1 ] = i ;
  }
  int [ ] diff = new int [ d ] ;
  for ( int i = 0 ;
  i < index . length ;
  i ++ ) {
    diff [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < index . length ;
  i ++ ) {
    diff [ i ] = index [ i ] ;
  }
  for ( int i = 0 ;
  i < index . length ;
  i ++ ) {
    diff [ i ] += Math . abs ( i0 / w - i1 / w ) + Math . abs ( i0 % w - i1 % w ) ;
  }
  for ( int i = 0 ;
  i < index . length ;
  i ++ ) {
    diff [ i ] += diff [ i - d ] ;
  }
  return "\n" + diff [ lr . length - 1 ] + " " + diff [ lr . length - 1 ] + "\n" ;
}
