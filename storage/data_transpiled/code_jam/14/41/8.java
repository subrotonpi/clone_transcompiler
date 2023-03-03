) ;
"Pavel Mavrin" ) ;
fin = new BufferedReader ( new FileReader ( "A.in" ) ) ;
fout = new PrintWriter ( new FileWriter ( "A.out" ) ) ;
int testNum = Integer . parseInt ( fin . readLine ( ) ) ;
{
  int n = Integer . parseInt ( fin . readLine ( ) ) ;
  int x = Integer . parseInt ( fin . readLine ( ) ) ;
  int [ ] s = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s [ i ] = Integer . parseInt ( fin . readLine ( ) ) ;
  }
  Arrays . sort ( s ) ;
  int res = 0 ;
  int j = n - 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    res += s [ i ] + ( n - 2 * res ) ;
  }
}
