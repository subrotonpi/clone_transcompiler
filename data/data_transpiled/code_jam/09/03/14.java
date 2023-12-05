static final String PHRASE = "welcome to code jam" ;
final HashMap < String , Integer > MEMOIZATION_MAP = new HashMap < String , Integer > ( ) ;
{
  final int lineCount ;
  final int subseqCount ;
  {
    assert lineCount <= lineCount && subseqCount <= lineCount ;
    String line ;
    int i ;
    int count ;
    final String [ ] args ;
    args = new String [ ] {
      lineCount , subseqCount }
      ;
      if ( MEMOIZATION_MAP . containsKey ( args ) ) {
        return MEMOIZATION_MAP . get ( args ) ;
      }
      if ( subseqCount == subseq . length ) {
        count = 1 ;
      }
      else if ( lineCount == lineCount ) {
        count = 0 ;
      }
      else {
        count = 0 ;
        for ( i = lineCount ;
        i < line . length ;
        i ++ ) {
          if ( line [ i ] . equals ( subseq [ subseqCount ++ ] ) ) {
            count += recCountSubseqs ( line , subseq , i + 1 , subseqCount + 1 ) ;
          }
        }
      }
      MEMOIZATION_MAP . put ( args , count ) ;
      return count ;
    }
    private String solveCase ( InputStream in ) throws IOException {
      MEMOIZATION_MAP . clear ( ) ;
      line = in . readLine ( ) . trim ( ) ;
      int subseqCount = recCountSubseqs ( line , PHRASE , 0 , 0 ) ;
      return String . format ( "%04d" , subseqCount % 10000 ) ;
    }
    public static void main ( String [ ] argv ) throws IOException {
      System . setSecurityManager ( new SecurityManager ( ) ) ;
      in = new FileInputStream ( argv [ 0 ] ) ;
      out = new FileOutputStream ( argv [ 1 ] ) ;
      int numCases = Integer . parseInt ( in . readLine ( ) ) ;
      for ( int i = 0 ;
      i < numCases ;
      i ++ ) {
        String solution = solveCase ( in ) ;
        out . write ( "Case #" + ( i + 1 ) + ": " + solution + "\n" ) ;
      }
      in . close ( ) ;
      out . close ( ) ;
    }
  }
  