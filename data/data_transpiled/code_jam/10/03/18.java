static final Scanner getScanner ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  try {
    final PlexusScanner psyco = new PlexusScanner ( ) ;
    final Scanner tee = new Scanner ( System . in ) ;
    final PrintStream out = new PrintStream ( System . out ) {
      {
        final int [ ] fds = new int [ 1 ] ;
        {
          this . fds = fds ;
        }
      }
      ;
      public void print ( final String data ) {
        this . fds = fds ;
      }
      public void print ( final String data ) {
        this . fds [ 0 ] = "" ;
      }
      public void print ( final String data ) {
        for ( int i = 0 ;
        i < this . fds . length ;
        i ++ ) {
          out . println ( data ) ;
        }
      }
      public void flush ( ) {
        for ( int i = 0 ;
        i < this . fds . length ;
        i ++ ) {
          out . flush ( ) ;
        }
      }
      public void close ( ) {
        for ( int i = 0 ;
        i < this . fds . length ;
        i ++ ) {
          out . close ( ) ;
        }
      }
    }
    ;
    return new Scanner ( System . in , "theme.in" ) {
      private int entryCount ;
      private int [ ] readLines ( final Scanner source ) {
        final int entryCount = Integer . parseInt ( source . nextLine ( ) . trim ( ) ) ;
        for ( int i = 0 ;
        i <= entryCount ;
        i ++ ) {
          readLines ( source ) ;
        }
        return new int [ ] {
          entryCount }
          ;
        }
        public int [ ] nextLine ( ) {
          return ArrayUtil . toIntArray ( source . nextLine ( ) . trim ( ) . split ( "\\s+" ) ) ;
        }
        public int [ ] calculateGroupIteration ( final int [ ] groups , final int index , final int seats ) {
          int i = index ;
          if ( groups [ i ] > seats ) {
            return new int [ ] {
              0 , i }
              ;
              int total = groups [ i ] ;
              i = ( i + 1 ) % groups . length ;
              while ( i != index ) {
                if ( groups [ i ] + total > seats ) {
                  return new int [ ] {
                    total , i }
                    ;
                    total += groups [ i ] ;
                    i = ( i + 1 ) % groups . length ;
                  }
                  return new int [ ] {
                    total , i }
                    ;
                  }
                }
                public int [ ] calculateGroupTable ( final int [ ] groups , final int seats ) {
                  return Arrays . copyOfRange ( groups ,