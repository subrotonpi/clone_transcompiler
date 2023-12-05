public static void print ( int h , int m ) {
  double tyo = ( h % 12 ) * 30 + m * 0.5 ;
  double tan = m * 6 ;
  System . out . println ( Math . min ( Math . abs ( tyo - tan ) , 360 - Math . abs ( tyo - tan ) ) ) ;
}
