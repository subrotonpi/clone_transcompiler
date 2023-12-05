static final String input ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int inf = 10 * 18 ;
  final int N = Integer . parseInt ( input ) ;
  final int K = Integer . parseInt ( input ) ;
  final List < Integer > T = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T . add ( Integer . parseInt ( input ) ) ;
  }
  String ans = "Found" ;
  final Queue < Integer > q = new LinkedList < > ( ) ;
  q . add ( new Integer ( 0 ) ) ;
  while ( q . size ( ) > 0 ) {
    final int i = q . poll ( ) ;
    final int tmp = q . get ( ) ;
    if ( i == N ) {
      if ( tmp == 0 ) break ;
    }
    else {
      for ( final int Tij : T . get ( i ) ) q . add ( new Integer ( i + 1 ) ) ;
      ans = tmp ^ Tij ;
    }
  }
  else ans = "Nothing" ;
  return ans ;
}
