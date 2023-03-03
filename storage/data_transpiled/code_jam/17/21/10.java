private static void solve ( int d , int n , List < Pair < Integer , Integer >> horses ) {
  Comparator < Pair < Integer , Integer >> comp = new Comparator < Pair < Integer , Integer >> ( ) {
    @ Override public int compare ( Pair < Integer , Integer > a , Pair < Integer , Integer > b ) {
      return d * b . second - a . first * b . second - ( d * a . second - a . first * b . first ) ;
    }
  }
  ;
  List < Pair < Integer , Integer >> ranked = new ArrayList < > ( horses ) ;
  Collections . sort ( ranked , comp ) ;
  Pair < Integer , Integer > slowest = ranked . get ( ranked . size ( ) - 1 ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    d = Integer . parseInt ( input . nextLine ( ) ) ;
    n = Integer . parseInt ( input . nextLine ( ) ) ;
    horses = new ArrayList < > ( n ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      horses . add ( Pair . of ( i , i ) ) ;
    }
    System . out . println ( "Case #" + testCase + ": " + solve ( d , n , horses ) ) ;
  }
}
