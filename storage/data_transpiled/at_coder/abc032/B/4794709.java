public static void input ( ) {
  String s = input ( ) ;
  int k = Integer . parseInt ( input ( ) ) ;
  HashMap < String , Integer > dic = new HashMap < String , Integer > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) - k + 1 ;
  i ++ ) {
    String word = s . substring ( i , i + k ) ;
    dic . put ( word , 1 ) ;
  }
  System . out . println ( dic . keySet ( ) . size ( ) ) ;
}
