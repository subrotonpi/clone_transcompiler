public static int mod ( int mod ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) ;
  HashMap < String , Integer > dic = new HashMap < String , Integer > ( ) ;
  for ( String s : "abcdefghijklmnopqrstuvwxyz" ) {
    dic . put ( s , 0 ) ;
  }
  for ( String s : S ) {
    dic . put ( s , 1 ) ;
  }
  int ans = 1 ;
  for ( int v : dic . values ( ) ) {
    ans *= v + 1 ;
  }
  System . out . println ( ( ans - 1 ) % mod ) ;
  return ans ;
}
