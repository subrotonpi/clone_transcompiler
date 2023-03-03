public static String roop ( String St ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) ;
  S += S . charAt ( 0 ) ;
  /* roop(St) */
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int flag = 1 ;
    if ( S . charAt ( i ) == 'x' ) flag *= - 1 ;
    if ( St . charAt ( i ) == 'W' ) flag *= - 1 ;
    if ( St . charAt ( i - 1 ) == 'W' ) flag *= - 1 ;
    if ( flag == 1 ) St += 'S' ;
    else St += 'W' ;
  }
  String ans = "-1" ;
  String [ ] candidate = new String [ ] {
    "SS" , "WS" , "SW" , "WW" }
    ;
    for ( int i = 0 ;
    i < candidate . length ;
    i ++ ) {
      String [ ] a = roop ( candidate [ i ] ) ;
      if ( a [ 0 ] . equals ( a [ a . length - 2 ] ) && a [ 1 ] . equals ( a [ a . length - 1 ] ) ) {
        ans = a [ 0 ] . substring ( 0 , N ) ;
        break ;
      }
    }
    System . out . println ( ans ) ;
    return ans ;
  }
  