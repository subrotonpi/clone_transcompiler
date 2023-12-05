@ GwtIncompatible ( "java.io.BufferedReader" ) static String doFile ( String fname , String outfname ) throws IOException {
  String result = doString ( file ( fname ) . read ( ) ) ;
  file ( outfname ) . write ( result ) ;
  {
    String [ ] dat = new String [ N ] ;
    int i = 0 ;
    for ( ;
    i < N ;
    i ++ ) {
      int k = Integer . parseInt ( dat [ i ] ) ;
      dat = new String [ k ] ;
      s = dat [ i ] . trim ( ) ;
      dat = dat [ i ] . substring ( i + 1 ) ;
      results [ i ] = solve ( k , s , i + 1 ) ;
    }
    return Joiner . on ( '\n' ) . join ( results ) ;
  }
  int [ ] perm = new int [ N ] ;
  {
    int k ;
  }
  {
    System . out . println ( k + " " + s . length ( ) + " " + ind ) ;
    String [ ] blocks = new String [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      blocks [ i ] = s . substring ( k * i , k * ( i + 1 ) ) ;
    }
    int minSize = s . length ( ) ;
    for ( int a : xrange ( k ) ) {
      for ( int b : xrange ( k ) ) {
        for ( int c : xrange ( k ) ) {
          for ( int d : xrange ( k ) ) {
            for ( int e : xrange ( k ) ) {
              perm = Arrays . copyOfRange ( a , b , c , d , e ) ;
              if ( new HashSet < Integer > ( perm ) . size ( ) != k ) continue ;
              int x = score ( Arrays . toString ( blocks ) ) ;
              if ( x < minSize ) minSize = x ;
            }
          }
        }
      }
    }
    int res = minSize ;
    return "Case #" + ind + ": " + res ;
  }
  private String mype ( String block ) {
    String ret = "" ;
    for ( int x : perm ) ret = ret + block . substring ( perm [ x ] ) ;
    return ret ;
  }
  private int score ( String s ) {
    int ret = 1 ;
    char cur = s . charAt ( 0 ) ;
    for ( int x = 1 ;
    x < s . length ( ) ;
    x ++ ) {
      if ( s . charAt ( x ) != cur ) ret ++ ;
      cur = s . charAt ( x ) ;
    }
    return