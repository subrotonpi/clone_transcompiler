public static int count ( String fin , int n , int s , boolean pos ) throws IOException {
  BufferedReader fin = new BufferedReader ( new FileReader ( "c.in" ) ) ;
  int n = Integer . parseInt ( fin . readLine ( ) ) ;
  PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( "c.out" ) ) ) ;
  /*ugly */
  if ( n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0 ) {
    return 1 ;
  }
  /*count */
  if ( n . length ( ) == 0 ) {
    return ugly ( k + s ) ;
  }
  int a = 0 ;
  if ( pos ) {
    a += count ( n . substring ( 1 ) , k , s * 10 + Integer . parseInt ( n . substring ( 0 , 1 ) ) , true ) ;
  }
  else {
    a += count ( n . substring ( 1 ) , k , s * 10 - Integer . parseInt ( n . substring ( 0 , 1 ) ) , false ) ;
  }
  a += count ( n . substring ( 1 ) , k + s , Integer . parseInt ( n . substring ( 0 , 1 ) ) , true ) ;
  a += count ( n . substring ( 1 ) , k + s , - Integer . parseInt ( n . substring ( 0 , 1 ) ) , false ) ;
  return a ;
}
