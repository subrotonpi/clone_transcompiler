public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > val = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    val . add ( Integer . parseInt ( input ) ) ;
  }
  List < String > key = new ArrayList < > ( ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    key . add ( String . valueOf ( i ) ) ;
  }
  Map < String , Integer > map = Maps . newHashMap ( ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    map . put ( key . get ( i ) , val . get ( i ) ) ;
  }
  List < Map . Entry < String , Integer >> dSorted = new ArrayList < > ( map . entrySet ( ) ) ;
  Collections . sort ( dSorted , new Comparator < Map . Entry < String , Integer >> ( ) {
    @ Override public int compare ( Map . Entry < String , Integer > o1 , Map . Entry < String , Integer > o2 ) {
      return o1 . getValue ( ) - o2 . getValue ( ) ;
    }
  }
  ) ;
  for ( Map . Entry < String , Integer > num : dSorted ) {
    System . out . println ( num . getKey ( ) ) ;
  }
}
