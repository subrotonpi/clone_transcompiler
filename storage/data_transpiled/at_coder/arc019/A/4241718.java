public static int input ( ) {
  String A = input ( ) ;
  String str1 = A . replace ( 'O' , '0' ) ;
  String str2 = str1 . replace ( 'D' , '0' ) ;
  String str3 = str2 . replace ( 'I' , '1' ) ;
  String str4 = str3 . replace ( 'Z' , '2' ) ;
  String str5 = str4 . replace ( 'S' , '5' ) ;
  String str6 = str5 . replace ( 'B' , '8' ) ;
  return ( int ) ( str6 ) ;
}
