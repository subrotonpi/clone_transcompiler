public static int [ ] getDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> SE = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    SE . add ( Collections . singletonList ( input . nextLine ( ) ) ) ;
  }
  int [ ] T = new int [ 2401 ] ;
  {
    int i = 0 ;
  }
  {
    String string = "" ;
    if ( Integer . parseInt ( string . substring ( string . length ( ) - 1 ) ) < 5 ) string = string . substring ( 0 , string . length ( ) - 1 ) + "0" ;
    else string = string . substring ( 0 , string . length ( ) - 1 ) + "5" ;
  }
  {
    String string = "" ;
    if ( string . equals ( "2400" ) ) string = string ;
    else if ( string . equals ( "0" ) ) string = string ;
    else if ( Integer . parseInt ( string . substring ( string . length ( ) - 1 ) ) <= 5 ) string = string . substring ( 0 , string . length ( ) - 1 ) + "5" ;
    else {
      if ( string . equals ( "5" ) ) string = Integer . toString ( Integer . parseInt ( string . substring ( 0 , string . length ( ) - 2 ) + 1 ) + "00" ) ;
      else string = string . substring ( 0 , string . length ( ) - 2 ) + Integer . toString ( Integer . parseInt ( string . substring ( 2 , string . length ( ) + 1 ) ) + 1 ) + "0" ;
    }
  }
  for ( int i = 0 ;
  i < 2401 ;
  i ++ ) {
    String s = SE . get ( i ) ;
    String e = SE . get ( i ) ;
    T [ i ] = 1 ;
    T [ i ] = 1 ;
    T [ i ] = 1 ;
  }
  String ans = "" ;
  int temp = 0 ;
  boolean flag = false ;
  for ( int i = 0 ;
  i < 2401 ;
  i ++ ) {
    temp += T [ i ] ;
    if ( temp >= 1 && ! ( flag ) ) {
      flag = true ;
      ans += format ( i , "04d" ) + "-" ;
    }
    if ( flag && temp == 0 ) {
      System . out . println ( ans + format ( i , "04d" ) ) ;
      ans = "" ;
      flag = false ;
    }
  }
  return T ;
}
