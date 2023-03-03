public static void fin ( File fin ) throws IOException {
  File fout = new File ( "d.in" ) ;
  /* all perms */
  if ( str . length ( ) <= 1 ) {
    /* return */
    return ;
  }
  else {
    for ( String perm : allPerms ( str . substring ( 1 ) ) ) {
      for ( int i = 0 ;
      i < perm . length ( ) + 1 ;
      i ++ ) {
        /* return perm.substring(0, i) + str.substring(0, 1) + perm.substring(i); */
      }
    }
  }
  int n = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int i : xrange ( 1 , n + 1 ) ) {
    int k = Integer . parseInt ( fin . nextLine ( ) ) ;
    String s = fin . nextLine ( ) . trim ( ) ;
    System . out . println ( k + " " + s ) ;
    int best = 10000000 ;
    for ( String perm : allPerms ( new int [ k ] ) ) {
      String last = null ;
      int count = 0 ;
      String ns = s ;
      while ( ns . length ( ) > 0 ) {
        for ( int p = 0 ;
        p < perm . length ( ) ;
        p ++ ) {
          if ( ns . charAt ( p ) != last ) {
            count ++ ;
            last = ns . charAt ( p ) ;
          }
        }
        ns = ns . substring ( k ) ;
      }
      best = Math . min ( best , count ) ;
    }
    System . out . println ( best ) ;
    System . out . println ( >>> fout . getAbsolutePath ( ) + "Case #" + i + ": " + best ) ;
  }
}
