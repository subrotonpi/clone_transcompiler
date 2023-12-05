static final int [ ] [ ] read ( InputStream in ) throws IOException {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( in ) ) ;
  int [ ] [ ] li = map ( li [ 0 ] , li [ 1 ] ) ;
  int [ ] [ ] li_ = map ( li [ 2 ] , li [ 3 ] ) ;
  int [ ] [ ] lf = map ( lf [ 3 ] , li [ 4 ] ) ;
  int [ ] ls = stdin . read ( ) . split ( " " ) ;
  String [ ] ns = stdin . read ( ) . replaceAll ( " " , "" ) ;
  int [ ] lc = new int [ ns . length ] [ ] ;
  for ( int i = 0 ;
  i < lc . length ;
  i ++ ) {
    lc [ i ] = ns [ i ] ;
  }
  int ni = Integer . parseInt ( stdin . read ( ) ) ;
  int nf = Float . parseFloat ( stdin . read ( ) ) ;
  @ SuppressWarnings ( "unused" ) Map < Integer , Integer > dic = Maps . newHashMap ( ) ;
  int n = ni ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = ni ;
  }
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int ai = a [ i ] ;
    b [ i ] = b [ i ] ;
    dic . put ( ai , ai ) ;
  }
  int cnt = 0 ;
  for ( int [ ] ord1 : dic . values ( ) ) {
    int ord2 = dic . values ( ) [ ord1 ] ;
    if ( ord1 % 2 != ord2 % 2 ) {
      cnt ++ ;
    }
  }
  System . out . println ( cnt / 2 ) ;
  return md ;
}
