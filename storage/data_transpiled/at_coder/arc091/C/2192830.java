public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > ans = Lists . newLinkedList ( ) ;
  int m = 0 ;
  int rest = N - A ;
  B -- ;
  if ( rest < B ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  if ( rest / A > B ) {
    return B ;
  }
  return ans . size ( ) ;
}
