static final int [ ] [ ] getDigits ( ) {
  System . setProperty ( "line.separator" , " " ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 0 ;
  List < Integer > F = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) F . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  List < Integer > P = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) P . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  final int INF = 10 * 9 ;
  /* dfs */
  if ( count == 10 ) {
    if ( ! "1" . equals ( s ) ) {
      int val = - INF ;
    }
    if ( "1" . equals ( s ) ) {
      val = 0 ;
      int [ ] c = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        c [ i ] = 0 ;
      }
      for ( int j = 0 ;
      j < 10 ;
      j ++ ) {
        if ( ( int ) ( Integer . parseInt ( input . nextLine ( ) ) * F . get ( i ) ) != 0 ) c [ j ] ++ ;
      }
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      val += P . get ( i ) [ c [ i ] ] ;
    }
  }
  else {
    return Math . max ( dfs ( "0" ) , dfs ( "1" ) ) ;
  }
}
