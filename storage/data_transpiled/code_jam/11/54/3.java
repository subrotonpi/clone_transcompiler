public static String run ( ) {
  String s = readLine ( ) ;
  ArrayList < Integer > q = new ArrayList < Integer > ( ) ;
  int a = 0 ;
  Iterator < Character > it = new LineIterator ( s . toCharArray ( ) ) ;
  while ( it . hasNext ( ) ) {
    char b = it . next ( ) . charAt ( 0 ) ;
    if ( ( b == '?' ) && ( ( b == '?' ) ) ) q . add ( b ) ;
    if ( ( b == '1' ) && ( ( b == '?' ) || ( b == '?' ) ) ) a ++ << b ;
  }
  if ( q . isEmpty ( ) ) return s ;
  for ( int i : xrange ( 1 << q . size ( ) ) ) {
    int r = a ;
    Iterator < Integer > it = q . iterator ( ) ;
    while ( it . hasNext ( ) ) {
      int j = it . next ( ) ;
      if ( ( ( ( i >> j ) & 1 ) == 0 ) && ( ( ( i >> j ) & 1 ) == 0 ) ) continue ;
      r ++ ;
    }
    if ( r == ( int ) ( r * r * 0.5 ) * r ) {
      StringBuilder res = new StringBuilder ( s ) ;
      it = q . iterator ( ) ;
      while ( it . hasNext ( ) ) {
        res . append ( it . next ( ) ) ;
        res . append ( ( ( ( i >> j ) & 1 ) == 0 ) ? '0' : '1' ) ;
      }
      return res . toString ( ) ;
    }
  }
  assert false ;
  for ( int test : xrange ( input ) ) System . out . println ( "Case #" + ( test + 1 ) + ": " + run ( ) ) ;
  return s ;
}
