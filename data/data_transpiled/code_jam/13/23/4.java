static final String getStream ( ) throws IOException {
  boolean debug = false ;
  {
    String R = System . getProperty ( "line.separator" ) ;
    R = R . replace ( "\n" , "" ) ;
    R = R . replace ( "" , "" ) ;
    return R . trim ( ) ;
  }
  int T = Integer . parseInt ( getline ( ) ) ;
  HashMap < String , Integer > cache = new HashMap < String , Integer > ( ) ;
  HashSet < String > set = new HashSet < String > ( ) ;
  System . setRecursionDesired ( 29999 ) ;
  {
    String S = getline ( ) ;
    cache . clear ( ) ;
    int result = feedletter ( S , 0 , tree ) ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + result ) ;
  }
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    String S = getline ( ) ;
    cache . clear ( ) ;
    int result = feedletter ( S , 0 , tree ) ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + result ) ;
    if ( set . contains ( S ) ) return 0 ;
    int R = 1e99 ;
    for ( String w : set ) {
      if ( S . startsWith ( w ) ) {
        int lw = w . length ( ) ;
        String rest = S . substring ( lw ) ;
        R = Math . min ( R , examine ( rest , errorlimit ) ) ;
      }
    }
    cache . put ( key , R ) ;
    return R ;
  }
  for ( String w : Files . readAllLines ( Paths . get ( "garbled_email_dictionary.txt" ) ) ) {
    set . add ( w . trim ( ) ) ;
  }
  if ( debug ) System . out . println ( "Max length is: " + Math . max ( set . size ( ) , map . size ( ) ) ) ;
  HashMap < String , Integer > tree = new HashMap < String , Integer > ( ) ;
  tree . put ( "id" , "ROOT" ) ;
  String EOF = "$" ;
  for ( String w : set ) {
    HashMap < String , Integer > t = tree ;
    String partialWord = "" ;
    for ( int i = 0 ;
    i < w . length ( ) ;
    i ++ ) {
      partialWord += w . charAt ( i ) ;
      if ( ! t . containsKey ( key ) ) {
        return