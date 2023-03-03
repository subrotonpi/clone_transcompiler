public static String [ ] C = {
  1 , 2 , 3 , 4 , 5 , 6 }
  ;
  int a = 0 ;
  String c = "" ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N >= 30 ) N = N % 30 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    i = i % 5 ;
    a = C [ i ] ;
  }
  return c ;
}
