static LinkedList < String > ticket = new LinkedList < String > ( ) {
  {
    add ( input . next ( ) ) ;
  }
}
;
for ( int state = 0 ;
state < 1 << ( ticket . size ( ) - 1 ) ;
state ++ ) {
  String fomula = ticket . get ( 0 ) + StringUtils . repeat ( ( state >> i & 1 ) + "" , 1 ) + ticket . get ( 1 ) ;
  if ( new Integer ( fomula ) . compareTo ( 7 ) == 0 ) {
    System . out . println ( fomula + StringUtils . repeat ( "=7" , 1 ) ) ;
    exit ( ) ;
  }
}
