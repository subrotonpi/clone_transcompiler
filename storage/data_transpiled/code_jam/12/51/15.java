static final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
for ( int t = 1 ;
t <= T ;
t ++ ) {
  int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int [ ] L = ArrayUtil . fromIntArray ( Arrays . asList ( L ) ) ;
  int [ ] P = ArrayUtil . fromIntArray ( Arrays . asList ( P ) ) ;
  ArrayList < Double > l = new ArrayList < Double > ( ) ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    if ( P [ i ] != 0 ) {
      l . add ( new Double ( ( double ) L [ i ] / p [ i ] ) ) ;
    }
    else {
      l . add ( new Double ( 1E30 ) ) ;
    }
  }
  Collections . sort ( l ) ;
  System . out . println ( "Case #" + t + ": " ) ;
  for ( Double p : l ) {
    double i = ( double ) p ;
    System . out . println ( i + "," ) ;
  }
  System . out . println ( "" ) ;
}
