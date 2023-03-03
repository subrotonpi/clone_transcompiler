@ VisibleForTesting static String input ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final Map < Integer , Pair < Integer , Integer >> graph = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final String a = ( String ) l . split ( " " ) [ 0 ] ;
    final String b = ( String ) l . split ( " " ) [ 1 ] ;
    final String c = ( String ) l . split ( " " ) [ 2 ] ;
    graph . get ( a ) . add ( new Pair < > ( c , Integer . parseInt ( b ) ) ) ;
    graph . get ( c ) . add ( new Pair < > ( a , 1 / Integer . parseInt ( b ) ) ) ;
  }
  return "" ;
}
