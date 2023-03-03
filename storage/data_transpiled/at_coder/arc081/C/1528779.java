@ VisibleForTesting static String from ( ) {
  String alpha = "abcdefghijklmnopqrstuvwxyz" ;
  String A = input . nextLine ( ) ;
  int n = A . length ( ) ;
  int B = ( int ) 'a' ;
  int [ ] [ ] links = new int [ n + 3 ] [ ] ;
  int [ ] link = new int [ 26 ] ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    links [ i ] = link . clone ( ) ;
    link [ ( int ) A . charAt ( i ) - B ] = i ;
  }
  links [ n - 1 ] = link ;
  Deque < Integer > deq = new LinkedList < > ( ) ;
  deq . add ( - 1 ) ;
  Map < Integer , Integer > prev = new HashMap < > ( ) ;
  while ( deq . size ( ) > 0 ) {
    int v = deq . pop ( ) ;
    if ( v == n ) {
      continue ;
    }
    link = links [ v ] ;
    for ( int c = 0 ;
    c < 26 ;
    c ++ ) {
      prev . put ( c , ( char ) alpha ) ;
    }
  }
  return ans . substring ( 1 ) ;
}
