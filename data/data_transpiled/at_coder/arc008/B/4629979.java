public static int n = Integer . parseInt ( input ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] name = input . split ( " " ) ;
  String [ ] kit = input . split ( " " ) ;
  int [ ] a = Arrays . copyOf ( name , kit . length ) ;
  int ans = 0 ;
  while ( a [ a . length - 1 ] != n ) {
    ans ++ ;
    int c = a [ a . length - 1 ] ;
    for ( int i = 0 ;
    i < b . length ;
    i ++ ) {
      if ( b [ i ] != n ) a [ a . index ( i ) ] = 0 ;
    }
    if ( a == c ) {
      ans = - 1 ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return m ;
}
