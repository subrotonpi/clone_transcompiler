static void print ( int N , int M , int L ) {
  int P = Integer . parseInt ( input ( ) ) ;
  int Q = Integer . parseInt ( input ( ) ) ;
  int R = Integer . parseInt ( input ( ) ) ;
  int pqr = ( N / P ) * ( M / Q ) * ( L / R ) ;
  int prq = ( N / P ) * ( M / Q ) * ( L / R ) ;
  int qpr = ( N / Q ) * ( M / P ) * ( L / R ) ;
  int qrp = ( N / Q ) * ( M / R ) * ( L / P ) ;
  int rpq = ( N / R ) * ( M / P ) * ( L / Q ) ;
  int rqp = ( N / R ) * ( M / Q ) * ( L / P ) ;
  System . out . println ( Math . max ( pqr , prq , qpr , qrp , rpq , rqp ) ) ;
}
