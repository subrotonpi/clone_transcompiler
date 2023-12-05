@ VisibleForTesting static void main ( String input ) {
  String As = input ;
  Arrays . sort ( As ) ;
  int lenA = As . length ( ) ;
  char [ ] [ ] posChars = new char [ lenA ] [ 26 ] ;
  int [ ] [ ] posNexts = new int [ lenA + 1 ] [ 26 ] ;
  for ( int i = 0 ;
  i < lenA ;
  i ++ ) {
    posNexts [ i + 1 ] = posChars . clone ( ) ;
    posChars [ As . charAt ( i ) ] = i ;
  }
  posNexts [ 0 ] = posChars . clone ( ) ;
  int [ ] prevs = new int [ lenA ] ;
  PriorityQueue < Integer > Q = new PriorityQueue < Integer > ( ) ;
  Q . add ( new Integer ( 0 ) ) ;
  Q . add ( new Integer ( - 1 ) ) ;
  while ( Q . size ( ) > 0 ) {
    int lenAns = Q . poll ( ) , pos = 0 ;
    for ( int ch = 0 ;
    ch < 26 ;
    ch ++ ) {
      int posNext = posNexts [ pos + 1 ] [ ch ] ;
      if ( posNext == lenA ) {
        StringBuilder ans = new StringBuilder ( ) ;
        ans . append ( ( char ) ( 'a' + ch ) ) ;
        while ( pos != - 1 ) {
          ans . append ( ( char ) ( 'a' + As . charAt ( pos ) ) ) ;
          pos = prevs [ pos ] ;
        }
        System . out . println ( ans . reverse ( ) ) ;
        exit ( ) ;
      }
      if ( prevs [ posNext ] == - 1 ) {
        prevs [ posNext ] = pos ;
        Q . add ( new Integer ( lenAns + 1 ) ) ;
      }
    }
  }
}
