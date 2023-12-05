// Reuben
@ SuppressWarnings ( "unused" ) private static String solution ( int domSize , int width , int height ) throws IOException {
  if ( domSize >= 7 || width * height % domSize != 0 || domSize > Math . max ( width , height ) ) return "RICHARD" ;
  if ( domSize == 1 || domSize == 2 ) return "GABRIEL" ;
  if ( domSize == 3 ) {
    if ( height == 1 || width == 1 ) return "RICHARD" ;
    else return "GABRIEL" ;
  }
  if ( domSize == 4 ) {
    if ( ( height <= 2 ) || ( width <= 2 ) ) return "RICHARD" ;
    else return "GABRIEL" ;
  }
  if ( domSize == 5 ) {
    if ( ( height <= 2 ) || ( width <= 2 ) || ( width == 3 && ( height < 10 || height % 5 != 0 ) ) || ( height == 3 && ( width < 10 || width % 5 != 0 ) ) ) return "RICHARD" ;
    else return "GABRIEL" ;
  }
  if ( domSize == 6 ) {
    if ( ( height <= 3 ) || ( width <= 3 ) ) return "RICHARD" ;
    else return "GABRIEL" ;
  }
  BufferedReader fIn = new BufferedReader ( new FileReader ( "file.in" ) ) ;
  PrintWriter fOut = new PrintWriter ( new FileWriter ( "file.out" ) ) ;
  int cases = Integer . parseInt ( fIn . readLine ( ) ) ;
  for ( int i = 1 ;
  i <= cases ;
  i ++ ) {
    String [ ] line = fIn . readLine ( ) . split ( " " ) ;
    domSize = Integer . parseInt ( line [ 0 ] ) ;
    width = Integer . parseInt ( line [ 1 ] ) ;
    height = Integer . parseInt ( line [ 2 ] ) ;
    String s = solution ( domSize , width , height ) ;
    fOut . println ( "Case #" + i + ": " + s ) ;
  }
  return fOut . readLine ( ) ;
}
