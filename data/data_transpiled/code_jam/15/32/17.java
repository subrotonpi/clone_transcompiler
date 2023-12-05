public static String [ ] readArray ( Function < String , String > convertor ) {
  String [ ] ret = readLine ( ) . split ( " " ) ;
  if ( convertor != null ) ret = ArrayUtil . convert ( ret , convertor ) ;
  return ret ;
  /*construct the array*/
  String ret = "" ;
  while ( i != null ) {
    int m = i % k ;
    ret = K . charAt ( m ) + ret ;
    i /= k ;
  }
  while ( ret . length ( ) < s ) {
    ret = K . charAt ( 0 ) + ret ;
  }
  /*needGive the list*/
  int len = ret . length ( ) ;
  int start = 0 ;
  double ans = 0 ;
  while ( start != - 1 ) {
    start = st . indexOf ( L , start ) ;
    if ( start != - 1 ) {
      ans ++ ;
      start ++ ;
    }
  }
  /*main*/
  for ( int t = 1 ;
  t <= 1 + input . nextInt ( ) ;
  t ++ ) {
    int k = readArray ( Integer . parseInt ( ret [ t ] ) ) ;
    int l = readArray ( l ) ;
    int s = readArray ( l ) ;
    int K = readInt ( K ) ;
    int L = readInt ( L ) ;
    int need = 0 ;
    int allGive = 0 ;
    for ( int i : xrange ( k * s ) ) {
      String st = construct ( i , k , K , s ) ;
      int give = needGive ( st , L ) ;
      need = Math . max ( need , give ) ;
      allGive += give ;
    }
    double ans = ( ( need * ( k * s ) ) - allGive ) / ( double ) k * s ;
    System . out . println ( "Case #" + t + ": " + ans ) ;
  }
}
