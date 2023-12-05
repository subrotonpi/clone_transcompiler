static final String [ ] processFile ( String file ) throws IOException {
  BufferedReader fbr = new BufferedReader ( new FileReader ( file ) ) ;
  String text = fbr . readLine ( ) ;
  fbr . close ( ) ;
  String [ ] lines = text . split ( "\n" ) ;
  String [ ] result = new String [ lines . length ] ;
  boolean first = true ;
  int N = - 1 ;
  int n = 0 ;
  HashMap < String , Double > tx = new HashMap < String , Double > ( ) ;
  for ( String line : lines ) {
    if ( first == true ) {
      first = false ;
    }
    else if ( N == - 1 ) {
      final String t0 = tpv . get ( ) ;
      final String p0 = tx . get ( ) ;
      final String [ ] txNext = tx . get ( ) ;
      final double vx = ( txNext [ 1 ] - txCur . get ( ) ) ;
      final double px = getPosition ( t0 , tx , vx ) ;
      final double a = 0 ;
      for ( String num : tx . keySet ( ) ) {
        if ( D == - 1 ) {
          D = Double . parseDouble ( num ) ;
        }
        else if ( N == - 1 ) {
          N = Integer . parseInt ( num ) ;
        }
        else if ( A == - 1 ) {
          A = Integer . parseInt ( num ) ;
        }
      }
      case "D" : case "N" : case "A" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case "C" : case " : case