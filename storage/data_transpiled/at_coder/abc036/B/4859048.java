public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < List < Integer >> s = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s . add ( Collections . singletonList ( input ) ) ;
  List < List < Integer >> a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    List < Integer > tmp = new ArrayList < > ( ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) tmp . add ( s . get ( n - j - 1 ) . get ( i ) ) ;
    a . add ( tmp ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) System . out . println ( a . get ( i ) ) ;
}
