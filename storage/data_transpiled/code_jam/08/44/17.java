public static void permGen ( int k , Set s ) {
  if ( s == null ) {
    s = new HashSet ( xrange ( k ) ) ;
  }
  if ( s . size ( ) == 1 ) {
    new Thread ( ( ) -> Collections . singleton ( s . iterator ( ) . next ( ) ) ) . start ( ) ;
    return ;
  }
  for ( Iterator i = s . iterator ( ) ;
  i . hasNext ( ) ;
  ) {
    for ( k = permGen ( k , s . toArray ( new Object [ s . size ( ) ] ) ) ;
    k . hasNext ( ) ;
    ) {
      String perm = ( String ) i . next ( ) ;
      String last = "" ;
      int l = 0 ;
      for ( int i : xrange ( str . length ( ) ) ) {
        char ch = str . charAt ( i / k * k + perm . charAt ( i % k ) ) ;
        if ( last != ch ) l ++ ;
        last = ch ;
      }
      if ( l < minl ) minl = l ;
    }
  }
  final Thread next = new Thread ( ( ) -> {
    String next = next . next ( ) ;
    int ncases = Integer . parseInt ( next ) ;
    for ( int i : xrange ( ncases ) ) {
      k = Integer . parseInt ( next . next ( ) ) ;
      s = next . next ( ) . trim ( ) ;
      int minlen = process ( k , s ) ;
      System . out . println ( "Case #" + ( i + 1 ) + ": " + minlen ) ;
      System . out . flush ( ) ;
    }
  }
  ) . start ( ) ;
}
