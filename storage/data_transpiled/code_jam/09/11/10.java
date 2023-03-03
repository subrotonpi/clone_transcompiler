@ org . junit . experimental . theories . DataPoints public static int [ ] [ ] parse ( String s ) throws IOException {
  final String [ ] [ ] TEST_DATA = new String [ 2 ] [ ] ;
  {
    assert s . length ( ) >= 1 ;
    final List < Integer > foo = new ArrayList < > ( ) ;
    do {
      if ( s . length ( ) < s . length ( ) ) {
        foo . add ( null ) ;
      }
    }
    while ( s . length ( ) > 0 ) ;
    if ( s . charAt ( 0 ) == 'C-small' ) {
      go ( ) ;
    }
    foo . add ( s [ 0 ] ) ;
    if ( s . charAt ( 0 ) != 'C-large' ) {
      for ( int i : foo ) {
        s [ i ] = s . charAt ( 0 ) ;
      }
      return s ;
    }
    int sum = 0 ;
    while ( s . length ( ) > 0 ) {
      int n = s . length ( ) ;
      int d = s . charAt ( 0 ) ;
      sum += d * d ;
    }
    int n = sum ;
    if ( s . charAt ( 0 ) != 'C' ) {
      for ( int i : foo ) {
        s [ i ] = false ;
      }
      return s ;
    }
  }
  private static boolean process3 ( Map < String , Boolean > cache , String base , int min ) {
    Boolean cachebase = cache . get ( base ) ;
    if ( cachebase == null ) cache . put ( base , cachebase ) ;
    while ( ! happy ( cachebase , base , min ) ) {
      min ++ ;
    }
    return false ;
  }
  private static boolean process2 ( Map < String , Boolean > cache , String [ ] bases ) {
    int oldmin = 0 ;
    min = 2 ;
    do {
      for ( int i : bases ) {
        min = process3 ( cache , base , min ) ;
      }
      if ( min == oldmin ) {
        return min ;
      }
      oldmin = min ;
    }
    while ( s . charAt ( 0 ) == 'C' ) ;
    return new String [ ] [ ] {
      "C-small.txt" , "C-large.txt" }
      ;
    }
    private static boolean process ( String f , OutputStream out ) throws IOException {
      if ( f . length ( ) == 0 ) {
        if ( out == null ) out = new FileOutputStream ( f + ".out.txt" ) ;
        in = new FileInputStream ( f ) ;
      }
      else {
        if ( out == null ) out = new ByteArrayOutputStream ( )