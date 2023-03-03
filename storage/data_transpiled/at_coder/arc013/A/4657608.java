public static void print ( int N , int M , int L ) {
  int P = Integer . parseInt ( input ( ) ) ;
  int Q = Integer . parseInt ( input ( ) ) ;
  int R = Integer . parseInt ( input ( ) ) ;
  int Res = Math . max ( ( N / P ) * ( M / Q ) * ( L / R ) , ( N / Q ) * ( M / R ) * ( L / P ) , ( N / R ) * ( M / P ) * ( L / Q ) ) ;
  int Res2 = Math . max ( ( N / Q ) * ( M / P ) * ( L / R ) , ( N / R ) * ( M / Q ) * ( L / P ) ) ;
  System . out . println ( Math . max ( Res , Res2 ) ) ;
}
