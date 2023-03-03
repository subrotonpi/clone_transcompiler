public static void input ( int n ) {
  int [ ] a = Integer . parseInt ( input . nextLine ( ) ) ;
  int count1 = a [ 0 ] ;
  int count2 = a [ 0 ] ;
  int answer1 = 0 ;
  int answer2 = 0 ;
  if ( a [ 0 ] <= 0 ) {
    answer1 += ( 1 - a [ 0 ] ) ;
    count1 = 1 ;
  }
  if ( a [ 0 ] >= 0 ) {
    answer2 += ( 1 + a [ 0 ] ) ;
    count2 = - 1 ;
  }
  for ( int i = 1 ;
  i < a . length ;
  i ++ ) {
    if ( ( count1 > 0 && count1 + i < 0 ) || ( count1 < 0 && count1 + i > 0 ) ) {
      count1 += i ;
      continue ;
    }
    else {
      answer2 += Math . abs ( count2 + i ) + 1 ;
      if ( count2 > 0 ) count2 = - 1 ;
      else count2 = 1 ;
    }
  }
  System . out . println ( Math . min ( answer1 , answer2 ) ) ;
}
