public static int N = Integer . parseInt ( input ) {
  List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) l . add ( Integer . parseInt ( input ) ) ;
  Collections . sort ( l ) ;
  return l . size ( ) ;
}
