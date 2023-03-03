static final String getBest ( ) throws IOException {
  String filename = "C-large" ;
  String path = System . getProperty ( "test.src" ) + File . separator + filename + ".in" ;
  FileReader reader = new FileReader ( path ) ;
  path = System . getProperty ( "test.src" ) + File . separator + filename + ".out" ;
  BufferedWriter writer = new BufferedWriter ( new FileWriter ( path ) ) ;
  int T = Integer . parseInt ( reader . readLine ( ) . replaceAll ( "\\s+" , "" ) ) ;
  int N = 0 , M = 0 ;
  int [ ] lA = new int [ N ] , lB = new int [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    lA [ i ] = Integer . parseInt ( reader . readLine ( ) . replaceAll ( "\\s+" , "" ) ) ;
    lB [ i ] = Integer . parseInt ( reader . readLine ( ) . replaceAll ( "\\s+" , "" ) ) ;
  }
  writer . close ( ) ;
  HashMap < Integer , Integer > visited = new HashMap < Integer , Integer > ( ) ;
  int ret = getBest ( N - 1 , M - 1 , null ) ;
  String pret = String . valueOf ( ret ) ;
  lA [ 0 ] = new int [ 2 ] ;
  lA [ 1 ] = new int [ 2 ] ;
  lA [ 2 ] = new int [ 2 ] ;
  lB [ 0 ] = new int [ 2 ] ;
  lB [ 1 ] = new int [ 2 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    lA [ i ] = Integer . parseInt ( reader . readLine ( ) . replaceAll ( "\\s+" , "" ) ) ;
  }
  /* if (a[1] > b[1]) return b[1]; */
  if ( a [ 1 ] == b [ 1 ] ) return null ;
  if ( a [ 1 ] > b [ 1 ] ) return ( true ? a [ 1 ] - b [ 1 ] : a [ 2 ] ) ;
  else return ( false ? b [ 1 ] - a [ 1 ] : b [ 2 ] ) ;
  /* if (a[1]>b[1]) return a[1]; else return b[1]; */
}
