def _ ( ) : return abs ( cross_product ( a , b ) ) / 2.0
import math
import os
import random
import time
import random
import math
import random
import math
from math import fabs
class Main ( object ) :
    def __init__ ( self ) :
        self.x1 = random.randint ( 0 , 1 )
        self.y1 = random.randint ( 0 , 1 )
        self.x2 = random.randint ( 0 , 1 )
        self.y2 = random.randint ( 0 , 1 )
        self.x3 = random.randint ( 0 , 1 )
        self.y3 = random.randint ( 0 , 1 )
        self.x2 -= x1
        self.x3 -= x1
        self.y2 -= y1
        self.y3 -= y1
        print ( mymath.area_of_triangle ( ( self.x2 , self.y2 ) , ( self.x3 , self.y3 ) ) )
class MyMath ( math.Point ) :
    def crossProduct ( self , a , b ) :
        return a.x * b.y - a.y * b.x
    def area_of_triangle ( self , a , b ) :
        return abs ( crossProduct ( a , b ) ) / 2.0
class Point ( object ) :
    x = random.uniform ( 0 , 1 )
    y = random.uniform ( 0 , 1 )
