def _import ( ) : return math.pi * r ** 2 * h / 3.0
def calc ( r , h ) : return math.pi * r ** 2 * h / 3.0
def main ( ) :
    import sys
    import random
    import math
    N , Q = random.randint ( 1 , 4 )
    xs = [ ]
    rs = [ ]
    hs = [ ]
    for x , r , h in [ ( 0 , 1 , 2 ) , ( 0 , 2 , 3 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 3 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) , ( 0 , 2 , 4 ) ]
    sys.stdout.write ( sum ( )