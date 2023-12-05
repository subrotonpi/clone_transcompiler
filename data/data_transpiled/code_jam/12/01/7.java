static final Map < String , String > mapping = new HashMap < String , String > ( ) {
  private static final long serialVersionUID = - 574370526881616162427L ;
  private static final long serialVersionUID = 1L ;
  {
    final String [ ] encoded = {
      "ejp mysljylc kd kxveddknmc re jsicpdrysi" , "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd" , "de kr kd eoya kw aej tysr re ujdr lkgc jv" , }
      ;
      final String [ ] decoded = {
        "our language is impossible to understand" , "there are twenty six factorial possibilities" , "so it is okay if you want to just give up" , }
        ;
        for ( int i : xrange ( encoded . length ) ) {
          for ( int j : xrange ( encoded [ i ] . length ) ) {
            if ( mapping . containsKey ( encoded [ i ] [ j ] ) && mapping . get ( encoded [ i ] [ j ] ) != decoded [ i ] [ j ] ) {
              throw new IllegalStateException ( "Multiple mapping for " + encoded [ i ] [ j ] ) ;
            }
            mapping . put ( encoded [ i ] [ j ] , decoded [ i ] [ j ] ) ;
          }
        }
      }
      private static long serialVersionUID = 1L ;
      @ Override public String decode ( String sentence ) {
        return StringUtils . decode ( sentence ) ;
      }
      @ Override public String decode ( String s ) {
        return s ;
      }
    }
    