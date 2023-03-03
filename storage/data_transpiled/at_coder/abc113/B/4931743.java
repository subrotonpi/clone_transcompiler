public static double getDouble ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double t = Double . parseDouble ( input . nextLine ( ) ) ;
  double a = Double . parseDouble ( input . nextLine ( ) ) ;
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Double > ans_l = new ArrayList < Double > ( ) ;
  /* elev */
  double high = t - n * 0.006 ;
  return Math . abs ( a - high ) ;
}
