public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > PY = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    PY . add ( Collections . singletonList ( i ) ) ;
  }
  PY . sort ( Comparator . comparing ( Integer :: compareTo ) ) ;
  int [ ] ans = new int [ M ] ;
  int [ ] num = new int [ N ] ;
  for ( int p = 0 , y = PY . size ( ) , i ++ ) {
    ans [ y ] = Integer . toString ( p ) . zfill ( 6 ) + Integer . toString ( num [ p - 1 ] + 1 ) . zfill ( 6 ) ;
    num [ p - 1 ] ++ ;
  }
  for ( int s : ans ) System . out . println ( s ) ;
  return ans . length ;
}
