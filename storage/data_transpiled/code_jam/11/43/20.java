static final String getCopyString ( ) throws IOException {
  final List < String > in = Files . readAllLines ( Paths . get ( "C-small-attempt0.in" ) ) ;
  final List < String > list = new ArrayList < > ( ) ;
  for ( String line : in ) {
    list . add ( line ) ;
  }
  final FileWriter wfile = new FileWriter ( "result" ) ;
  final int T = Integer . parseInt ( list . get ( 0 ) ) ;
  list . clear ( ) ;
  final List < Integer > prime = new ArrayList < > ( 2 ) ;
  prime . add ( 2 ) ;
  for ( int i = 3 ;
  i <= 1000 ;
  i ++ ) {
    for ( final int t : prime ) {
      if ( i % t == 0 ) {
        break ;
      }
    }
    else {
      prime . add ( i ) ;
    }
  }
  for ( int caseNo = 1 ;
  caseNo <= T ;
  caseNo ++ ) {
    final int N = Integer . parseInt ( list . get ( 0 ) ) ;
    list . clear ( ) ;
    int result = 0 ;
    final int sqr = ( int ) Math . sqrt ( N ) ;
    for ( int i = 2 ;
    i <= sqr ;
    i ++ ) {
      if ( ! prime . contains ( i ) ) {
        continue ;
      }
      int tmp = i ;
      do {
        tmp *= i ;
        if ( ( tmp <= N ) && ( tmp <= N ) ) {
          result ++ ;
        }
        else {
          break ;
        }
      }
      while ( true ) ;
    }
    result ++ ;
    if ( N == 1 ) {
      result = 0 ;
    }
    wfile . write ( "Case #" + caseNo + ": " + result + "\n" ) ;
  }
  return "" ;
}
