static final int [ ] getChanges ( ) throws IOException {
  final int [ ] changes ;
  Set < String > slownik = null ;
  int m = 10 ;
  try {
    final BufferedReader reader = new BufferedReader ( new FileReader ( "dict.pkl" ) ) ;
    slownik = new HashSet < String > ( ) ;
    reader . readLine ( ) ;
    reader . close ( ) ;
  }
  catch ( final IOException e ) {
    final BufferedReader reader = new BufferedReader ( new InputStreamReader ( new FileInputStream ( "garbledEmailDictionary.txt" ) ) ) ;
    slownik = new HashSet < String > ( ) ;
    m = 0 ;
    String line ;
    while ( ( line = reader . readLine ( ) ) != null ) {
      line = reader . readLine ( ) . trim ( ) ;
      slownik . add ( line ) ;
      m = Math . max ( m , line . length ( ) ) ;
      for ( int i : xrange ( line . length ( ) ) ) {
        final StringBuilder word = new StringBuilder ( line ) ;
        word . append ( '?' ) ;
        slownik . add ( word . toString ( ) ) ;
      }
      for ( int i : xrange ( line . length ( ) - 5 ) ) {
        final StringBuilder word = new StringBuilder ( line ) ;
        word . append ( '?' ) ;
        word . append ( line . charAt ( i + 5 ) ) ;
        slownik . add ( word . toString ( ) ) ;
      }
    }
    reader . close ( ) ;
    final PrintWriter writer = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( slownik ) ) ) ;
    slownik . write ( writer ) ;
    writer . close ( ) ;
  }
  final HashMap < String , String > cache = new HashMap < String , String > ( ) ;
  {
    int ost = - 5 ;
    int i ;
    int j ;
    if ( s == null ) return 0 ;
    if ( ( i = 0 ) >= 0 ) return cache . get ( new String ( s ) ) ;
    changes = new ArrayList < String > ( ) ;
    for ( i = xrange ( 1 , Math . min ( m , s . length ( ) ) + 1 ) ;
    i < ost ;
    i ++ ) {
      final String word = s . substring ( 0 , i ) ;
      if ( slownik . contains ( word ) ) {
        changes [ i ] = rec ( s . substring ( i ) , ost - word . length ( ) ) ;
      }
      for ( int j = xrange ( Math . max ( ost + 5 , 0 ) , word . length ( ) ) ;
      