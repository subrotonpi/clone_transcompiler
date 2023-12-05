public static int A , B , K = Integer . parseInt ( input . nextLine ( ) ) {
  List < Integer > list = Arrays . asList ( Math . min ( A , B ) , 0 , - 1 ) ;
  return list . get ( K - 1 ) ;
}
