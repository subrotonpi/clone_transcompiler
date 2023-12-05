static private final String nextLine ( ) {
  final String line ;
  /* First line is the next line */
  final String line = nextLine ( ) . replace ( '(' , ' ' ) . replace ( ')' , ' ' ) ;
  final String [ ] l = line . split ( " " ) ;
  if ( l . length == 0 ) return nextLineX ( ) ;
  /* Node */
  final Node node ;
  /* Process the node */
  final String [ ] l = nextLineX ( ) ;
  if ( l . length == 2 ) {
    node = new Node ( ( String ) l [ 0 ] ) ;
    node . yes = processNode ( ) ;
    node . no = processNode ( ) ;
  }
  else {
    node = new Node ( l [ 0 ] , null ) ;
  }
  /* Run the node */
  final int lines = Integer . parseInt ( nextLine ( ) ) ;
  node = processNode ( ) ;
  final int animals = Integer . parseInt ( nextLine ( ) . substring ( 0 , lines ) ) ;
  for ( int a = 0 ;
  a < animals ;
  a ++ ) {
    final String [ ] out = nextLine ( ) . split ( " " ) ;
    final String name = out [ 0 ] ;
    final String [ ] features = out [ 2 ] ;
    node = root ;
    double prob = node . prob ;
    while ( node . name != null ) {
      if ( features . contains ( node . name ) ) {
        node = node . yes ;
      }
      else {
        node = node . no ;
      }
      prob *= node . prob ;
    }
    System . out . println ( "%.7f" ) ;
  }
  /* Run the node */
  final int n = Integer . parseInt ( nextLine ( ) ) ;
  for ( int nr = 1 ;
  nr <= n ;
  nr ++ ) {
    System . out . println ( "Case #" + nr + ":" ) ;
    run ( ) ;
  }
  return line ;
}
