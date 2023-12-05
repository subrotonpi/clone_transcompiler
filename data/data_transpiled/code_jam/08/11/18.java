static final double dist ( Point p1 , Point p2 ) throws IOException {
  double x1 = p1 . x , y1 = p1 . y ;
  double x2 = p2 . x , y2 = p2 . y ;
  return jth ( x2 - x1 , y2 - y1 ) ;
}
