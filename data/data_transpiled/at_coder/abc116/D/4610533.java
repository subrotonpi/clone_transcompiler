@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static int main ( String [ ] args ) {
  int N = Integer . parseInt ( input ( args [ 0 ] ) ) ;
  int K = Integer . parseInt ( input ( args [ 1 ] ) ) ;
  List < Integer > td = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    td . add ( Collections . singletonList ( Integer . parseInt ( input ( args [ 2 ] ) ) ) ) ;
  }
  int ans = editorial ( N , K , td ) ;
  System . out . println ( ans ) ;
  {
    List < Integer > td = new ArrayList < > ( ) ;
    Collections . sort ( td , new Comparator < Integer > ( ) {
      public int compare ( Integer o1 , Integer o2 ) {
        return - o1 . compareTo ( o2 ) ;
      }
    }
    ) ;
    Map < Integer , Integer > c = new TreeMap < > ( ) ;
    int dSum = 0 ;
    List < Integer > tdsNotFirst = new ArrayList < > ( ) ;
    for ( int t = 0 ;
    t < K ;
    t ++ ) {
      if ( c . get ( t ) > 0 ) {
        tdsNotFirst . add ( t ) ;
      }
      c . put ( t , 1 ) ;
      dSum += t ;
    }
    int tSum = c . size ( ) ;
    ans = dSum + tSum * tSum ;
    for ( int t = K ;
    t < td . size ( ) ;
    t ++ ) {
      int d = c . get ( t ) ;
      if ( tdsNotFirst . isEmpty ( ) ) {
        return ans ;
      }
      if ( c . get ( t ) > 0 ) {
        continue ;
      }
      c . put ( t , 1 ) ;
      dSum += - tdsNotFirst . remove ( tdsNotFirst . size ( ) ) + d ;
      tSum ++ ;
      ans = Math . max ( ans , dSum + tSum * tSum ) ;
    }
    return ans ;
  }
}
