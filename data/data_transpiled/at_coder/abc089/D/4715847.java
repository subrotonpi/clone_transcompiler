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
  i < d ;
  i ++ ) {
    diff [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int i1 = index [ i ] ;
    for ( int j = 0 ;
    j < d ;
    j ++ ) {
      int i0 = index [ j ] ;
      int i1 = index [ j ] ;
      diff [ i ] = Math . abs ( i0 / w - i1 / w ) + Math . abs ( i0 % w - i1 % w ) ;
    }
    for ( int j = 0 ;
    j < d ;
    j ++ ) {
      int r = index [ j ] ;
      if ( i >= d ) {
        diff [ j ] += diff [ j - d ] ;
      }
    }
  }
  if ( Class . isPrimitive ( String . class ) ) {
    n = Integer . parseInt ( input ( ) ) ;
    m = Integer . parseInt ( input ( ) ) ;
    d = Integer . parseInt ( input ( ) ) ;
    String ins = n + " " + m + " " + d + "\n" ;
    n = Integer . parseInt ( input ( ) ) ;
    System . out . println ( solve ( ins + "\n" + n + "\n" ) ) ;
  }
  return "" ;
}
