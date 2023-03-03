@ VisibleForTesting static void binarySearch ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ n ] ;
  int [ ] B = new int [ n ] ;
  int count = 0 ;
  int i = 0 ;
  while ( i <= A [ A . length - 1 ] ) {
    i = A [ B [ A [ i ] ] ] + x ;
    if ( i <= B [ B . length - 1 ] ) {
      i = B [ B [ B [ i ] ] ] + y ;
      count ++ ;
    }
    else {
      break ;
    }
  }
  System . out . println ( count ) ;
}
