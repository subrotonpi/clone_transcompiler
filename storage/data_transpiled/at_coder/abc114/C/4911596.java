public static int n = Integer . parseInt ( input ) {
  String num1 = input . nextLine ( ) ;
  String num2 = input . nextLine ( ) ;
  if ( num2 . equals ( "0" ) ) {
    String num21 = "3" ;
    String num22 = "5" ;
    String num23 = "7" ;
    return counter ( num1 , num21 ) + counter ( num1 , num22 ) + counter ( num1 , num23 ) ;
  }
  else if ( Integer . parseInt ( num2 ) > num1 ) {
    return 0 ;
  }
  else {
    int result = 0 ;
    String num21 = "3" + num2 ;
    String num22 = "5" + num2 ;
    String num23 = "7" + num2 ;
    if ( "3" . contains ( num21 ) && "5" . contains ( num21 ) && "7" . contains ( num21 ) && Integer . parseInt ( num21 ) <= num1 ) {
      result ++ ;
    }
    if ( "3" . contains ( num22 ) && "5" . contains ( num22 ) && "7" . contains ( num22 ) && Integer . parseInt ( num22 ) <= num1 ) {
      result ++ ;
    }
    if ( "3" . contains ( num23 ) && "5" . contains ( num23 ) && "7" . contains ( num23 ) && Integer . parseInt ( num23 ) <= num1 ) {
      result ++ ;
    }
    return counter ( num1 , num21 ) + counter ( num1 , num22 ) + counter ( num1 , num23 ) + result ;
  }
}
