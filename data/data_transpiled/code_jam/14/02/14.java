static final public void main ( String [ ] args ) throws Exception {
  BufferedReader br = new BufferedReader ( new FileReader ( args [ 0 ] ) ) ;
  int T = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    final String C = br . readLine ( ) . trim ( ) ;
    final String F = br . readLine ( ) . trim ( ) ;
    final String X = br . readLine ( ) . trim ( ) ;
    System . out . println ( "Case #" + i + ": " + minTime ( Double . parseDouble ( C ) , Double . parseDouble ( F ) , Double . parseDouble ( X ) ) ) ;
  }
  {
    final double C = Double . parseDouble ( br . readLine ( ) . trim ( ) ) ;
    final double F = Double . parseDouble ( br . readLine ( ) . trim ( ) ) ;
    final double X = Double . parseDouble ( br . readLine ( ) . trim ( ) ) ;
    double n = Double . parseDouble ( br . readLine ( ) . trim ( ) ) ;
    final double two = Double . parseDouble ( br . readLine ( ) . trim ( ) ) ;
    double prevTime = X / two ;
    double farmBuildTime = Double . parseDouble ( br . readLine ( ) . trim ( ) ) ;
    do {
      farmBuildTime += C / ( two + n * F ) ;
      n += 1.0 ;
    }
    while ( n < T ) ;
    double time = Double . parseDouble ( br . readLine ( ) . trim ( ) ) ;
    if ( time > prevTime ) {
      return ;
    }
    prevTime = time ;
  }
}
