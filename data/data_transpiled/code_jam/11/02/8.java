public static void main ( String [ ] args ) throws Exception {
  BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int testlen = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
  String [ ] tests = new String [ testlen ] ;
  for ( int i = 0 ;
  i < tests . length ;
  i ++ ) {
    tests [ i ] = br . readLine ( ) . trim ( ) ;
  }
  int len = tests . length ;
  for ( int i = 0 ;
  i < testlen ;
  i ++ ) {
    String [ ] test = tests [ i ] . split ( "\\s+" ) ;
    int i = 0 ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + solve ( ( String [ ] ) parse ( test ) ) ) ;
  }
  /* parse */
  String [ ] test = br . readLine ( ) . split ( "\\s+" ) ;
  ArrayList < Pair > comb = new ArrayList < > ( ) ;
  int cn = Integer . parseInt ( test [ 0 ] ) ;
  for ( int i = 1 ;
  i < cn + 1 ;
  i ++ ) {
    String v = test [ i ] ;
    comb . add ( new Pair ( v . substring ( 0 , 2 ) , v . substring ( 0 , 2 ) . substring ( 0 , v . length ( ) - 1 ) , v . substring ( 2 ) ) ) ;
  }
  int on = Integer . parseInt ( br . readLine ( ) . substring ( cn + 1 ) ) ;
  ArrayList < String > opps = CollectionUtils . toArrayList ( Arrays . copyOfRange ( test , cn + 2 , cn + 2 + on ) ) ;
  String seq = br . readLine ( ) ;
  if ( seq . length ( ) != Integer . parseInt ( br . readLine ( ) . substring ( 0 , seq . length ( ) - 2 ) ) ) throw new Exception ( "Error parsing" ) ;
  /* solve */
  String stack = "" ;
  for ( String s : seq ) {
    stack = s + stack ;
    for ( Pair pair : comb ) {
      String apair = pair . first ;
      String rep = pair . second ;
      while ( stack . contains ( pair ) || stack . contains ( apair ) ) stack = stack . replace ( pair , rep ) . replace ( apair , rep ) ;
    }
    for ( String a : opps ) {
      String b = opps . first ;
      if ( stack .