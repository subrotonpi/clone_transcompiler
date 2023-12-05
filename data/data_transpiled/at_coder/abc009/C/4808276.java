@ VisibleForTesting static String from ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > S = Lists . newArrayList ( ) ;
  Collections . sort ( S ) ;
  String T = "" ;
  int miss = 0 ;
  Counter < Integer > counter = new Counter < > ( S . subList ( 0 , 1 ) ) ;
  int counts = Integer . valueOf ( counter . values ( ) . size ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int c : s_sort ) {
      int miss1 = miss + ( c != S . get ( i ) ) ;
      int miss2 = counts - ( counter . getCount ( c ) > 0 ) ;
      if ( miss1 + miss2 <= k ) {
        T += c ;
        s_sort . remove ( c ) ;
        miss = miss1 ;
        counter = new Counter < > ( S . subList ( 0 , i + 2 ) ) - new Counter < > ( T ) ;
        counts = Integer . valueOf ( counter . getCount ( c ) ) ;
        break ;
      }
    }
  }
  System . out . println ( T ) ;
  return T ;
}
