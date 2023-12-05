public static int [ ] getDigits ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) , b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( 9 - Integer . parseInt ( a / 100 ) > Integer . parseInt ( b / 100 ) - 1 ) {
    System . out . println ( a + 100 * ( 9 - Integer . parseInt ( a / 100 ) ) - b ) ;
  }
  else if ( 9 - Integer . parseInt ( a / 100 ) < Integer . parseInt ( b / 100 ) - 1 ) {
    System . out . println ( a - b + 100 * ( Integer . parseInt ( b / 100 ) - 1 ) ) ;
  }
  else if ( Integer . parseInt ( a / 100 ) == 9 && Integer . parseInt ( b / 100 ) == 1 ) {
    if ( Integer . parseInt ( a / 10 ) == 99 && Integer . parseInt ( b / 10 ) == 10 ) {
      int num = Math . max ( 9 - a % 10 , b % 10 ) ;
      System . out . println ( a - b + ( int ) num ) ;
    }
    else {
      int num2 = Math . max ( 9 - Integer . parseInt ( ( a - 900 ) / 10 ) , Integer . parseInt ( ( b - 100 ) / 10 ) ) ;
      System . out . println ( a - b + ( int ) ( num2 * 10 ) ) ;
    }
  }
  else {
    System . out . println ( a - b + 100 * ( Integer . parseInt ( b / 100 ) - 1 ) ) ;
  }
  return new int [ ] {
    a , b }
    ;
  }
  