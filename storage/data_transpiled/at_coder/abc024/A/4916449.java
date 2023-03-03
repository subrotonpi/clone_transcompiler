public static void childPrice ( int childPrice , int adultPrice , int discountPrice , int discountMin ) {
  int childNum = Integer . parseInt ( input . nextLine ( ) ) ;
  int adultNum = Integer . parseInt ( input . nextLine ( ) ) ;
  int personSum = childNum + adultNum ;
  System . out . println ( childPrice * childNum + adultPrice * adultNum - ( personSum >= discountMin ? discountPrice * personSum : 0 ) ) ;
}
