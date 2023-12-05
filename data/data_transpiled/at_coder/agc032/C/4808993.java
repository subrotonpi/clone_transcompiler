public static int N ( Scanner input , int M ) {
  int c = 0 ;
  int d = 0 ;
  for ( ;
  ;
  ) {
    int a = input . nextInt ( ) ;
    int b = input . nextInt ( ) ;
    d += a * 5 + b * 7 ;
    c += a * 2 + b * 3 ;
    d %= 100 ;
    c %= 100 ;
  }
  switch ( c * 100 + d ) {
    case 15 : case 238 : case 639 : case 1008 : case 1870 : case 2773 : case 3072 : case 3622 : case 4911 : case 4939 : case 5062 : case 5915 : case 6158 : case 6669 : case 7997 : case 8237 : case 8289 : case 9023 : case 9120 : case 9182 : case 9863 : case 9992 : System . out . println ( "No" ) ;
    break ;
    default : System . out . println ( "Yes" ) ;
    break ;
  }
  return c ;
}
