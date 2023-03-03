public static String mhd ( int sx , int sy , int tx , int ty ) {
  return ( Math . abs ( sx - tx ) + Math . abs ( sy - ty ) ) ;
  /* In the input line */
  String [ ] inpl = input . split ( " " ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int Sx = 0 , Sy = 0 , St = 0 ;
  String ans = "Yes" ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int Tt = inpl [ i ] ;
    int Tx = inpl [ i ] ;
    int Ty = inpl [ i ] ;
    if ( mhd ( Sx , Sy , Tx , Ty ) > Tt - St || ( mhd ( Sx , Sy , Tx , Ty ) - Tt + St ) % 2 ) ans = "No" ;
  }
  System . out . println ( ans ) ;
}
