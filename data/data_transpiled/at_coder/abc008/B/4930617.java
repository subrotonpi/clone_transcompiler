public static void print ( String ans ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  s = new String [ n ] ;
  for ( int __ = 0 ;
  __ < n ;
  __ ++ ) {
    s [ __ ] = input . nextLine ( ) ;
  }
  Set < String > names = new HashSet < String > ( ) ;
  names . addAll ( s ) ;
  int num = 0 ;
  for ( String name : names ) {
    if ( num < s . indexOf ( name ) ) {
      ans = name ;
      num = s . indexOf ( name ) ;
    }
  }
  System . out . println ( ans ) ;
}
