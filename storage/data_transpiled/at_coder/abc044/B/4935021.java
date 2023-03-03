static final String [ ] getStrings ( int [ ] array ) {
  StringBuilder sb = new StringBuilder ( ) ;
  int a = 0 ;
  int [ ] x = input . split ( " " ) ;
  if ( x . length % 2 != 0 ) {
    System . out . println ( "No" ) ;
  }
  else {
    for ( int i = 0 ;
    i < x . length ;
    i ++ ) {
      sb . append ( x [ i ] ) ;
    }
  }
  Counter < String > c = new Counter < String > ( sb . toString ( ) ) ;
  String [ ] values = c . values ( ) ;
  int [ ] counts = c . counts ( ) ;
  for ( int j = 0 ;
  j < counts . length ;
  j ++ ) {
    if ( counts [ j ] % 2 == 0 ) {
      a ++ ;
    }
  }
  if ( counts . length == a ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return values ;
}
