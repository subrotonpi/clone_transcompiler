public static String N = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int minNum = Collections . min ( a ) ;
  int maxNum = a . size ( ) == 1 ? minNum * 2 : minNum * 2 - 1 ;
  String o = "Possible" , x = "Impossible" ;
  if ( Collections . max ( a ) != maxNum ) {
    System . out . println ( x ) ;
  }
  else if ( ! 1 <= a . size ( ) && a . size ( ) <= 2 ) {
    System . out . println ( x ) ;
  }
  else {
    for ( int n = minNum + 1 ;
    n <= maxNum ;
    n ++ ) {
      if ( a . get ( n ) < 2 ) {
        System . out . println ( x ) ;
        break ;
      }
    }
    else {
      System . out . println ( o ) ;
    }
  }
  return o ;
}
