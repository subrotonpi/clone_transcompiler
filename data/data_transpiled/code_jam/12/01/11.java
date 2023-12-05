public static String A = "ejpmysljylckdkxveddknmcrejsicpdrysirbcpcypcrtcsradkhwyfrepkymveddknkmkrkcddekrkdeoyakwaejtysrreujdrlkgcjv" ;
String B = "ourlanguageisimpossibletounderstandtherearetwentysixfactorialpossibilitiessoitisokayifyouwanttojustgiveup" ;
Map < Character , String > map = Maps . newHashMap ( ) ;
map . put ( A , B ) ;
map . put ( 'z' , 'q' ) ;
map . put ( 'q' , 'z' ) ;
map . put ( ' ' , ' ' ) ;
int T = input . nextInt ( ) ;
for ( int t = 0 ;
t < T ;
t ++ ) {
  String s = input . next ( ) ;
  System . out . println ( "Case #" + ( t + 1 ) + ": " + StringUtils . capitalize ( s ) ) ;
}
return map . get ( A ) ;
}
