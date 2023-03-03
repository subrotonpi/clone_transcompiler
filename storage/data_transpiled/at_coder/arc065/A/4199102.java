public static void db ( String x ) {
  if ( debug ) {
    System . out . println ( x ) ;
  }
  /* Generate the tstr string */
  if ( tstr . length ( ) <= S . length ( ) ) {
    for ( String w : words ) {
      /* Generate the tstr string */
      String genstr = tstr + w ;
      for ( String w2 : gen ( tstr + w ) ) {
        /* Generate the tstr */
        String genstr = w2 ;
        /* Solve the tstr */
        db ( genstr ) ;
        if ( genstr . equals ( S ) ) {
          ans = true ;
          break ;
        }
      }
    }
  }
  /* Solve the tstr */
  boolean ans = false ;
  for ( String genstr : gen ( "" ) ) {
    /* Generate the tstr string */
    String str = genstr ;
    /* Solve the tstr */
    while ( stack . length ( ) != 0 ) {
      String str = stack . pop ( ) ;
      /* Solve the tstr */
      db ( ( ) -> "pop" , str ) ;
      if ( str . length ( ) < S . length ( ) ) {
        for ( String w : words ) {
          /* Solve the tstr */
          stack . push ( str + w ) ;
        }
      }
      else if ( str . length ( ) == S . length ( ) && str . equals ( S ) ) {
        /* Solve the tstr */
        String string = S + " " ;
        int n = string . length ( ) ;
        while ( n > 1 ) {
          for ( String w : words ) {
            /* Solve the tstr */
            db ( ( ) -> string . lastIndexOf ( w , 0 , n ) , w . length ( ) , n ) ;
            if ( string . lastIndexOf ( w , 0 , n ) + w . length ( ) + 1 == n ) {
              break ;
            }
          }
          /* Solve the tstr */
          db ( ( ) -> n -= w . length ( ) ) ;
        }
      }
    }
    debug = false ;
    words = new String [ ] {
      "dream" , "dreamer" , "erase" , "eraser" }
      ;
      S = input ( ) ;
      db ( S ) ;
      if ( solve3 ( ) ) {
        System . out . println ( "YES" ) ;
      }
      else {
        