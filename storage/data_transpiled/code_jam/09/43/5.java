@ VisibleForTesting static final PartialOrder . MaximumAntichain < Integer > ONE = new PartialOrder . MaximumAntichain < Integer > ( ) {
  @ Override public Integer readInteger ( ) {
    return Integer . parseInt ( readLine ( ) ) ;
  }
  @ Override public List < Integer > readArray ( BufferedReader in ) throws IOException {
    return CollectionUtils . newArrayList ( readLine ( in ) . split ( " " ) ) ;
  }
  @ Override public boolean dom ( int [ ] a , int [ ] b ) {
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      if ( a [ i ] >= b [ i ] ) {
        return false ;
      }
    }
    return true ;
  }
  @ Override public boolean incomp ( int [ ] a , int [ ] b ) {
    return ! dominates ( a , b ) && ! dominates ( b , a ) ;
  }
}
