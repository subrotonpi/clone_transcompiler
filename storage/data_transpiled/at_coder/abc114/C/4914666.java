public static int count ( int i , int x , int y , int z ) {
  if ( i > N ) return 0 ;
  int c = x * y * z > 0 ? 1 : 0 ;
  c += count ( i * 10 + 7 , x + 1 , y , z ) ;
  c += count ( i * 10 + 3 , x , y , z + 1 ) ;
  return c ;
}
