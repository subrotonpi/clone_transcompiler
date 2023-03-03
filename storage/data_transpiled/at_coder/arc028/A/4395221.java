public static String N , A , B ;
String res = "" ;
N = Integer . parseInt ( input . nextLine ( ) ) ;
while ( true ) {
  N -= A ;
  if ( N <= 0 ) {
    res = "Ant" ;
    break ;
  }
  N -= B ;
  if ( N <= 0 ) {
    res = "Bug" ;
    break ;
  }
}
System . out . println ( res ) ;
}
