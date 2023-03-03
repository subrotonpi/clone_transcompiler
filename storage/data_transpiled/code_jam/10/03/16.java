public static int calc ( int r , int k , int [ ] size ) throws IOException {
  int n = size . length ;
  Map < Integer , Integer > history = new HashMap < Integer , Integer > ( ) ;
  List < Integer > money = new ArrayList < Integer > ( ) ;
  int pos = 0 ;
  for ( int round : xrange ( r ) ) {
    if ( history . containsKey ( pos ) ) {
      int [ ] repeat = money . toArray ( new Integer [ history . size ( ) ] ) ;
      int l = repeat . length ;
      int remain = r - round ;
      int final int m = ( remain / l ) * Arrays . hashCode ( repeat ) + Arrays . hashCode ( repeat , 0 , remain % l ) + Arrays . hashCode ( money ) ;
      return final ;
    }
    history . put ( pos , money . size ( ) ) ;
    int m = 0 ;
    int start = pos ;
    do {
      if ( m + size [ pos ] > k ) break ;
      m += size [ pos ] ;
      pos = ( pos + 1 ) % n ;
      if ( pos == start ) break ;
    }
    while ( pos == start ) ;
    money . add ( m ) ;
  }
  return sum ( money ) ;
}
