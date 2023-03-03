@ VisibleForTesting static LinkedHashMap < Integer , Set < Integer >> map ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  final HashMap < Integer , Set < Integer >> teiki = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    teiki . put ( a , b ) ;
  }
  if ( ! teiki . containsKey ( 1 ) ) {
    System . out . println ( "IMPOSSIBLE" ) ;
    System . exit ( ) ;
  }
  return teiki ;
}
