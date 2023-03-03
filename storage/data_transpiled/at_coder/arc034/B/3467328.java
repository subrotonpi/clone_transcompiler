public static List < Integer > input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  List < Integer > ans = new ArrayList < > ( ) ;
  for ( int i = 1 ;
  i <= Math . min ( 154 , n + 1 ) ;
  i ++ ) {
    int x = n - i ;
    LinkedList < String > y = new LinkedList < > ( String . valueOf ( x ) ) ;
    int s = 0 ;
    for ( String j : y ) s += Integer . parseInt ( j ) ;
    if ( s == i ) ans . add ( Integer . parseInt ( x ) ) ;
  }
  Collections . sort ( ans ) ;
  System . out . println ( ans . size ( ) ) ;
  for ( int i : ans ) System . out . println ( i ) ;
  return ans ;
}
