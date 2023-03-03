public static final class Vector < Double > implements VectorWritable < Double > {
  private final double x , y ;
  public Vector < Double > x , y ;
  public VectorWritable < Double > y ;
  public VectorWritable < Double > add ( VectorWritable < Double > x , VectorWritable < Double > y ) {
    this . x = x ;
    this . y = y ;
  }
  public VectorWritable < Double > subtract ( VectorWritable < Double > x , VectorWritable < Double > y ) {
    this . x = x . add ( y . add ( x ) ) ;
    this . y = y . add ( y . subtract ( y ) ) ;
  }
  public VectorWritable < Double > __mult__ ( double scaler ) {
    return new VectorWritable < Double > ( x . multiply ( scaler ) , y . multiply ( scaler ) ) ;
  }
  public VectorWritable < Double > dot ( VectorWritable < Double > other ) {
    return this . x . multiply ( other . x ) . add ( y . multiply ( other . y ) ) ;
  }
  public double length ( ) {
    return dot ( this ) * 0.5 ;
  }
  public double absCross ( VectorWritable < Double > other ) {
    return Math . abs ( other . x * other . y - other . x * other . x ) ;
  }
}
