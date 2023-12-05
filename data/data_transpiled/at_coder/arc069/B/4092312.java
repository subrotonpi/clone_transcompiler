public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input ) ;
  String s = input . nextLine ( ) ;
  StringBuilder sb = new StringBuilder ( ) ;
  sb . append ( s . charAt ( 0 ) ) ;
  for ( char d0 = 'S' ;
  d0 <= 'W' ;
  ++ d0 ) {
    for ( char d1 = 'S' ;
    d1 <= 'W' ;
    ++ d1 ) {
      String [ ] pat = wrap ( n , sb , d0 , d1 ) ;
      if ( pat [ 0 ] . equals ( pat [ n ] ) && pat [ 1 ] . equals ( pat [ n + 1 ] ) ) {
        String res = sb . toString ( ) ;
        System . out . println ( res ) ;
        return ;
      }
    }
  }
  System . out . println ( "-1" ) ;
}
