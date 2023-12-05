@ Implementation public static void input ( ) {
  String s = input . nextLine ( ) ;
  Collection c = new TreeSet ( s ) , num = 0 , num2 = 0 ;
  for ( Iterator i = c . iterator ( ) ;
  i . hasNext ( ) ;
  ) {
    num += ( i . next ( ) - i . next ( ) % 2 ) / 2 ;
  }
}
