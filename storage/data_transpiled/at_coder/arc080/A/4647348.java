@ InputFunction public static void input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int num2 = 0 ;
  int num4 = 0 ;
  int numO = 0 ;
  for ( int num : A ) {
    if ( num % 4 == 0 ) {
      num4 ++ ;
      continue ;
    }
    else if ( num % 2 == 0 ) {
      num2 ++ ;
      continue ;
    }
    else {
      numO ++ ;
    }
  }
  if ( num2 > 0 ) {
    if ( numO > num4 ) {
      System . out . println ( "No" ) ;
    }
    else {
      System . out . println ( "Yes" ) ;
    }
  }
  else {
    if ( numO > Math . ceil ( ( num4 + numO ) / 2 ) ) {
      System . out . println ( "No" ) ;
    }
    else {
      System . out . println ( "Yes" ) ;
    }
  }
}
