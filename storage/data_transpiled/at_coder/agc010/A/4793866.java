public static void N ( Scanner input ) {
  int [ ] An = map . get ( input . nextLine ( ) ) ;
  int odds = 0 ;
  int evens = 0 ;
  for ( int i = 0 ;
  i < An . length ;
  i ++ ) {
    int A = An [ i ] ;
    if ( A % 2 == 0 ) {
      evens ++ ;
    }
    else {
      odds ++ ;
    }
  }
  if ( odds % 2 != 0 ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
}
