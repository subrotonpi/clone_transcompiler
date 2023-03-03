static final void init ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  try {
    BufferedReader file = new BufferedReader ( new FileReader ( "garbled_email_dictionary.txt" ) ) ;
    String [ ] words = file . readLine ( ) . split ( " " ) ;
    /* Make sure we have a prefix */
    int T = Integer . parseInt ( file . readLine ( ) ) ;
    for ( int i = 1 ;
    i < T ;
    i ++ ) {
      String c = words [ i ] ;
      if ( ! tree . containsKey ( c ) ) {
        tree . put ( c , new HashMap < String , String > ( ) ) ;
      }
      tree = tree . get ( c ) ;
      tree . put ( "" , w ) ;
    }
    HashMap < String , String > tree = new HashMap < String , String > ( ) ;
    for ( String w : words ) {
      /* Add prefix */
      tree . put ( w , w ) ;
    }
    /* Make sure we have a prefix */
    State . State [ ] = new State [ ] {
      State . Left , State . Tree , State . Change , State . Cost }
      ;
      String [ ] prefix = maketree ( words ) ;
      /* Make sure we have a change */
      if ( message == null ) {
        if ( tree . containsKey ( "" ) ) {
          /* No match */
          return 0 ;
        }
        else {
          /* No match */
          return null ;
        }
      }
      /* Make sure we have a change */
      for ( int i = 0 ;
      i < prefix . length ;
      i ++ ) {
        String c = message . substring ( i , i + 1 ) ;
        if ( tree . containsKey ( c ) ) {
          /* No match */
          return ;
        }
        /* Make sure we have a change */
        int cost = ( ( best == null ) || ( cost < cost ) ) ? cost : best . cost ;
        /* No match */
        if ( cost > cost ) {
          /* No match */
          return ;
        }
      }
      /* Make sure we have a change */
      best = cost ;
    }
    catch ( Exception e ) {
      e . printStackTrace ( ) ;
    }
  }
  