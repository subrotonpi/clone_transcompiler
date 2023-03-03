public static String print ( ) {
  String s = input ( ) ;
  String t = input ( ) ;
  String s_sorted = "" . join ( new TreeSet ( s ) ) ;
  String t_sorted = "" . join ( new TreeSet ( t ) ) ;
  return s_sorted . compareTo ( t_sorted ) < 0 ? 'Yes' : 'No' ;
}
