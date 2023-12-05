public static Runnable II = new Runnable ( ) {
  @ Override public void run ( ) {
    Integer . parseInt ( input . nextLine ( ) ) ;
    Function < Integer , List < Integer >> MI = map ( Integer :: parseInt , input . nextLine ( ) . split ( " " ) ) ;
    Function < Integer , List < Integer >> MIL = map ( Integer :: parseInt , List :: asList , MI ) ;
    Function < Integer , List < Integer >> MIS = map ( Integer :: parseInt , input . nextLine ( ) . split ( " " ) ) ;
  }
}
