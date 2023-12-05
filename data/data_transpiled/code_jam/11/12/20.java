static final Pattern < List < String >> TRIE_PATTERN = Pattern . compile ( " #" ) ;
class Memoize {
  private final Memoize < String , List < String >> cache ;
  {
    this . cache = cache ;
  }
  @ Override public String doCall ( String ... args ) {
    return " " + args [ 0 ] ;
  }
  @ Override public String doCall ( String ... args ) {
    List < String > o = new ArrayList < > ( ) ;
    for ( String alphabet : args ) {
      o . add ( doTest ( words , alphabet ) ) ;
    }
    StringBuilder sb = new StringBuilder ( o ) ;
    BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    int T = Integer . parseInt ( in . readLine ( ) ) ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      int N = Integer . parseInt ( in . readLine ( ) ) ;
      int M = Integer . parseInt ( in . readLine ( ) ) ;
      List < String > words = new ArrayList < > ( N ) ;
      for ( int j = 0 ;
      j < M ;
      j ++ ) {
        words . add ( in . readLine ( ) ) ;
      }
      List < String > alphabets = new ArrayList < > ( M ) ;
      for ( int j = 0 ;
      j < M ;
      j ++ ) {
        alphabets . add ( in . readLine ( ) ) ;
      }
      String v = doTrial ( words , alphabets ) ;
      System . out . println ( sb . toString ( ) , "Case #" + ( i + 1 ) + ": " + v ) ;
      out . flush ( ) ;
    }
    return sb . toString ( ) ;
  }
  private boolean consistent ( String w , String guess , String alphabet ) {
    if ( guess . length ( ) != w . length ( ) ) return false ;
    for ( int i = 0 ;
    i < guess . length ( ) ;
    i ++ ) {
      char c1 = guess . charAt ( i ) ;
      char c2 = w . charAt ( i ) ;
      if ( c1 == '_' ) {
        if ( ! alphabet . contains ( c2 ) ) return false ;
      }
      else if ( c1 != c2 ) return false ;
    }
    return true ;
  }
  private int errorCount ( String words , String alphabet , String chosen , String newGuess ) {
    if ( newGuess == null ) {
      System . out . println ( " - - - - - - - - - - - - - - - - - - - - - - - - -