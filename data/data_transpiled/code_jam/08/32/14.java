@ GwtIncompatible ( "B-small-attempt0.in" ) private static final int PRIMDIV = 2 , 3 , 5 , 7 ;
class Case {
  int num ;
  boolean isugly ( int n ) {
    return n % PRIMDIV == 0 ;
  }
  public int [ ] getVals ( String s ) {
    int [ ] vals = new int [ s . length ( ) ] ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      if ( n % PRIMDIV == 0 ) {
        return true ;
      }
    }
    return vals ;
  }
  public int [ ] getVals ( String s ) {
    int [ ] vals = new int [ s . length ( ) ] ;
    for ( int i : xrange ( s . length ( ) ) ) {
      int v = Integer . parseInt ( s . substring ( 0 , i + 1 ) ) ;
      int [ ] prevVals ;
      if ( s . length ( ) == 0 ) {
        prevVals = new int [ s . length ( ) ] ;
        vals [ i ] = v ;
      }
      else {
        prevVals = getVals ( s . substring ( i + 1 ) ) ;
        vals [ i ] = v + prevVals [ 0 ] ;
        vals [ i ] = v - prevVals [ 0 ] ;
      }
    }
    return vals ;
  }
  public int [ ] getNugly ( String s ) {
    return Arrays . stream ( getVals ( s ) ) . filter ( isugly ( s ) ) . count ( ) ;
  }
  public Case [ ] parse ( String lines ) {
    Case [ ] cases = new Case [ lines . length ( ) ] ;
    int i = 1 ;
    while ( i < lines . length ( ) ) cases [ i ] = new Case ( lines . charAt ( i ++ ) ) ;
    return cases ;
  }
}
if ( getClass ( ) . isClassPresent ( Case . class ) ) {
  lines = FileUtil . loadTextAndClose ( lines ) ;
  int [ ] answers = new int [ lines . length ( ) ] ;
  for ( Case case : parse ( lines ) ) cases [ i ] = new Case ( ) ;
  String [ ] outlines = new String [ answers . length ] ;
  for ( int i = 0 ;
  i < outlines . length ;
  i ++ ) outlines [ i ] = "Case #" + ( i + 1 ) + ": " + answers [ i ] + "\n" ;
  FileUtil . writeLines ( new File ( FNAME + ".out" )