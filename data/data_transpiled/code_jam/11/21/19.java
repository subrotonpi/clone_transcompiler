static void read ( BufferedReader in ) throws IOException {
  int t = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int i = 0 ;
  i < xrange ( t ) ;
  i ++ ) {
    int n = Integer . parseInt ( in . readLine ( ) ) ;
    String [ ] s = new String [ xrange ( n ) ] ;
    for ( int j = 0 ;
    j < s . length ;
    j ++ ) s [ j ] = in . readLine ( ) . trim ( ) ;
    doTest ( n , s ) ;
  }
  {
    final String _input = "__main__" ;
    final boolean compare = false ;
    final String _output = "" ;
    final String result ;
    if ( compare ) {
      test = true ;
      if ( compare ) doTest ( _input ) ;
    }
    else {
      final File f = new File ( _input ) ;
      f . delete ( ) ;
      doTest ( _input ) ;
    }
  }
  if ( __name__ . equals ( "__main__" ) ) {
    test = false ;
    compare = true ;
  }
  else {
    main ( new BufferedReader ( new FileReader ( _input ) ) ) ;
  }
  final double average = ( Double . parseDouble ( "" ) ) / total ;
  final double [ ] [ ] seq = new double [ xrange ( s . length ) ] [ 1 ] ;
  for ( int i = 0 ;
  i < xrange ( s . length ) ;
  i ++ ) {
    seq [ i ] = new double [ xrange ( s . length ) ] [ 1 ] ;
  }
  final double [ ] wp = new double [ xrange ( s . length ) ] [ 1 ] ;
  for ( int q = 0 ;
  q < iters ;
  q ++ ) wp [ q ] = calc ( seq [ q ] , p ) ;
  final String _input = "" ;
  /* Case #1:
  0.5
  0.5
  2
  3
  3
  .10
  .11
  .10
  .10
  .10
  .11
  .10
  .11
  .10
  .11
  .10
  .11
  .10
  .10
  .11
  .10
  .10
  .11
  .10
  .10
  .11
  .10
  .10
  .11
  .10
  .10
  .10
  .11
  .10
  .10
  .11
  */
}
