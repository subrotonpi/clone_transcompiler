static final void main ( String argv [ ] ) throws IOException {
  final String [ ] args = new String [ ] {
    argv [ 0 ] }
    ;
    final FileInputStream testFile = new FileInputStream ( args [ 0 ] + ".in" ) ;
    final FileOutputStream outFile = new FileOutputStream ( args [ 0 ] + ".out" ) ;
    final int nCases = Integer . parseInt ( testFile . readLine ( ) ) ;
    for ( int i = xrange ( 1 , nCases + 1 ) ;
    i < nCases ;
    i ++ ) {
      final int n = Integer . parseInt ( testFile . readLine ( ) ) ;
      final TreeSet < Integer > v1 = new TreeSet < > ( ) ;
      for ( final String val : testFile . readLine ( ) . split ( " " ) ) v1 . add ( Integer . parseInt ( val ) ) ;
      final TreeSet < Integer > v2 = new TreeSet < > ( ) ;
      for ( final String val : testFile . readLine ( ) . split ( " " ) ) v2 . add ( Integer . parseInt ( val ) ) ;
      v2 . trimToSize ( ) ;
      outFile . write ( String . format ( "Case #%i: %i\n" , i , v1 . size ( ) ) ) ;
    }
  }
  