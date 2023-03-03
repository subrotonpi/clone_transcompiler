static final long [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > z1 = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int A = input . nextInt ( ) ;
    z1 . add ( A ) ;
  }
  ArrayList < Integer > z2 = new ArrayList < Integer > ( z1 ) ;
  System . out . println ( z2 . stream ( ) . filter ( Objects :: nonNull ) . count ( ) ) ;
  return z2 . toArray ( ) ;
}
