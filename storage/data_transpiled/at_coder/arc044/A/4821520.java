public static final int input ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == 1 ) {
    System . out . println ( "Not Prime" ) ;
  }
  else {
    for ( int i = 2 ;
    i <= ( int ) ( N * N / 2 ) ;
    i ++ ) {
      if ( N % i == 0 ) {
        String a = Integer . toString ( N ) ;
        List < Integer > b = Lists . newArrayList ( ) ;
        for ( int j = 0 ;
        j < a . length ( ) ;
        j ++ ) {
          b . add ( Integer . parseInt ( a . substring ( j , j + 1 ) ) ) ;
        }
        if ( ( Integer . parseInt ( a . substring ( a . length ( ) - 1 ) ) % 2 != 0 ) && a . charAt ( a . length ( ) - 1 ) != '5' && Integer . parseInt ( b . get ( 0 ) ) % 3 != 0 ) {
          System . out . println ( "Prime" ) ;
          System . exit ( 0 ) ;
        }
        else {
          System . out . println ( "Not Prime" ) ;
          System . exit ( 0 ) ;
        }
      }
    }
  }
  System . out . println ( "Prime" ) ;
  return N ;
}
