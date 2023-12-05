public static void print ( int N ) {
  List < String > l1 = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) l1 . add ( input . next ( ) ) ;
  int M = Integer . parseInt ( input . next ( ) ) ;
  List < String > l2 = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) l2 . add ( input . next ( ) ) ;
  HashMap < String , Integer > dic = new HashMap < String , Integer > ( ) ;
  for ( String v : ( l1 + l2 ) ) dic . put ( v , l1 . count ( v ) - l2 . count ( v ) ) ;
  System . out . println ( Collections . max ( dic . values ( ) ) ) ;
}
