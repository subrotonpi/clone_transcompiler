public static int max ( ) {
  String s = input . nextLine ( ) ;
  return max ( Integer . parseInt ( s . substring ( 0 , 1 ) ) - 1 + 9 * ( s . length ( ) - 1 ) , sum ( map ( Integer :: parseInt , s ) ) ) ;
}
