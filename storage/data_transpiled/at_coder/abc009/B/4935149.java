public static void main ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  l = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) l . add ( Integer . parseInt ( input ( ) ) ) ;
  l . sort ( ) ;
  System . out . println ( l . get ( l . size ( ) - 2 ) ) ;
}
