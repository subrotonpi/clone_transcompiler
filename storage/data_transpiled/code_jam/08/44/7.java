static final double [ ] [ ] getPermutations ( int K , String string ) {
  psyco . profile ( ) ;
  DEBUG = false ;
  int score ;
  {
    String [ ] parts = new String [ ] {
      string }
      ;
      int [ ] got = new int [ parts . length ] ;
      for ( int i : xrange ( parts . length ) ) {
        got [ i ] = types [ i ] . run ( parts [ i ] ) ;
      }
      return got ;
    }
    {
      final int [ ] ints = new int [ ints . length ] ;
      for ( int i : xrange ( ints . length ) ) {
        ints [ i ] = ints [ i ] ;
      }
      return ints ;
    }
    {
      final int [ ] ints = new int [ ints . length ] ;
      for ( int i : xrange ( ints . length ) ) {
        ints [ i ] = ints [ i ] ;
      }
      assert ints . length == 1 ;
      return ints ;
    }
    {
      final PrintStream out = System . out ;
      if ( out == null && file instanceof File && file . endsWith ( ".in" ) ) {
        out = file . substring ( 0 , file . length ( ) - 3 ) + ".out" ;
      }
      if ( out == null ) out = System . out ;
      else {
        out = new PrintStream ( out ) ;
      }
      if ( file instanceof File ) {
        final File file = ( File ) file ;
        final int ncases = getInt ( file ) ;
        for ( int i = 0 ;
        i < ncases ;
        i ++ ) {
          final int case = getInt ( file ) ;
          final int K = getInt ( file ) ;
          final String string = file . getName ( ) ;
          final int answer = runCase ( K , string ) ;
          System . out . println ( out . println ( ) >> 0 ? "Case #" + ( case + 1 ) + ": " + answer : "" ) ;
        }
      }
      return new String [ ] [ ] {
        {
        }
      }
      ;
    }
    {
      final int [ ] temp ;
      final int [ ] permutate ;
      int k ;
      int [ ] [ ] part ;
      int count = new int [ K ] [ ] ;
      for ( k = 0 ;
      i < temp . length ;
      k ++ ) {
        part = new int [ k ] ;
        for ( int m : permutate ) {
          temp [ k ] [ m ] = string . substring ( k , m + 1 ) ;
        }
      }
      return temp ;
    }
  }
  