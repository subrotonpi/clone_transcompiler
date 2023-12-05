public static String [ ] nextPermutation ( String s ) {
  for ( int i = xrange ( s . length ( ) - 1 , 0 , - 1 ) ;
  i > 0 ;
  i -- ) {
    if ( s . charAt ( i ) > s . charAt ( i - 1 ) ) {
      break ;
    }
  }
  else {
    return new String [ 0 ] ;
  }
  int k = i ;
  for ( int j = xrange ( i , s . length ( ) ) ;
  j > 0 ;
  j -- ) {
    if ( s . charAt ( k ) >= s . charAt ( j ) && s . charAt ( j ) > s . charAt ( i - 1 ) ) {
      k = j ;
    }
  }
  String t = s . substring ( i - 1 ) ;
  s . replace ( i - 1 , s . substring ( k ) ) ;
  s . replace ( k , t ) ;
  s . replace ( i , s . substring ( s . length ( ) - 1 , i - 1 ) ) ;
  return s ;
}
if ( getClass ( ) . isEnum ( "java.util.Scanner" ) ) {
  int N = Integer . parseInt ( readLine ( ) ) ;
  for ( int i = xrange ( N ) ;
  i < N ;
  i ++ ) {
    String v = readLine ( ) ;
    StringBuilder sb = new StringBuilder ( v ) ;
    sb . append ( v ) ;
    sb . append ( '0' ) ;
    while ( s . length ( ) <= v . length ( ) ) {
      sb . append ( '0' ) ;
    }
    s = ( sb . toString ( ) ) ;
    String [ ] q = nextPermutation ( new LinkedList < String > ( v ) ) ;
    if ( q != null ) {
      s = q [ 0 ] ;
    }
    System . out . println ( "Case #" + ( i + 1 ) + ":" + s ) ;
  }
  return null ;
}
