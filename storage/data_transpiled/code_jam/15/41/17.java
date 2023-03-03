@ org . junit . experimental . theories . DataPoints public static int [ ] [ ] divide ( final java . util . concurrent . Callable < Integer > callable ) {
  final java . util . concurrent . ThreadLocal < java . util . concurrent . Callable < Integer >> mem = new java . util . concurrent . ThreadLocal < java . util . concurrent . Callable < Integer >> ( ) {
    @ java . lang . Override public Integer call ( java . util . concurrent . Callable < Integer > in ) {
      if ( ! mem . get ( ) . equals ( "" ) ) {
        mem . set ( in ) ;
      }
      return mem . get ( ) ;
    }
  }
  ;
  java . util . concurrent . Callable < Integer > readint = in -> {
    int i = Integer . parseInt ( in . readLine ( ) ) ;
    @ java . lang . String file = file . substring ( 0 , i ) ;
    @ java . lang . String fileName = file ;
    @ java . lang . System . out . println ( "Task " + file ) ;
    @ java . io . File file = new java . io . File ( file ) ;
    @ java . io . File ( file ) {
      @ Override public String getName ( ) {
        return file . substring ( 0 , i ) ;
      }
      @ java . io . File ( file ) {
        @ Override public int read ( ) throws IOException {
          return i ;
        }
      }
      ;
    }
  }
  ;
  final String FILE = TASK ;
  System . out . println ( "Initialization..." ) ;
  final Solver solver = new Solver ( ) ;
  System . out . println ( "Calculation done." ) ;
  System . out . println ( "Calculation..." ) ;
  final Scanner in = new Scanner ( file . toString ( ) ) ;
  final int [ ] [ ] counts = new int [ R ] [ C ] ;
  final boolean [ ] bads = new boolean [ R ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    for ( int j = 0 ;
    j < C ;
    j ++ ) {
      if ( grid [ i ] [ j ] != '.' ) {
        break ;
      }
    }
    for ( int j = 0 ;
    j < bads [ i ] [ j ] ;
    j ++ ) {
      if ( grid [ i ] [ j ] != '>' ) {
        bads [ i ] [ j ] = true ;
      }
    }
  }
  return counts ;
}
