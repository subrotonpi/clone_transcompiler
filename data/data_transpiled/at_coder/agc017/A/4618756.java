public static int N ( int input , int P ) {
  int Odd = Integer . parseInt ( input ) ;
  int Even = N - Odd ;
  {
    int ans = 1 ;
    for ( int i = 0 ;
    i < input ;
    i ++ ) ans *= input - i ;
    for ( int i = 0 ;
    i < input ;
    i ++ ) ans /= input + 1 ;
    return ( ans ) ;
  }
  int ans = 2 * Even ;
  int tmp = 0 ;
  for ( int i = P ;
  i <= Odd ;
  i += 2 ) tmp += f_C ( Odd , i ) ;
  System . out . println ( ans * tmp ) ;
  return ans ;
}
