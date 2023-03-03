static final String solve ( ) throws IOException {
  final Scanner in = new Scanner ( System . in ) ;
  final Map < Integer , Integer > mapping = new HashMap < Integer , Integer > ( ) ;
  for ( int i = xrange ( 1 , 2000000 + 1 ) ;
  i <= 2000000 ;
  i ++ ) {
    String s = in . next ( ) ;
    int minval = 9999999 ;
    for ( int j : xrange ( s . length ( ) ) ) {
      String s2 = s . substring ( j ) + s . substring ( 0 , j ) ;
      if ( s2 . charAt ( 0 ) != '0' ) {
        minval = Math . min ( minval , Integer . parseInt ( s2 ) ) ;
      }
    }
    mapping . put ( i , minval ) ;
  }
  in . close ( ) ;
  final int ncases = Integer . parseInt ( in . next ( ) ) ;
  for ( int caseno = xrange ( ncases ) ;
  caseno < ncases ;
  caseno ++ ) {
    final List < Integer > list = new ArrayList < Integer > ( ) ;
    for ( String s : in . next ( ) . split ( " " ) ) {
      list . add ( Integer . parseInt ( s ) ) ;
    }
    final int low = list . get ( 0 ) ;
    final int high = list . get ( 1 ) ;
    final HashMap < Integer , Integer > counts = new HashMap < Integer , Integer > ( ) ;
    for ( int i : xrange ( low , high + 1 ) ) {
      final int minval = mapping . get ( i ) ;
      if ( ! counts . containsKey ( minval ) ) {
        counts . put ( minval , 0 ) ;
      }
      counts . put ( minval , 1 ) ;
    }
    int result = 0 ;
    for ( int v : counts . keySet ( ) ) {
      if ( counts . get ( v ) >= 2 ) {
        final int t = counts . get ( v ) ;
        final int add = ( t * ( t - 1 ) ) / 2 ;
        result += add ;
      }
    }
    System . out . println ( "Case #" + ( caseno + 1 ) + ": " + result ) ;
  }
  return null ;
}
