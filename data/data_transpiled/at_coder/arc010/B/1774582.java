private static void solve ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final Set < ImmutableBitSet > a = new THashSet < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a . add ( ImmutableBitSet . valueOf ( input . nextLine ( ) ) ) ;
  }
  final LocalDate today = LocalDate . of ( 2012 , 1 , 1 ) ;
  final DayNumber day = DayNumber . of ( 1 ) ;
  int result = 0 ;
  int cur = 0 ;
  int stock = 0 ;
  for ( int i = 0 ;
  i < 366 ;
  i ++ ) {
    final int p = today . getMonthValue ( ) ;
    final int n = ( ! 0 < i % 7 < 6 ) ? p + ( a . contains ( a . get ( p ) ) ? stock - 1 : stock ) : stock - 1 ;
    if ( n >= 0 ) {
      stock = n ;
      cur ++ ;
      if ( result < cur ) {
        result = cur ;
      }
    }
    else {
      cur = 0 ;
      stock = 0 ;
    }
    today . plusDays ( day ) ;
  }
  System . out . println ( result ) ;
}
