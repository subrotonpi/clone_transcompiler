static final String input ( ) throws IOException {
  final Map < String , String > m = new HashMap < > ( ) ;
  m . put ( "o" , "0" ) ;
  m . put ( "i" , "1" ) ;
  m . put ( "e" , "3" ) ;
  m . put ( "a" , "4" ) ;
  m . put ( "s" , "5" ) ;
  m . put ( "t" , "7" ) ;
  m . put ( "b" , "8" ) ;
  m . put ( "g" , "9" ) ;
  final Map < String , String > mr = new HashMap < > ( ) ;
  for ( final Map . Entry < String , String > entry : m . entrySet ( ) ) {
    mr . put ( entry . getValue ( ) , entry . getKey ( ) ) ;
  }
  final InputStream bak = new BufferedInputStream ( new FileInputStream ( new File ( "input.txt" ) ) ) ;
  new BufferedInputStream ( bak ) . close ( ) ;
  for ( int kase = 0 ;
  kase < Integer . parseInt ( input ( ) ) ;
  kase ++ ) {
    final Map < String , Integer > din = new LinkedHashMap < > ( ) ;
    final Map < String , Integer > dout = new LinkedHashMap < > ( ) ;
    final Set < String > g = new HashSet < > ( ) ;
    final Set < String > a = new HashSet < > ( ) ;
    final int n = Integer . parseInt ( input ( ) ) ;
    assert n == 2 ;
    final String s = input ( ) ;
    long ans = 0 ;
    for ( int i = 0 ;
    i < s . length ( ) - 1 ;
    i ++ ) {
      for ( int p = 0 ;
      p < Integer . MAX_VALUE ;
      p ++ ) {
        for ( int q = 0 ;
        q < Integer . MAX_VALUE ;
        q ++ ) {
          final String c1 = s . substring ( i , i + 2 ) ;
          final String c2 = s . substring ( i + 2 ) ;
          if ( p == 1 && m . containsKey ( c1 ) ) c1 = m . get ( c1 ) ;
          if ( q == 1 && m . containsKey ( c2 ) ) c2 = m . get ( c2 ) ;
          if ( ! g . contains ( c1 + c2 ) ) {
            g . add ( c1 + c2 ) ;
            dout . put ( c1 , ++ din . get ( c2 ) ) ;
            a . add ( c1 ) ;
            a . add ( c2 ) ;
            ans ++ ;
          }
        }
      }
    }
    long tot = 0 ;
    for (