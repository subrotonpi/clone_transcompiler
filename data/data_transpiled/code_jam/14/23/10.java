public static void setIOHandlerObject ( ) {
  String source = "c.in" ;
  String target = "c.out" ;
  BufferedReader sreader = null ;
  BufferedReader treader = null ;
  try {
    sreader = new BufferedReader ( new FileReader ( source ) ) ;
    sreader . mark ( 0 ) ;
    treader = new BufferedReader ( new FileWriter ( target ) ) ;
  }
  catch ( FileNotFoundException e ) {
    e . printStackTrace ( ) ;
  }
  catch ( IOException e ) {
    e . printStackTrace ( ) ;
  }
  finally {
    if ( sreader != null ) sreader . reset ( ) ;
    if ( treader != null ) treader . reset ( ) ;
  }
  String [ ] inputs = sreader . readLine ( ) . trim ( ) . split ( "\\s+" ) ;
  if ( inputs . length == 0 ) {
    return inputs ;
  }
  if ( inputs . length == 1 ) {
    return inputs [ 0 ] . split ( " " ) ;
  }
  if ( inputs . length == 2 ) {
    return Arrays . stream ( inputs ) . map ( Integer :: parseInt ) . collect ( Collectors . toList ( ) ) ;
  }
  /* write output */
  String s = "\n" ;
  if ( s == null ) {
    s = "" ;
  }
  treader . reset ( ) ;
  IOHandler handler = new IOHandlerObject ( ) ;
  Method g = handler . getClass ( ) . getMethod ( "getInput" , new Class [ ] {
    String [ ] . class }
    ) ;
    BufferedWriter w = handler . getBufferedWriter ( ) ;
    final int t = g . nextInt ( ) ;
    for ( int qq = 0 ;
    qq < t ;
    qq ++ ) {
      w . append ( "Case #" + ( qq + 1 ) + ": " ) ;
      int n = g . nextInt ( ) ;
      int m = g . nextInt ( ) ;
      int [ ] legend = new int [ n ] ;
      int [ ] zipcodes = new int [ n ] ;
      int [ ] adj = new int [ n ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        zipcodes [ i ] = ( g . nextInt ( ) ) ;
        adj [ i ] = new int [ m ] ;
      }
      Arrays . sort ( zipcodes ) ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        legend [ zipcodes [ i ] - 1 ] = i ;
      }
      for ( int i = 0 ;
      i < m ;
      i ++ ) {
        String [ ] x = g .