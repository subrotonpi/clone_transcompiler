static final void solve ( ) {
  int x , y ;
  x = Integer . parseInt ( input . nextLine ( ) ) ;
  y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( x - y == 0 || Math . abs ( x - y ) == 1 ) {
    System . out . println ( "Brown" ) ;
  }
  else {
    System . out . println ( "Alice" ) ;
  }
}
