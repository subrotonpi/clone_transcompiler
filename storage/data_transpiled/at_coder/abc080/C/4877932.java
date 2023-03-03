public static int [ ] [ ] [ ] F ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < List < Integer >> F = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) F . add ( Collections . singletonList ( Integer . parseInt ( input ( ) ) ) ) ;
  List < List < Integer >> P = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) P . add ( Collections . singletonList ( Integer . parseInt ( input ( ) ) ) ) ;
  List < String > B = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 1024 ;
  i ++ ) B . add ( Integer . toBinaryString ( i ) . substring ( 2 ) ) ;
  for ( int i = 0 ;
  i < B . size ( ) ;
  i ++ ) {
    while ( ( B . get ( i ) . length ( ) < 10 ) && ( B . get ( i ) . charAt ( 0 ) == '0' ) ) B . set ( i , "0" + B . get ( i ) ) ;
  }
  int c = 0 ;
  int ans = - 10 * 9 ;
  for ( int i = 1 ;
  i < B . size ( ) ;
  i ++ ) {
    String b = B . get ( i ) ;
    int res = 0 ;
    for ( int index = 0 ;
    index < F . size ( ) ;
    index ++ ) {
      for ( int j = 0 ;
      j < b . length ( ) ;
      j ++ ) {
        if ( ( String . valueOf ( i ) . charAt ( 0 ) == '0' && i == 1 ) ) c ++ ;
      }
      res += P . get ( index ) [ c ] ;
      c = 0 ;
    }
    ans = Math . max ( ans , res ) ;
  }
  System . out . println ( ans ) ;
  return F . toArray ( ) ;
}
