public static String solve ( String string ) {
  int h = Integer . parseInt ( string ) ;
  int w = Integer . parseInt ( string ) ;
  int d = Integer . parseInt ( string ) ;
  int [ ] a = a , q = a [ h * w ] , lr = a [ h * w + 1 ] ;
  int n = h * w ;
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
    diff [ i ] = Math . abs ( i0 / w - i1 / w ) + Math . abs ( i0 % w - i1 % w ) ;
  }
  int [ ] costs = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i < d ) {
      costs [ i ] = diff [ i ] ;
    }
    else {
      costs [ i ] = diff [ i ] + costs [ i - d ] ;
    }
  }
  return Arrays . toString ( costs ) ;
}
if ( getClass ( ) . equals ( String . class ) ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int m = Integer . parseInt ( input ( ) ) ;
  int d = Integer . parseInt ( input ( ) ) ;
  String ins = n + " " + m + " " + d + "\n" ;
  n = Integer . parseInt ( input ( ) ) ;
  System . out . println ( solve ( ins + "\n" + n + "\n" ) ) ;
}
