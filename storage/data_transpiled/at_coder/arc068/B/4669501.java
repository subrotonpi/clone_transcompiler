public static void n ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  LinkedList < Integer > lis = new LinkedList < Integer > ( ) ;
  lis . add ( n ) ;
  Set < Integer > ans = new HashSet < Integer > ( ) ;
  for ( int num : lis ) ans . add ( num ) ;
  System . out . println ( ans . size ( ) - ( ( ans . size ( ) % 2 ) + 1 ) % 2 ) ;
}
