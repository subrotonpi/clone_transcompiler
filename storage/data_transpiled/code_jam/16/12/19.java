static final void main ( String [ ] args ) throws Exception {
  if ( args . length == 0 ) {
    int t = Integer . parseInt ( args [ 0 ] ) ;
    for ( int caseNum = 1 ;
    caseNum <= t ;
    caseNum ++ ) {
      int n = Integer . parseInt ( args [ 1 ] ) ;
      Map < Integer , Integer > cnt = Maps . newHashMap ( ) ;
      for ( int i = 2 * n - 1 ;
      i < n ;
      i ++ ) {
        List < Integer > nums = Arrays . asList ( args [ 2 ] . split ( " " ) ) ;
        for ( int x : nums ) {
          cnt . put ( x , cnt . getOrDefault ( x , 0 ) + 1 ) ;
        }
      }
      List < Integer > sol = new ArrayList < > ( cnt . entrySet ( ) ) ;
      for ( Map . Entry < Integer , Integer > entry : cnt . entrySet ( ) ) {
        if ( entry . getValue ( ) % 2 == 1 ) {
          sol . add ( entry . getKey ( ) ) ;
        }
      }
      assert sol . size ( ) == n ;
      System . out . println ( "Case #" + caseNum + ": " + StringUtils . join ( sol , " " ) ) ;
    }
  }
}
