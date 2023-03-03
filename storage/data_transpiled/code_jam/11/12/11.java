public static boolean match ( String a , String b , char letter ) throws IOException {
  if ( a . length ( ) != b . length ( ) ) {
    return false ;
  }
  if ( letter == ' ' ) {
    return true ;
  }
  for ( int i = 0 ;
  i < a . length ( ) ;
  i ++ ) {
    if ( a . charAt ( i ) != b . charAt ( i ) ) {
      if ( a . charAt ( i ) == letter || b . charAt ( i ) == letter ) {
        return false ;
      }
    }
  }
  return true ;
}
{
  String word = a ;
  {
    String [ ] poss = wMap . get ( word ) . split ( "\\s" ) ;
    int ind = 0 ;
    int s = 0 ;
    while ( poss . length > 1 ) {
      char c = order . charAt ( ind ) ;
      boolean found = false ;
      for ( String w : poss ) {
        if ( w . contains ( c ) ) {
          found = true ;
          break ;
        }
      }
      if ( found ) {
        Arrays . sort ( poss ) ;
        if ( ! word . contains ( c ) ) {
          s = s + 1 ;
        }
      }
      ind = ind + 1 ;
    }
    return s == 0 ;
  }
  private static final String guessStr = " abcdefghijklmnopqrstuvwxyz" ;
  {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( new FileInputStream ( "input.in" ) ) ) ;
    PrintWriter g = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( new FileOutputStream ( "out.txt" ) ) ) ) ;
    int num = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int i = 0 ;
    i < num ;
    i ++ ) {
      g . println ( "Case #" + ( i + 1 ) + ":" ) ;
      Arrays . sort ( poss ) ;
      int nwords = Integer . parseInt ( br . readLine ( ) ) ;
      int nlists = Integer . parseInt ( br . readLine ( ) ) ;
      HashMap < String , ArrayList < String >> myMap = new HashMap < String , ArrayList < String >> ( ) ;
      ArrayList < String > myList = new ArrayList < String > ( ) ;
      for ( int j = 0 ;
      j < nwords ;
      j ++ ) {
        myList . add ( br . readLine ( ) . substring ( 0 , myList . size ( ) - 1 ) ) ;
        myMap . put ( myList . get ( j ) , new ArrayList < String > ( ) ) ;
      }
      for ( String word : my @ @