public static void main ( String [ ] in ) {
  int T = Integer . parseInt ( in [ 0 ] ) ;
  for ( int z : xrange ( 1 , T + 1 ) ) {
    int pts = Integer . parseInt ( in [ 0 ] ) ;
    double [ ] vals = new double [ 6 ] ;
    for ( int i : xrange ( pts ) ) {
      int [ ] vs = new int [ 6 ] ;
      for ( String s : in [ 0 ] . split ( "\\s+" ) ) vs [ i ] = Integer . parseInt ( s . trim ( ) ) ;
      for ( int j = 0 ;
      j < vs . length ;
      j ++ ) vals [ j ] += vs [ j ] ;
    }
    for ( int i = 0 ;
    i < vals . length ;
    i ++ ) vals [ i ] = vals [ i ] * 1.0 / pts ;
    double a = vals [ 3 ] * vals [ 3 ] + vals [ 4 ] * vals [ 4 ] + vals [ 5 ] * vals [ 5 ] ;
    double b = vals [ 0 ] * vals [ 3 ] + vals [ 1 ] * vals [ 4 ] + vals [ 2 ] * vals [ 5 ] ;
    double c = vals [ 0 ] * vals [ 0 ] + vals [ 1 ] * vals [ 1 ] + vals [ 2 ] * vals [ 2 ] ;
    double dm ;
    if ( a != 0 ) {
      tm = Math . max ( 0 , - b / a ) ;
    }
    else {
      tm = 0 ;
    }
    dm = Math . max ( 0 , ( a * tm * tm + 2 * b * tm + c ) ) * 0.5 ;
    System . out . println ( "Case #" + z + ": " + dm + " " + tm ) ;
  }
}
