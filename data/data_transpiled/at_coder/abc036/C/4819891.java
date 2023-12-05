public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > liA = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    liA . add ( Integer . parseInt ( input ) ) ;
  }
  List < Integer > liASorted = new ArrayList < Integer > ( Collections . nCopies ( n , liA ) ) ;
  Collections . sort ( liASorted ) ;
  Map < Integer , Integer > dRank = Maps . newHashMap ( ) ;
  for ( int idx = 0 ;
  idx < liASorted . size ( ) ;
  idx ++ ) {
    Integer v = liASorted . get ( idx ) ;
    dRank . put ( v , idx ) ;
  }
  for ( int i = 0 ;
  i < liA . size ( ) ;
  i ++ ) {
    System . out . println ( dRank . get ( liA . get ( i ) ) ) ;
  }
}
