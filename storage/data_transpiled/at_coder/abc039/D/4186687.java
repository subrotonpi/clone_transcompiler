static final String print ( ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = n . array ( ) ;
  {
    for ( int i = 0 ;
    i < h ;
    i ++ ) for ( int j = 0 ;
    j < w ;
    j ++ ) if ( p . get ( i , j ) == a ) q . set ( Math . max ( 0 , i - 1 ) , i + 2 , j ) ;
  }
  String t = s ;
  return t ;
}
