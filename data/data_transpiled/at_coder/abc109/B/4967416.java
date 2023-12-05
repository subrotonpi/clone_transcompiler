public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  String [ ] arr = new String [ n ] ;
  boolean flag = true ;
  String s = input ;
  arr [ 0 ] = s ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    String w = input . substring ( 0 , i ) ;
    if ( arr [ w ] . equals ( s ) ) {
      flag = false ;
    }
    if ( s . charAt ( s . length ( ) - 1 ) != w . charAt ( 0 ) ) {
      flag = false ;
    }
    arr [ w ] = s ;
    s = w ;
  }
  if ( flag ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
