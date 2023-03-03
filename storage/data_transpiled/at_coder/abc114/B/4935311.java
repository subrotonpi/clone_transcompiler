public static void input ( ) {
  s = input ;
  int l = s . length ( ) - 2 ;
  int n = 999 ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    int tmp = Math . abs ( 753 - ( int ) s . charAt ( i ) + s . charAt ( i + 1 ) + s . charAt ( i + 2 ) ) ;
    if ( ( tmp < n ) ) {
      n = tmp ;
    }
  }
  System . out . println ( n ) ;
}
