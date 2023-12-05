static final int [ ] [ ] getStrings ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < String >> L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 5 ;
  i ++ ) {
    L . add ( new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = String . valueOf ( input . nextLine ( ) ) ;
    switch ( s . charAt ( 0 ) ) {
      case 'M' : L . get ( 0 ) . add ( s ) ;
      break ;
      case 'A' : L . get ( 1 ) . add ( s ) ;
      break ;
      case 'R' : L . get ( 2 ) . add ( s ) ;
      break ;
      case 'C' : L . get ( 3 ) . add ( s ) ;
      break ;
      case 'H' : L . get ( 4 ) . add ( s ) ;
      break ;
    }
  }
  L = L . toArray ( new List [ L . size ( ) ] ) ;
  int ans = 0 ;
  for ( List < String > i : new List < > ( L ) ) {
    ans += i . get ( 0 ) . length ( ) * i . get ( 1 ) . length ( ) * i . get ( 2 ) . length ( ) ;
  }
  System . out . println ( ans ) ;
  return L ;
}
