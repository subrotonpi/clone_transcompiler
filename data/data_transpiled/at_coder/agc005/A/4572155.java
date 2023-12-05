public static int stack = 0 ;
String S = input ( ) ;
int ans = S . length ( ) ;
for ( char c : S . toCharArray ( ) ) {
  if ( c == "S" ) {
    stack ++ ;
  }
  else if ( stack != 0 ) {
    stack -- ;
    ans -= 2 ;
  }
}
System . out . println ( ans ) ;
return ans ;
}
