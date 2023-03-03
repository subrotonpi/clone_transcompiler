@ VisibleForTesting static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  Deque < Integer > [ ] ko = new Deque [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Integer a = Integer . parseInt ( input . nextLine ( ) ) ;
    ko [ i ] = a ;
  }
  double dai = Double . MAX_VALUE ;
  for ( int j = 0 ;
  j < m ;
  j ++ ) {
    String [ ] san = new String [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      san [ i ] = ko [ i ] . getFirst ( ) ;
    }
    Counter c = new Counter ( san ) ;
    Counter to = c . getMostSignificantBits ( ) ;
    dai = Math . min ( to . getCount ( ) , dai ) ;
    int ira = to . getCount ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      ko [ i ] . remove ( ira ) ;
    }
  }
  System . out . println ( dai ) ;
}
