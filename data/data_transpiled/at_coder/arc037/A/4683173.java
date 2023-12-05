public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = list ( Integer . parseInt ( input ) ) ;
  int t = 0 ;
  for ( int c : m ) t += max ( 0 , 80 - c ) ;
  System . out . println ( t ) ;
}
