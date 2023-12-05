@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  String a = input . nextLine ( ) ;
  String b = input . nextLine ( ) ;
  return new Iterable < Integer > ( ) {
    @ Override public Integer cnt ( String c ) {
      int n = c . length ( ) ;
      int [ ] [ ] [ ] dp = new int [ 2 ] [ n + 1 ] [ 2 ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        for ( int j = 0 ;
        j < n + 1 ;
        j ++ ) {
          dp [ i ] [ j ] [ k ] = 1 ;
        }
      }
      return dp [ 0 ] [ 1 ] [ 0 ] ;
    }
  }
  ;
}
