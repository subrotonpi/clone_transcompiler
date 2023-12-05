public static List < Integer > convert ( String input ) {
  int E = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    L . add ( Integer . parseInt ( input ) ) ;
  }
  int same = Sets . intersection ( E , L ) . size ( ) ;
  switch ( same ) {
    case 6 : System . out . println ( 1 ) ;
    break ;
    case 5 : System . out . println ( L . contains ( B ) ? 2 : 3 ) ;
    break ;
    case 4 : System . out . println ( 4 ) ;
    break ;
    case 3 : System . out . println ( 5 ) ;
    break ;
    default : System . out . println ( 0 ) ;
    break ;
  }
  return L ;
}
