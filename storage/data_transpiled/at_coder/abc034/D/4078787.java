public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > Items = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Items . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int OK = 0 , NG = 100 ;
  for ( int i = 0 ;
  i < 100 ;
  i ++ ) {
    int X = ( OK + NG ) / 2 ;
    List < Integer > X_List = new ArrayList < > ( ) ;
    for ( int w = 0 ;
    w < X ;
    w ++ ) X_List . add ( w * ( p - X ) ) ;
    if ( Integer . parseInt ( X_List . get ( 0 ) ) >= K ) OK = X ;
    else NG = X ;
  }
  System . out . println ( OK ) ;
  return NG ;
}
