static void f ( ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( "D.in" ) ) ;
  String line ;
  int T = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
  for ( int test = 0 ;
  test < T ;
  test ++ ) {
    int N = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
    int [ ] [ ] c = new int [ N ] [ 2 ] ;
    for ( int a = 0 ;
    a < N ;
    a ++ ) {
      c [ i ] [ 0 ] = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
      c [ i ] [ 1 ] = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
    }
    if ( N == 1 ) {
      System . out . println ( "Case #" + ( test + 1 ) + ": " + c [ 0 ] [ 2 ] + " " + c [ 0 ] [ 2 ] + " " + c [ 0 ] [ 2 ] + " " + c [ 0 ] [ 2 ] + " " + c [ 0 ] [ 2 ] + " " + c [ 0 ] [ 2 ] + " " + c [ 0 ] [ 2 ] + " " + c [ 0 ] [ 2 ] + " " + c [ 0 ] [ 2 ] + " " + c [ 1 ] [ 2 ] + " " + c [ 1 ] [ 2 ] + " " + c [ 1 ] [ 2 ] + " " + c [ 1 ] [ 2 ] ) ;
    }
    assert N == 3 ;
    double SOL = 1e1000 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if ( i == j ) continue ;
        for ( int k = 0 ;
        k < N ;
        k ++ ) {
          if ( i == k || j == k ) continue ;
          double R2 = c [ k ] [ 2 ] ;
          double R1 = ( ( ( c [ i ] [ 0 ] - c [ j ] [ 0 ] ) * ( c [ i ] [ 0 ] - c [ j ] [ 0 ] ) + ( c [ i ] [ 1 ] - c [ j ] [ 1 ] ) * ( c [ i ] [ 1 ] - c [ j ] [ 1 ] ) * 0.5 + c [