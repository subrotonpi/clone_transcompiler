static final Scanner getScanner ( ) {
  System . setIn ( new FileInputStream ( "data.txt" ) ) ;
  System . setOut ( new PrintStream ( "out.txt" ) ) ;
  String input = System . getProperty ( "input" ) ;
  System . setIn ( new FileInputStream ( "data.txt" ) ) ;
  int [ ] [ ] g = new int [ n ] [ n + 2 ] ;
  int [ ] friend = new int [ n + 2 ] ;
  {
    int i ;
    int j ;
    int i ;
    int n ;
    {
      int v ;
      for ( i = 1 ;
      i <= n ;
      i ++ ) {
        v = friend [ i ] ;
        if ( u == v ) return i ;
      }
      else {
        return 1 ;
      }
    }
  }
  {
    int out = 0 ;
    for ( int i = 0 ;
    i < g [ u ] . length ;
    i ++ ) {
      if ( g [ u ] [ i ] != bad ) out = Math . max ( out , depth ( g [ u ] [ i ] , bad ) ) ;
    }
    return out + 1 ;
  }
  {
    int out = 0 ;
    for ( int i = 0 ;
    i < g . length ;
    i ++ ) {
      if ( friend [ g [ friend [ i ] ] [ i ] ] == i ) out += depth ( i , friend [ g [ friend [ i ] [ i ] ] [ i ] ) + depth ( friend [ g [ friend [ i ] ] [ i ] [ i ] ] , i ) ;
    }
    return out / 2 ;
  }
}
