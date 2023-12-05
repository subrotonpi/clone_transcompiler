@ Sys public static int solve ( ) throws IOException {
  final int b = Integer . parseInt ( stdin . readLine ( ) ) ;
  final int n = Integer . parseInt ( stdin . readLine ( ) ) ;
  int [ ] z = new int [ b ] ;
  for ( int i = 0 ;
  i < z . length ;
  ++ i ) {
    z [ i ] = i ;
  }
  Arrays . sort ( z ) ;
  final List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < x . length ;
  ++ i ) {
    l . add ( new Integer ( i ) ) ;
  }
  heapify ( l ) ;
  int res = 0 ;
  for ( int z : xrange ( 1 , b + 1 ) ) {
    x = heapify ( l ) ;
    x = new Integer ( x [ 0 ] + 1 ) ;
    heapify ( l ) ;
    x = new Integer ( x [ 1 ] + 1 ) ;
    heapify ( l ) ;
    x = new Integer ( x [ 0 ] + 1 ) ;
    x = new Integer ( x [ 1 ] + 1 ) ;
    heapify ( l ) ;
    x = new Integer ( x [ 0 ] + 1 ) ;
    x = new Integer ( x [ 1 ] + 1 ) ;
    x = new Integer ( x [ 0 ] + 1 ) ;
    x = new Integer ( x [ 1 ] + 1 ) ;
    x = new Integer ( x [ 0 ] + 1 ) ;
    x = new Integer ( x [ 1 ] + 1 ) ;
    x = new Integer ( x [ 0 ] + 1 ) ;
    x = new Integer ( x [ 1 ] + 1 ) ;
    x = new Integer ( x [ 0 ] + 1 ) ;
    x = new Integer ( x [ 1 ] + 1 ) ;
    x = new Integer ( x [ 0 ] + 1 ) ;
    x = new Integer ( x [ 1 ] + 1 ) ;
    x = new Integer ( x [ 1 ] + 1 ) ;
    x = new Integer ( x [ 0 ] + 1 ) ;
    x = new Integer ( x [ 1 ] + 1 ) ;
    x = new Integer ( x [ 1 ] + 1 ) ;
    x = new Integer ( x [ 1 ] + 1 ) ;
    x = new Integer ( x [ 2 ] + 1 ) ;
    x = new Integer ( x [ 3 ] + 1 ) ;
    x = new Integer ( x [ 4 ] + 1 ) ;
    x = new Integer ( x [ 5 ] + 1 ) ;
    x = new Integer (