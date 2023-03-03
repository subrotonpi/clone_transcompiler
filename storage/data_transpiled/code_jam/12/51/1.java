public static String alphabet ( int n , int l , int p [ ] ) throws Exception {
  Vector < Integer > v = new Vector < Integer > ( ) ;
  for ( int i : xrange ( n ) ) v . add ( new Integer ( - p [ i ] ) ) ;
  Collections . sort ( v ) ;
  return v . toString ( ) ;
}
if ( getClass ( ) . getClassLoader ( ) . getResource ( "A-small-attempt0.in" ) != null ) {
  BufferedReader fn = new BufferedReader ( new InputStreamReader ( new FileInputStream ( "A-small-attempt0.in" ) ) ) ;
  int tcase = Integer . parseInt ( fn . readLine ( ) ) ;
  for ( int x = 0 ;
  x < tcase ;
  x ++ ) {
    int ab = Integer . parseInt ( fn . readLine ( ) ) ;
    String kk = fn . readLine ( ) ;
    int [ ] zl = new int [ kk . length ( ) ] ;
    for ( int k = 0 ;
    k < zl . length ;
    k ++ ) zl [ k ] = Integer . parseInt ( kk . substring ( 0 , k ) ) ;
    kk = fn . readLine ( ) ;
    int [ ] zp = new int [ kk . length ( ) ] ;
    for ( int k = 0 ;
    k < zp . length ;
    k ++ ) zp [ k ] = Integer . parseInt ( kk . substring ( 0 , k ) ) ;
    System . out . println ( "Case #" + ( x + 1 ) + ": " + alphabet ( ab , zl , zp ) ) ;
  }
}
