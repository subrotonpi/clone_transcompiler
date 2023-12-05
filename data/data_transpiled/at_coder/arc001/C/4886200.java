public static int [ ] [ ] input ( ) {
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  int dis = Math . abs ( b - a ) ;
  int ans1 = ( int ) ( dis / 10 ) ;
  int ex = dis % 10 ;
  return null ;
}
