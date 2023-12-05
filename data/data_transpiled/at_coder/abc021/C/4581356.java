static final double [ ] [ ] getMatrix ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] [ ] A = new double [ n + 1 ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    A [ i ] [ i ] = 1 ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    A [ i ] [ i ] = 1 ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    A [ i ] [ i ] = 1 ;
  }
}
