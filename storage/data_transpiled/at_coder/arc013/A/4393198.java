public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int P = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  int tmp = - 1 ;
  tmp = Math . max ( ( int ) ( ( N / P ) * ( M / Q ) * ( L / R ) ) , tmp ) ;
  return tmp ;
}
