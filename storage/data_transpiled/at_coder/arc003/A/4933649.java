private static final Map < Character , Integer > SCORE = new HashMap < Character , Integer > ( 4 , 3 , 2 , 1 , 0 ) {
  private static final long serialVersionUID = 1L ;
  {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    String ranks = input . nextLine ( ) ;
    float gpa = ( float ) ( Integer . parseInt ( SCORE . get ( ranks ) ) / ( float ) ranks . length ( ) ) ;
    System . out . println ( "" + gpa ) ;
  }
}
