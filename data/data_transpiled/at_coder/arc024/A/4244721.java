public static void main ( String [ ] L , String [ ] R ) {
  List < Integer > l = new LinkedList < Integer > ( ) ;
  List < Integer > r = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < L . length ;
  i ++ ) {
    l . add ( i ) ;
    r . add ( i ) ;
  }
  m = new LinkedList < Integer > ( ) ;
  m . addAll ( l ) ;
  m . addAll ( r ) ;
  int ans = 0 ;
  int cl = 0 ;
  int cr = 0 ;
  int k = 0 ;
  for ( int i = 0 ;
  i < m . size ( ) ;
  i ++ ) {
    k = m . get ( i ) ;
    cl = l . indexOf ( k ) ;
    cr = r . indexOf ( k ) ;
    ans += Math . min ( cl , cr ) ;
    cl = 0 ;
    cr = 0 ;
  }
  System . out . println ( ans ) ;
}
