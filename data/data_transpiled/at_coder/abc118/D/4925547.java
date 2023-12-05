public static void solve ( int n , List < Integer > aList ) {
  Map < Integer , Integer > numbersMap = new HashMap < > ( ) ;
  numbersMap . put ( 1 , 2 ) ;
  numbersMap . put ( 2 , 5 ) ;
  numbersMap . put ( 3 , 5 ) ;
  numbersMap . put ( 4 , 4 ) ;
  numbersMap . put ( 5 , 5 ) ;
  numbersMap . put ( 6 , 6 ) ;
  numbersMap . put ( 7 , 3 ) ;
  numbersMap . put ( 8 , 7 ) ;
  numbersMap . put ( 9 , 6 ) ;
  Map < Integer , Integer > usableMap = new HashMap < > ( ) ;
  for ( int a : aList ) {
    usableMap . put ( a , numbersMap . get ( a ) ) ;
  }
  int inf = 1000 ;
  int [ ] dp = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dp [ i ] = 0 ;
    dp [ i ] = - inf ;
  }
  for ( int cost = 1 ;
  cost <= n ;
  cost ++ ) {
    for ( int value : usableMap . values ( ) ) {
      if ( cost - value < 0 || dp [ cost - value ] == 0 ) continue ;
      dp [ cost ] = Math . max ( dp [ cost ] , dp [ cost - value ] + 1 ) ;
    }
  }
  StringBuilder buff = new StringBuilder ( ) ;
  int digit = n ;
  List < Integer > reverseUsableList = new ArrayList < > ( usableMap . entrySet ( ) ) ;
  while ( true ) {
    for ( Map . Entry < Integer , Integer > entry : reverseUsableList ) {
      int num = entry . getKey ( ) ;
      if ( digit - value < 0 || dp [ digit ] - 1 != dp [ digit - value ] ) continue ;
      buff . append ( String . valueOf ( num ) ) ;
      digit -= value ;
      break ;
    }
    if ( digit <= 0 ) break ;
  }
  /* main program */
  n = Integer . parseInt ( input ( ) ) ;
  m = Integer . parseInt ( input ( ) ) ;
  aList = Collections . singletonList ( aList ) ;
  String ans = solve ( n , aList ) ;
  System . out . println ( ans ) ;
}
