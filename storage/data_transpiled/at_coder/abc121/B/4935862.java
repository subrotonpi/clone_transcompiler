public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int [ ] a = Integer . parseInt ( input ) ;
    int ab = 0 ;
    for ( int j = 0 ;
    j < a . length ;
    j ++ ) {
      ab += a [ j ] * b [ j ] ;
    }
    if ( ab > - c ) {
      count ++ ;
    }
  }
  System . out . println ( count ) ;
}
