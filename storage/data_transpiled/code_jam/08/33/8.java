static final Scanner getScanner ( ) throws FileNotFoundException {
  final Scanner input = new Scanner ( new File ( "speed.in" ) ) ;
  final PrintWriter output = new PrintWriter ( new FileOutputStream ( "speed.out" ) ) ;
  int caseN = 0 ;
  int testCase = 0 ;
  int n = 0 ;
  int m = 0 ;
  int X = 0 ;
  int Y = 0 ;
  int Z = 0 ;
  int acc = 0 ;
  final int [ ] A = new int [ n ] ;
  final int [ ] B = new int [ n ] ;
  final int [ ] C = new int [ n ] ;
  final long MODNUM = 1000000007 ;
  while ( input . hasNextLine ( ) ) {
    String line = input . nextLine ( ) ;
    if ( caseN == 0 ) {
      caseN = Integer . parseInt ( line ) ;
      continue ;
    }
    else if ( n == 0 ) {
      final int [ ] intLine = ArrayUtil . parseInt ( line ) ;
      n = intLine [ 0 ] ;
      m = intLine [ 1 ] ;
      X = intLine [ 2 ] ;
      Y = intLine [ 3 ] ;
      Z = intLine [ 4 ] ;
      acc = m - 1 ;
    }
    else if ( acc > 0 ) {
      acc -- ;
      A [ n ] = Integer . parseInt ( line ) ;
    }
    else {
      A [ n ] = Integer . parseInt ( line ) ;
      long ans = 0 ;
      B = new int [ n ] ;
      C = new int [ n ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        B [ i ] = ( int ) A [ i ] ;
        C [ i ] = 0 ;
      }
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        B [ j ] = ( int ) B [ j ] ;
        C [ j ] = ( int ) C [ j ] ;
      }
    }
  }
  input . close ( ) ;
  output . close ( ) ;
  return output ;
}
