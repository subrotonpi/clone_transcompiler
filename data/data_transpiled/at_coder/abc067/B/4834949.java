public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  L . forEach ( i -> System . out . println ( sum ( L ) - K ) ) ;
  return K ;
}
