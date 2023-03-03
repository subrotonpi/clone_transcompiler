@ GwtIncompatible ( "collections.collections.Iterable" ) public static < T > Case < T , Integer > of ( ) {
  final Case < T , Integer > Case = new Case < T , Integer > ( ) {
    @ Override public Integer [ ] readCase ( BufferedReader in ) throws IOException {
      int [ ] selection = new int [ 4 ] ;
      int [ ] [ ] array = new int [ 4 ] [ 4 ] ;
      for ( int i = 0 ;
      i < 4 ;
      i ++ ) {
        selection [ i ] = Integer . parseInt ( next ( in ) ) ;
        array [ i ] = readInts ( in ) ;
      }
      return selection ;
    }
    @ Override public String solvecase ( T testCase ) {
      List < Set < T >> sets = new ArrayList < Set < T >> ( ) ;
      for ( int sel = 0 ;
      sel < testCase ;
      sel ++ ) {
        sets . add ( new HashSet < T > ( ) ) ;
      }
      Set < T > possible = sets . get ( 0 ) ;
      if ( possible . isEmpty ( ) ) return "Volunteer cheated!" ;
      else if ( possible . size ( ) > 1 ) return null ;
      return possible . iterator ( ) . next ( ) ;
    }
  }
  ;
  return null ;
}
