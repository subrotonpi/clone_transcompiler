public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ans = new int [ m + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int k = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] a = new int [ k ] ;
    for ( int j = 0 ;
    j < a . length ;
    j ++ ) {
      a [ j ] = i ;
    }
    for ( int j = 0 ;
    j < k ;
    j ++ ) {
      ans [ a [ j ] ] ++ ;
    }
  }
  System . out . println ( ans . length / n ) ;
}
