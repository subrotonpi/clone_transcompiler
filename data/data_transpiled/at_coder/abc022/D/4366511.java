public static String d_bigbang ( int N , List < List < Integer >> A , List < List < Integer >> B ) {
  /* Distance between two vectors */
  double [ ] [ ] a = Lists . toArray ( A ) ;
  double [ ] [ ] b = Lists . toArray ( B ) ;
  double [ ] gravity_center_1st_day = new double [ ] [ ] {
    Math . pow ( a [ 0 ] , N ) , Math . pow ( a [ 1 ] , N ) }
    ;
    double [ ] gravity_center_2nd_day = new double [ ] [ ] {
      Math . pow ( b [ 0 ] , N ) , Math . pow ( b [ 1 ] , N ) }
      ;
      double max_distance_from_gravity_center_1st_day = Math . max ( Arrays . stream ( A ) . map ( u -> dist2 ( gravity_center_1st_day , u ) ) . collect ( Collectors . toList ( ) ) , max_distance_from_gravity_center_2nd_day ) ;
      String ans = ans ;
      N = Integer . parseInt ( input ( ) ) ;
      A = Arrays . stream ( A ) . map ( Integer :: parseInt ) . collect ( Collectors . toList ( ) ) ;
      B = Arrays . stream ( B ) . map ( Integer :: parseInt ) . collect ( Collectors . toList ( ) ) ;
      System . out . println ( d_bigbang ( N , A , B ) ) ;
    }
    