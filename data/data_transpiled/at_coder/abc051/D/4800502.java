static final void main ( final String [ ] args ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( stdin ) ;
  final int [ ] li = ArrayUtil . fromIntegers ( stdin . readLine ( ) . split ( " " ) ) ;
  final int [ ] li_ = ArrayUtil . fromIntegers ( stdin . readLine ( ) . split ( " " ) ) ;
  final float lf = ArrayUtil . fromFloats ( stdin . readLine ( ) . split ( " " ) ) ;
  final int [ ] ls = stdin . readLine ( ) . split ( " " ) ;
  final String [ ] ns = stdin . readLine ( ) . split ( " " ) ;
  final int [ ] lc = new int [ ns . length ] ;
  final int ni = Integer . parseInt ( stdin . readLine ( ) ) ;
  final int nf = Float . parseFloat ( stdin . readLine ( ) ) ;
  @ SuppressWarnings ( "unchecked" ) final List < Pair < Integer , Integer >> heap = new ArrayList < > ( ) ;
  final int n = li [ 0 ] ;
  final int m = li [ 1 ] ;
  final int [ ] edges = new int [ n ] ;
  graph = new ArrayList < > ( ) ;
  final int [ ] adjMat = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      final int a = li [ i ] ;
      final int b = li [ i ] ;
      final int c = li [ i ] ;
      final int distCand = dist [ i ] + nexCost ;
      if ( distCand < dist [ i ] ) {
        dist [ i ] = distCand ;
        heap . add ( new Pair < > ( a , b ) ) ;
      }
    }
  }
  final int [ ] edges = new int [ n ] ;
  graph = new ArrayList < > ( ) ;
  adjMat [ 0 ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    edges [ i ] = i ;
    graph . add ( new Pair < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = li [ i ] ;
    int b = li [ i ] ;
    int c = li [ i ] ;
    a -- ;
    b -- ;
    graph [ a ] . add ( new Pair < > ( c , b