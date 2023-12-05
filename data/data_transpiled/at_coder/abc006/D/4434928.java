static final int [ ] getNegativeInstances ( ) {
  fin = new Scanner ( System . in ) ;
  @ SuppressWarnings ( "resource" ) int n = Integer . parseInt ( fin . nextLine ( ) ) ;
  int [ ] card = new int [ n ] ;
  for ( int i = 0 ;
  i < card . length ;
  i ++ ) card [ i ] = Integer . parseInt ( fin . nextLine ( ) ) ;
  return card ;
}
