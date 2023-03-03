public static int N ( ) {
  int flag = 1 ;
  if ( N == 1 ) flag = 0 ;
  else if ( N == 2 || N == 3 || N == 5 ) flag = 1 ;
  else if ( N % 2 == 0 || N % 3 == 0 || N % 5 == 0 ) flag = 0 ;
  else flag = 1 ;
  return flag == 1 ? "Prime" : "Not Prime" ;
}
