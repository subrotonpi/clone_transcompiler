private static String inpFile = new BufferedReader ( new FileReader ( "A-small.in" ) ) ;
PrintWriter out = new PrintWriter ( new BufferedWriter ( new FileWriter ( "A-small.out" ) ) ) ;
/* solve the line */
int n = 0 ;
int A = Integer . parseInt ( line . readLine ( ) ) ;
int B = Integer . parseInt ( line . readLine ( ) ) ;
int C = Integer . parseInt ( line . readLine ( ) ) ;
int D = Integer . parseInt ( line . readLine ( ) ) ;
int x0 = Integer . parseInt ( line . readLine ( ) ) ;
int y0 = Integer . parseInt ( line . readLine ( ) ) ;
int M = Integer . parseInt ( line . readLine ( ) ) ;
trees [ 0 ] = new int [ n ] ;
trees [ 1 ] = new int [ n ] ;
int res = 0 ;
for ( int t1 = 0 ;
t1 < n ;
++ t1 ) {
  for ( int t2 = t1 ;
  t2 < n ;
  ++ t2 ) {
    trees [ t2 ] [ t3 ] = new int [ 3 ] ;
  }
}
return String . valueOf ( res ) ;
}
