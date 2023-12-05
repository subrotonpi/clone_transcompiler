public static final int getCounter ( ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final HashMap < Integer , Integer > counter = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final int head = input . nextInt ( ) ;
    if ( ! counter . containsKey ( head ) ) {
      counter . put ( head , 1 ) ;
    }
    else {
      counter . get ( head ) ++ ;
    }
  }
  int charNum = 0 ;
  final ArrayList < Integer > charCount = new ArrayList < Integer > ( ) ;
  for ( char c : "MARCH" . toCharArray ( ) ) {
    if ( counter . containsKey ( c ) ) {
      charNum ++ ;
      charCount . add ( counter . get ( c ) ) ;
    }
  }
  int ans = 0 ;
  if ( charNum < 3 ) {
    System . out . println ( 0 ) ;
  }
  else {
    for ( int a = 0 ;
    a < 3 ;
    a ++ ) {
      int b = charCount . get ( a ) ;
      int c = charCount . get ( b ) ;
      ans += a * b * c ;
    }
    System . out . println ( ans ) ;
  }
  return ans ;
}
