public static String input ( ) {
  S = S . substring ( 0 , S . length ( ) - 1 ) ;
  String [ ] snipetts = Arrays . asList ( "dream" , "dreamer" , "erase" , "eraser" ) . toArray ( ) ;
  boolean found = true ;
  int index = 0 ;
  while ( found ) {
    found = false ;
    for ( int i = 0 ;
    i < snipetts . length ;
    i ++ ) {
      if ( S . substring ( index , index + snipetts [ i ] . length ( ) ) . equals ( snipetts [ i ] ) ) {
        index += snipetts [ i ] . length ( ) ;
        found = true ;
        break ;
      }
    }
  }
  if ( index == S . length ( ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return null ;
}
