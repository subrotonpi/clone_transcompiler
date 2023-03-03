{
  map = new HashMap < String , Integer > ( ) ;
  for ( int i = 0 ;
  i < map . length ;
  i ++ ) map . put ( map [ i ] , map [ i ] ) ;
  Map < String , Integer > e = new HashMap < String , Integer > ( ) ;
  for ( Map . Entry < String , Integer > entry : map . entrySet ( ) ) {
    e . put ( entry . getValue ( ) , i ) ;
  }
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] a = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = input . nextLine ( ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( a [ i ] . replaceAll ( String . valueOf ( map . get ( i ) ) , String . valueOf ( map . get ( i ) ) ) ) ;
  }
  Arrays . sort ( a ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( a [ i ] . replaceAll ( String . valueOf ( e . get ( i ) ) , String . valueOf ( map . get ( i ) ) ) ) ;
  }
  return a ;
}
