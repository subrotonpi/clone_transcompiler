public static void input ( ) {
  String A = input . nextLine ( ) ;
  String B = input . nextLine ( ) ;
  String C = input . nextLine ( ) ;
  int s1 = Integer . parseInt ( A . substring ( 0 , 1 ) ) ;
  int e1 = Integer . parseInt ( A . substring ( 1 , 2 ) ) ;
  int s2 = Integer . parseInt ( B . substring ( 0 , 1 ) ) ;
  int e2 = Integer . parseInt ( B . substring ( 1 , 2 ) ) ;
  int s3 = Integer . parseInt ( C . substring ( 0 , 1 ) ) ;
  int e3 = Integer . parseInt ( C . substring ( 1 , 2 ) ) ;
  if ( 10 <= s1 && s2 && s3 <= 990 ) {
    if ( 1 <= e1 && e2 <= e3 && e3 <= 10 ) {
      if ( s1 % 10 == 0 && s2 % 10 == 0 && s3 % 10 == 0 ) {
        System . out . println ( ( int ) ( s1 / 10 * e1 + s2 / 10 * e2 + s3 / 10 * e3 ) ) ;
      }
    }
  }
}
