static int numberofsteps ( List < Integer > list , int bites ) {
  final int output = bites ;
  for ( int item : list ) {
    output += ( ( int ) Math . ceil ( item / bites ) ) - 1 ;
  }
  return output ;
}
