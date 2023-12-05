public static int IM = 10000000 ;
BufferedReader fin = new BufferedReader ( new FileReader ( "b.in" ) ) ;
PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( "b.out" ) ) ) ;
int c = Integer . parseInt ( fin . readLine ( ) ) ;
for ( int i : xrange ( 1 , c + 1 ) ) {
  int n = Integer . parseInt ( fin . readLine ( ) ) ;
  int m = Integer . parseInt ( fin . readLine ( ) ) ;
  int a = Integer . parseInt ( fin . readLine ( ) ) ;
  int x1 , y1 , x2 , y2 ;
  if ( n < m ) {
    x1 = n ;
    x2 = 1 ;
    y2 = ( a + n - 1 ) / n ;
    y1 = y2 * x1 - a ;
  }
  else {
    y1 = m ;
    x2 = ( a + m - 1 ) / m ;
    y2 = 1 ;
    x1 = x2 * y1 - a ;
  }
  String output = "0 0 " + x1 + " " + y1 + " " + x2 + " " + y2 ;
  if ( y2 > m || x2 > n ) output = "IMPOSSIBLE" ;
  System . out . println ( "Case #" + i + ": " + output . toString ( ) ) ;
  System . out . println ( >>> fout + ": " + output . toString ( ) ) ;
}
