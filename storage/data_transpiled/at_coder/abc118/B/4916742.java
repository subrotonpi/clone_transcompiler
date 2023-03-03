private static int n = Integer . parseInt ( input ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > ka = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ka . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int l = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) l += 1 ;
  return l ;
}
