public static void main ( String [ ] args ) {
  int rows = Integer . parseInt ( input . nextLine ( ) ) ;
  int cols = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] candies = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    candies [ i ] = new int [ r - 1 ] ;
    candies [ i ] [ c - 1 ] = i ;
  }
  System . out . println ( solve ( rows , cols , k , candies ) ) ;
}
