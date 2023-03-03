private static int [ ] readLine ( ) throws IOException {
  return map . get ( readLine ( ) . trim ( ) . split ( " " ) ) ;
  /*solve the answer */
  int n = readLine ( ) ;
  int [ ] a = readLine ( ) . split ( " " ) ;
  Map < Integer , Integer > m = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    m . put ( a [ i ] , i ) ;
  }
  Arrays . sort ( a ) ;
  Arrays . sort ( m ) ;
  int [ ] idx = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    idx [ i ] = m . get ( a [ i ] ) ;
  }
  int sw = 0 ;
  for ( int i : xrange ( n ) ) {
    int p = idx [ i ] ;
    int l = Arrays . binarySearch ( a , 0 , p ) ;
    int r = n - 1 - i - l ;
    sw += Math . min ( l , r ) ;
  }
  /*solve the answer */
  int t = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  for ( int i : xrange ( 1 , t + 1 ) ) {
    int ret = solve ( ) ;
    System . out . println ( "Case #" + i + ":" + ret ) ;
  }
  if ( getClass ( ) . equals ( "java.util.Scanner" ) ) {
    /*solve the scanner */
    return null ;
  }
  return null ;
}
