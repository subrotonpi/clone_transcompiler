public static void main ( String [ ] args ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] A = input . nextLine ( ) . split ( "\\s+" ) ;
  Arrays . sort ( A ) ;
  int [ ] maps = new int [ A . length ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    maps [ i ] = maps [ A . length - i - 1 ] + A [ i ] ;
  }
  Arrays . sort ( maps ) ;
  Map < Integer , Integer > counts = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < maps . length ;
  i ++ ) {
    if ( counts . containsKey ( maps [ i ] ) ) {
      counts . put ( maps [ i ] , 1 ) ;
    }
    else {
      counts . put ( maps [ i ] , 1 ) ;
    }
  }
  int ans = 0 ;
  for ( Map . Entry < Integer , Integer > entry : counts . entrySet ( ) ) {
    if ( entry . getValue ( ) == 1 ) {
      continue ;
    }
    for ( int i = entry . getValue ( ) - 1 ;
    i > 0 ;
    i -- ) {
      ans += entry . getKey ( ) ;
    }
  }
  System . out . println ( ans ) ;
}
