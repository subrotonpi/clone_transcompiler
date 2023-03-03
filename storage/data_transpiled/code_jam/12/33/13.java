static final int solve ( int [ ] a , int [ ] A , int [ ] b , int [ ] B ) throws IOException {
  final int [ ] cache = new int [ a . length ] ;
  int res ;
  int tc = 0 ;
  if ( A . length == 0 || B . length == 0 ) {
    return 0 ;
  }
  if ( cache [ ( sum ( a ) ) ] != 0 ) {
    return cache [ ( sum ( a ) ) ] ;
  }
  if ( A [ 0 ] != B [ 0 ] ) {
    res = solve ( a , 1 , A , b , B ) ;
    res = solve ( a , A , b , B ) ;
    cache [ ( sum ( a ) ) ] = res ;
    return res ;
  }
  else {
    if ( a [ 0 ] > b [ 0 ] ) {
      res = solve ( Arrays . copyOfRange ( a , 1 , a . length - b [ 0 ] ) + a , A , b , B ) + b [ 0 ] ;
    }
    else if ( a [ 0 ] < b [ 0 ] ) {
      res = solve ( a , 1 , A , Arrays . copyOfRange ( b , 1 , a . length - b [ 0 ] ) + b [ 0 ] , B ) + a [ 0 ] ;
    }
    else {
      res = solve ( a , 1 , A , b , B ) + a [ 0 ] ;
    }
    cache [ ( sum ( a ) ) ] = res ;
    return r ;
  }
  final BufferedReader fn = new BufferedReader ( new FileReader ( "1.in" ) ) ;
  final PrintWriter ofn = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ) ;
  final int TC = Integer . parseInt ( fn . readLine ( ) ) ;
  for ( tc = 0 ;
  tc < TC ;
  ++ tc ) {
    final int N = Integer . parseInt ( fn . readLine ( ) . trim ( ) ) ;
    final int M = Integer . parseInt ( fn . readLine ( ) . trim ( ) ) ;
    final int [ ] r = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    ++ j ) {
      r [ 2 * j ] = r [ 2 * j ] ;
    }
    final int [ ] a = new int [ M ] ;
    for ( int j = 0 ;
    j < N ;
    ++ j ) {
      a [ j ] = r [ 2 * j ] ;
    }
    final int [ ] r = new int [ M ] ;
    for ( int j = 0 ;
    