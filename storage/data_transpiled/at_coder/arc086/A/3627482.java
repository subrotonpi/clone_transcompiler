@ VisibleForTesting static void addAll ( Collection < Integer > input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > c = new ArrayList < > ( A ) ;
  List < Integer > values_list = new LinkedList < > ( c . values ( ) ) ;
  values_list . sort ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < values_list . size ( ) - K ;
  i ++ ) {
    ans += values_list . get ( i ) ;
  }
  System . out . println ( ans ) ;
}
