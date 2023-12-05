public static int n = Integer . parseInt ( input ) {
  List < Integer > l = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) l . add ( Collections . singletonList ( i ) ) ;
  double ct = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ct += l . get ( i ) . intValue ( ) * l . get ( i ) . intValue ( ) ;
  return ( int ) ( ct * 1.05 ) ;
}
