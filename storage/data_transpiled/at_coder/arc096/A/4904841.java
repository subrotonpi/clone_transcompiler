public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int AB = C * 2 ;
  if ( A + B < AB ) {
    System . out . println ( A * X + B * Y ) ;
  }
  else {
    int answer = X > Y ? AB * Math . min ( X , Y ) + A * ( X - Y ) : AB * Math . min ( X , Y ) + B * ( Y - X ) ;
    answer = AB * Math . max ( X , Y ) < answer ? AB * Math . max ( X , Y ) : answer ;
    System . out . println ( answer ) ;
  }
  return 0 ;
}
