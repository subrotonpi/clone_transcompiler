static final int [ ] [ ] read ( ) throws IOException {
  final String FILE_NAME = "A-large" ;
  final String INPUT_FILE = FILE_NAME + ".in" ;
  final String OUTPUT_FILE = FILE_NAME + ".out" ;
  final int OP_OR = 0 ;
  final int OP_AND = 1 ;
  final int INF = 10000000 ;
  {
    final FileReader fpIn = new FileReader ( INPUT_FILE ) ;
    final PrintStream fpOut = new PrintStream ( new FileOutputStream ( OUTPUT_FILE ) ) ;
    System . setOut ( fpOut ) ;
    final int num_cases = Integer . parseInt ( input ( ) ) ;
    for ( int i = 1 ;
    i < num_cases ;
    i ++ ) {
      final int m = Integer . parseInt ( input ( ) ) ;
      final int v = Integer . parseInt ( input ( ) ) ;
      g = new int [ m + 1 ] ;
      c = new int [ m + 1 ] ;
      a = new int [ m + 1 ] ;
      for ( int j = 0 ;
      j < m ;
      j ++ ) {
        a [ ( m - j ) / 2 + j ] = input ( ) ;
      }
      process ( i , m , v , g , c , a ) ;
    }
    if ( CLASS_NAME . equals ( "org.apache.commons.math.BinaryScanner" ) ) {
      main ( ) ;
    }
    else {
      final int [ ] [ ] leftRet = recur ( m , g , c , a , i * 2 , 0 ) ;
      final int [ ] rightRet = recur ( m , g , c , a , i * 2 + 1 , 1 ) ;
      noChange = leftRet [ 0 ] [ 0 ] + rightRet [ 0 ] + 1 ;
      if ( expectedValues [ 0 ] == OP_OR ) {
        final int leftRet = recur ( m , g , c , a , i * 2 , 0 ) ;
        final int rightRet = recur ( m , g , c , a , i * 2 + 1 , 0 ) ;
        noChange = leftRet [ 0 ] [ 0 ] + rightRet [ 0 ] ;
        change = leftRet [ 0 ] [ 1 ] + rightRet [ 1 ] ;
      }
      else {
        assert false ;
      }
      if ( expectedValues [ 0 ] == OP_AND ) {
        change = INF ;
      }
      return new int [ ] [ ] {
        noChange , change }
        ;
      }
    }
  }
  