public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = Integer . MIN_VALUE ;
  for ( int first = 1 ;
  first < 11 ;
  first ++ ) {
    for ( int second = 1 ;
    second < 11 ;
    second ++ ) {
      if ( first != second ) {
        int cost = 0 ;
        for ( int i = 0 ;
        i < n ;
        i ++ ) {
          if ( i % 2 == 0 && a [ i ] != first ) {
            cost += c ;
          }
          else if ( i % 2 == 1 && a [ i ] != second ) {
            cost += c ;
          }
        }
        ans = Math . min ( ans , cost ) ;
      }
    }
  }
  System . out . println ( ans ) ;
}
