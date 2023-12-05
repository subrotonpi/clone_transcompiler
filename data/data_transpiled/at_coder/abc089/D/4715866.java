public static String solve ( String string ) {
  int h = Integer . parseInt ( string ) ;
  int w = Integer . parseInt ( string ) ;
  int d = Integer . parseInt ( string ) ;
  int [ ] a = a . clone ( ) , q = a . clone ( ) , lr = a . clone ( ) ;
  int [ ] index = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int _a = a [ i ] ;
    index [ _a - 1 ] = i ;
  }
  int [ ] diff = new int [ d ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    diff [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int i1 = index [ i ] ;
    diff [ i ] = Math . abs ( i0 / w - i1 / w ) + Math . abs ( i0 % w - i1 % w ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i >= d ) {
      diff [ i ] += diff [ i - d ] ;
    }
  }
  return "\n" + diff [ r - 1 ] - diff [ l - 1 ] + "\n" ;
}
if ( Class . isPrimitive ( String . class ) ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int m = Integer . parseInt ( input ( ) ) ;
  int d = Integer . parseInt ( input ( ) ) ;
  String ins = n + " " + m + " " + d + "\n" ;
  n = Integer . parseInt ( input ( ) ) ;
  System . out . println ( solve ( ins + "\n" + n + "\n" ) ) ;
}
