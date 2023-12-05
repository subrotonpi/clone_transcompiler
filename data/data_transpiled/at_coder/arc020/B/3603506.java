public static int [ ] getNum ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , c = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = n * c ;
  int [ ] a = new int [ n ] ;
  int [ ] num = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 1 ;
  i < 11 ;
  i ++ ) {
    for ( int k = 1 ;
    k < 11 ;
    k ++ ) {
      int ANS = 0 ;
      if ( i != k ) {
        for ( int m = 0 ;
        m < n ;
        m ++ ) {
          if ( m % 2 == 0 ) {
            if ( a [ m ] != i ) {
              ANS ++ ;
            }
          }
          if ( m % 2 == 1 ) {
            if ( a [ m ] != k ) {
              ANS ++ ;
            }
          }
        }
        ans = Math . min ( ans , ANS ) ;
      }
    }
  }
  System . out . println ( ans * c ) ;
  return num ;
}
