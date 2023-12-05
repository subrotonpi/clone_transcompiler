, n = Integer . MAX_VALUE , k = Integer . MIN_VALUE ) ;
List < String > d = Collections . singletonList ( input . nextLine ( ) ) ;
while ( n -- > 0 ) {
  String p = Integer . toString ( n ) ;
  int c = 0 ;
  for ( int i = 0 ;
  i < p . length ( ) ;
  i ++ ) {
    if ( d . contains ( p . charAt ( i ) ) ) {
      c ++ ;
      break ;
    }
  }
}
System . out . println ( n ) ;
}
