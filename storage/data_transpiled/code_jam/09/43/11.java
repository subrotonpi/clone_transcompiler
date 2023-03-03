) public static void print ( String name , String type ) throws IOException {
  name = "C" ;
  String type = "small" ;
  String base = name + "-" + type + "." ;
  String [ ] lines = FileUtil . readFileLines ( base + "in" ) ;
  Arrays . sort ( lines ) ;
  int T = Integer . parseInt ( lines [ 0 ] ) ;
  int fpos = 1 ;
  {
    boolean crosses = ( a , b ) -> {
      if ( a [ a . length - 1 ] == b [ b . length - 1 ] ) return true ;
      for ( int i : xrange ( a . length - 1 ) ) {
        if ( a [ i ] > b [ i ] && a [ i + 1 ] < b [ i + 1 ] || a [ i ] < b [ i ] && a [ i + 1 ] > b [ i + 1 ] || a [ i ] == b [ i ] ) return true ;
      }
      return false ;
    }
    ;
  }
  {
    int size = lines . length ;
    boolean cross [ ] [ ] = new boolean [ size ] [ size ] ;
    for ( int i = 0 ;
    i < size ;
    i ++ ) cross [ i ] [ 0 ] = false ;
    for ( int i = 0 ;
    i < size ;
    i ++ ) for ( int a = 0 ;
    a < size ;
    a ++ ) for ( int b = 0 ;
    b < size ;
    b ++ ) if ( crosses && ( lines [ a ] . charAt ( b ) == ' ' ) ) cross [ i ] [ b ] = cross [ b ] [ a ] = true ;
  }
  int groups = 0 ;
  int [ ] unused = new int [ size ] ;
  Arrays . sort ( unused ) ;
  while ( unused . length > 0 ) {
    groups ++ ;
    List < Integer > gr = new ArrayList < > ( ) ;
    gr . add ( unused . remove ( 0 ) ) ;
    List < Integer > topop = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < size ;
    i ++ ) {
      int new in = lines [ fpos ++ ] ;
      for ( int old : range ( 0 , i ) ) {
        if ( cross [ old ] [ unused [ new ] ] ) break ;
      }
      else {
        gr . add ( unused [ new ] ) ;
        topop . add ( new Integer ( in ) ) ;
      }
    }
    int poped = 0 ;
    for ( int pop : topop ) {
      unused . remove