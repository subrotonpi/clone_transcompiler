@ VisibleForTesting static String solve ( Iterable < List < Integer >> xs ) {
  return Iterables . transform ( xs , new Function < List < Integer > , String > ( ) {
    @ Override public String apply ( List < Integer > input ) {
      Map < Integer , Set < Integer >> ss = new TreeMap < > ( ) ;
      for ( int n = 1 ;
      n <= 500 ;
      n ++ ) {
        for ( List < Integer > cc : combinations ( input , n ) ) {
          int T = Ints . checkedCast ( cc . size ( ) ) ;
          ss . put ( T , ImmutableSet . copyOf ( cc ) ) ;
          if ( ss . get ( T ) . size ( ) == 2 ) {
            Set < Integer > s = ss . get ( T ) ;
            Set < Integer > t = ss . get ( T ) ;
            return ( StringUtils . isEmpty ( s ) ? "" : s . toString ( ) ) + "\n" + StringUtils . isEmpty ( t ) ? "" : s . toString ( ) ;
          }
        }
      }
      return "Impossible" ;
    }
  }
  ) ;
}
