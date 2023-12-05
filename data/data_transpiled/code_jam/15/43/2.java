public static int compute ( int N , String [ ] sentences ) {
  final HashMap < String , Integer > b = new HashMap < String , Integer > ( ) ;
  for ( int i : xrange ( N ) ) {
    final int n = 1 << i ;
    for ( String w : sentences [ i ] . split ( " " ) ) {
      if ( ! b . containsKey ( w ) ) {
        b . put ( w , n ) ;
      }
      else {
        b . get ( w ) | = n ;
      }
    }
  }
  final int [ ] counts = new int [ 1024 * 1024 ] ;
  for ( int v : b . values ( ) ) {
    counts [ v ] ++ ;
  }
  final int [ ] values = copyOf ( b . values ( ) ) ;
  int cmin = 1000000000 ;
  for ( int i : xrange ( 1 , 1 << N , 4 ) ) {
    int c = 0 ;
    for ( int a : values ) {
      final int x = a & i ;
      if ( x == a || x == 0 ) continue ;
      c += counts [ a ] ;
    }
    cmin = Math . min ( c , cmin ) ;
  }
  return cmin ;
}
