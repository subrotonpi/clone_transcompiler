public static void main ( String input ) {
  int H , BMI = map ( input . split ( " " ) ) ;
  H = H / 100 ;
  int W = BMI * ( H * H ) ;
  System . out . println ( W ) ;
}
