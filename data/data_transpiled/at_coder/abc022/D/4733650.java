static final double [ ] [ ] o ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> o = new ArrayList < > ( ) ;
  List < List < Integer >> d = new ArrayList < > ( ) ;
  double [ ] o_grav = {
    0 , 0 }
    ;
    double [ ] d_grav = {
      0 , 0 }
      ;
      double o_size_sqed = 0 ;
      double d_size_sqed = 0 ;
      for ( int i = 0 ;
      i <= n ;
      i ++ ) {
        int [ ] buf = new int [ 2 ] ;
        for ( int j = 0 ;
        j <= n ;
        j ++ ) {
          buf [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
        }
        o_grav [ 0 ] += buf [ 0 ] ;
        o_grav [ 1 ] += buf [ 1 ] ;
        o . add ( buf ) ;
      }
      for ( int i = 0 ;
      i <= n ;
      i ++ ) {
        int [ ] buf = new int [ 2 ] ;
        for ( int j = 0 ;
        j <= n ;
        j ++ ) {
          buf [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
        }
        d_grav [ 0 ] += buf [ 0 ] ;
        d_grav [ 1 ] += buf [ 1 ] ;
        d . add ( buf ) ;
      }
      System . out . println ( Math . sqrt ( d_size_sqed / o_size_sqed ) ) ;
      return o ;
    }
    