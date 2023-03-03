public static int N = Integer . parseInt ( input ) {
  String S = input . next ( ) ;
  String res = S ;
  while ( res . contains ( "()" ) ) res = res . replace ( "()" , "" ) ;
  String ans = "(" + S + ")" + res . substring ( 1 ) ;
  return N ;
}
