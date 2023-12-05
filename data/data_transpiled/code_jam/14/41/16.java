private static int [ ] readLine ( ) throws IOException {
  return map . get ( readLine ( ) . trim ( ) ) ;
  /*solve the number of numbers */
  int n = nextInt ( ) ;
  int x = nextInt ( ) ;
  int [ ] s = readLine ( ) . split ( " " ) ;
  Arrays . sort ( s ) ;
  int a = 0 , b = n ;
  int cd = 0 ;
  while ( a < b ) {
    b -- ;
    cd ++ ;
    int r = x - s [ b ] ;
    if ( a < b && s [ a ] <= r ) {
      a ++ ;
    }
  }
  /*solve the number of numbers */
  int t = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  for ( int i : xrange ( 1 , t + 1 ) ) {
    int ret = solve ( ) ;
    System . out . println ( "Case #" + i + ":" + ret ) ;
  }
  if ( __name__ . equals ( "java.util.concurrent.ThreadPoolExecutor" ) ) {
    /*solve the execution time*/
    return new int [ ] {
      n , x }
      ;
    }
  }
  