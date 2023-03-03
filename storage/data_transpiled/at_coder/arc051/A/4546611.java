public static double cx , double cy , double R = Double . parseDouble ( input ) {
  double l = Double . parseDouble ( input ) , d = Double . parseDouble ( input ) , r = Double . parseDouble ( input ) , u = Double . parseDouble ( input ) ;
  return ( cx - R < l || cx + R > r || cy - R < d || cy + R > u ) ;
}
