public static void print ( int N ) {
  int a = - ( - N / 9 ) ;
  String b ;
  if ( N % 9 == 0 ) {
    b = "9" ;
  }
  else {
    b = Integer . toString ( N % 9 ) ;
  }
  print ( b * a ) ;
}
