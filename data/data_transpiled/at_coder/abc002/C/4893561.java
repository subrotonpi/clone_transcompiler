@ InputFunction public static void input ( @ AggregationState CovarianceState state ) {
  final int x1 = Integer . parseInt ( input . nextLine ( ) ) ;
  final int y1 = Integer . parseInt ( input . nextLine ( ) ) ;
  final int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
  final int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
  final int x3 = Integer . parseInt ( input . nextLine ( ) ) ;
  final int y3 = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( xy , new Comparator < CovarianceState > ( ) {
    @ Override public int compare ( CovarianceState o1 , CovarianceState o2 ) {
      return - 1 ;
    }
  }
  ) ;
}
