public static int N = Integer . parseInt ( input ) {
  String [ ] S = input . split ( " " ) ;
  Arrays . sort ( S ) ;
  int count = 0 ;
  String tmp = "" ;
  for ( String s : S ) {
    if ( tmp . compareTo ( s ) != 0 ) {
      count ++ ;
    }
    tmp = s ;
  }
  if ( count == 3 ) {
    System . out . println ( "Three" ) ;
  }
  else {
    System . out . println ( "Four" ) ;
  }
  return count ;
}
