@ GwtIncompatible ( "java.io.BufferedReader" ) public static void main ( String argv [ ] ) throws IOException {
  /* write the message */
  stdout . write ( argv [ 0 ] ) ;
  /* write the message */
  stdout . write ( argv [ 1 ] ) ;
  /* write the line */
  stdout . write ( argv [ 2 ] ) ;
  /* write the line */
  stdout . write ( argv [ 3 ] ) ;
  /* write the line */
  int n = Integer . parseInt ( argv [ 4 ] ) ;
  /* read the integers */
  int [ ] ints = new int [ n ] ;
  for ( int X = 0 ;
  X < n ;
  X ++ ) {
    ints [ X ] = Integer . parseInt ( fi . readLine ( ) ) ;
  }
  String str = argv [ 5 ] ;
  String fni = argv [ 6 ] + "-" + argv [ 7 ] + "-" + argv [ 8 ] + ".in" ;
  String fno = argv [ 9 ] + "-" + argv [ 10 ] + "-" + argv [ 11 ] + ".out" ;
  BufferedReader fi = new BufferedReader ( new FileReader ( fni ) ) ;
  PrintWriter fo = new PrintWriter ( fno ) ;
  /* ffail */
  int start = 0 ;
  int step = 0 ;
  int num = 0 ;
  int prizes = 0 ;
  /* read the numbers */
  if ( prizes >= num ) {
    /* read the numbers */
    if ( prizes <= 0 ) {
      /* read the numbers */
      return start ;
    }
    if ( 2 * prizes <= num ) {
      /* read the numbers */
      return start + step ;
    }
    /* write the numbers */
    if ( prizes >= num ) {
      /* read the numbers */
      if ( prizes <= 0 ) {
        /* read the numbers */
        return start ;
      }
    }
  }
  /* write the numbers */
  int numCases = fi . read ( str ) ;
  for ( int i = 1 ;
  i < numCases ;
  i ++ ) {
    final int N = fi . read ( ) ;
    final int P = fi . read ( ) ;
    int g = ffail ( 0 , 1 , 2 * N , P ) - 1 ;
    int w = wwin ( 0 , 1 , 2