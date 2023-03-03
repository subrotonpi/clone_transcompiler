public static int N = Integer . parseInt ( input ) {
  String letter = input . nextLine ( ) . split ( " " ) ;
  int A = letter . indexOf ( "Takahashikun" ) ;
  int B = letter . indexOf ( "takahashikun" ) ;
  int C = letter . indexOf ( "TAKAHASHIKUN" ) ;
  int D = letter . indexOf ( "Takahashikun." ) ;
  int E = letter . indexOf ( "takahashikun." ) ;
  int F = letter . indexOf ( "TAKAHASHIKUN." ) ;
  int G = letter . indexOf ( "Takahashikun," ) ;
  int H = letter . indexOf ( "takahashikun," ) ;
  int I = letter . indexOf ( "TAKAHASHIKUN," ) ;
  return N ;
}
