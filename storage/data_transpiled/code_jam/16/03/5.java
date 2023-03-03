print "Case #1:" ;
int n = 32 ;
int j = 500 ;
for ( int i = 0 ;
i < j ;
i ++ ) {
  String x = Integer . toBinaryString ( i ) . substring ( 2 ) ;
  String y = "0" + x ;
  StringBuffer sb = new StringBuffer ( '1' ) ;
  sb . append ( y ) ;
  sb . append ( "11" ) ;
  sb . append ( y ) ;
  sb . append ( '1' ) ;
  for ( int k = 2 ;
  k < 11 ;
  k ++ ) {
    sb . append ( ' ' ) ;
    sb . append ( k * ( n / 2 ) + 1 ) ;
  }
  print ( sb . toString ( ) ) ;
}
