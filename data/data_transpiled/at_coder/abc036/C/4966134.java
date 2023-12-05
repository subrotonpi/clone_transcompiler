public static void print ( int N ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > b = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) b . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  HashMap < Integer , Integer > dic = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < b . size ( ) ;
  i ++ ) dic . put ( b . get ( i ) , i ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) System . out . println ( dic . get ( a [ i ] ) ) ;
}
