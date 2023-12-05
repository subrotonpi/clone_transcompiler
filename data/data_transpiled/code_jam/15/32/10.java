public static void pr ( String ... a ) throws IOException {
  return ;
  for ( String s : a ) print ( s , "" ) ;
  print ( s ) ;
  {
  }
  {
    int m = 0 ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      if ( s . endsWith ( s . substring ( 0 , i ) ) ) m = i ;
    }
  }
  {
    int [ ] ks = new int [ s . length ( ) ] ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      if ( ! ks [ i ] . equals ( s ) ) return ;
    }
    int tail = s . length ( ) - maxOverlap ( s ) ;
    int bring = 1 + ( limit - s . length ( ) ) / tail ;
    HashMap < String , Integer > map = new HashMap < String , Integer > ( ) ;
    for ( int i = 0 ;
    i < ks . length ;
    i ++ ) map . put ( ks [ i ] , map . getOrDefault ( ks [ i ] , 0 ) + 1 ) ;
    double e = 1.0 ;
    for ( int i = 0 ;
    i < target . length ;
    i ++ ) e = e * map . get ( target [ i ] ) / ks . length ;
    int give = ( limit + 1 - s . length ( ) ) * e ;
    return bring - give ;
  }
  final BufferedReader br = new BufferedReader ( new FileReader ( System . getProperty ( "file.txt" ) ) ) ;
  final String outFileName = System . getProperty ( "file.txt" ) . substring ( 0 , s . length ( ) - 2 ) + "out" ;
  final File out = new File ( outFileName ) ;
  final int T = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
  for ( int tc = 1 ;
  tc <= T ;
  tc ++ ) {
    final int K = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
    final int L = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
    final int S = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
    pr ( ks ) ;
    assert ks . length == K ;
    final String target = br . readLine ( ) ;
    pr ( target ) ;
    assert target . length == L ;
    final int rt = solve ( ks , target , S ) ;
    pr ( "Case #" + tc + ": " + rt ) ;
    