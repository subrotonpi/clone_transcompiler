@ VisibleForTesting static void process ( InputStream in , PrintStream out ) throws IOException {
  final int len = in . available ( ) ;
  if ( len == 0 ) {
    return ;
  }
  if ( out == null ) {
    out = new PrintStream ( in + ".out.txt" ) ;
  }
  in = new BufferedInputStream ( in ) ;
  final int l = Integer . parseInt ( in . readLine ( ) ) ;
  final int d = Integer . parseInt ( in . readLine ( ) ) ;
  final int n = in . readInt ( ) ;
  final String [ ] words = new String [ d ] ;
  for ( int i = 0 ;
  i < d ;
  i ++ ) {
    words [ i ] = in . readLine ( ) . trim ( ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String pattern = in . readLine ( ) . trim ( ) ;
    pattern = pattern . replace ( '(' , '[' ) . replace ( ')' , ']' ) ;
    final Pattern expr = Pattern . compile ( '^' + pattern + '$' ) ;
    final int count = StreamTokenizer . TT_WORD . CASE_INSENSITIVE_ORDER . filter ( words ) . count ( ) ;
    out . println ( "Case #" + ( i + 1 ) + ": " + count ) ;
  }
  if ( out instanceof PrintStream ) {
    return ( ( PrintStream ) out ) . println ( ) ;
  }
  final String [ ] TEST_DATA = new String [ ] {
    /*3 5 4
    abc
    bca
    dac
    dbc
    cba
    (ab)(bc)(ca)
    abc
    (abc)(abc)(abc)(abc)
    (zyx)bc*/
    , /*Case #1: 2
    Case #2: 1
    Case #3: 3
    Case #4: 0
    */
  }
  ;
  assertEquals ( len , process ( new BufferedReader ( new InputStreamReader ( in ) ) ) . readLine ( ) ) ;
  for ( String s : new String [ ] {
    "A-large.in.txt" }
    ) {
      process ( s ) ;
    }
    if ( getClass ( ) . equals ( TEST_DATA [ 0 ] ) ) {
      out . println ( ) ;
    }
  }
  