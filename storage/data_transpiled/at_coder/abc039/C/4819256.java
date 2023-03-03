private static String baseString = "WBWBWWBWBWBW" * 5 ;
String inputStr = input ( ) ;
int l = baseString . indexOf ( inputStr ) ;
String [ ] kenban = {
  "Do" , "Do" , "Re" , "Re" , "Mi" , "Fa" , "Fa" , "So" , "So" , "La" , "La" , "Si" }
  ;
  String ans = kenban [ l ] ;
  System . out . println ( ans ) ;
  return ans ;
}
