public static void input ( ) {
  n = input ( ) ;
  fx = sum ( list ( map ( Integer . parseInt , str ( n ) ) ) ) ;
  System . out . println ( ( int ) n % fx == 0 ? 'Yes' : 'No' ) ;
}
