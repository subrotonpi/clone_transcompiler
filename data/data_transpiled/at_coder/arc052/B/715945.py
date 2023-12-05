def _main ( ) : return
import sys
import os
import math
import random
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.N , self.Q = random.randint ( 1 , 3 )
        self.X , self.R , self.H = random.randint ( 1 , 3 )
    def get_volume ( self , A , B ) :
        ret = 0.0
        for i in range ( self.N ) :
            if self.X [ i ] >= B or self.X [ i ] + self.H [ i ] <= A :
                continue
            if self.X [ i ] >= A and self.X [ i ] + self.H [ i ] <= B :
                ret += float ( self.R [ i ] ) * self.R [ i ] * math.pi * self.H [ i ] / 3
            elif self.X [ i ] < A and self.X [ i ] + self.H [ i ] > B :
                a = float ( self.X [ i ] + self.H [ i ] - B ) / self.H [ i ]
                b = float ( self.X [ i ] + self.H [ i ] - A ) / self.H [ i ]
                c = ( self.R [ i ] * a ) * ( self.R [ i ] * a ) * math.pi * ( self.H [ i ] * a ) / 3
                d = ( self.R [ i ] * b ) * ( self.R [ i ] * b ) * math.pi * ( self.H [ i ] * b ) / 3
                ret += d - c
            elif self.X [ i ] < A and self.X [ i ] + self.H [ i ] <= B :
                a = float ( self.X [ i ] + self.H [ i ] - A ) / self.H [ i ]
                c = ( self.R [ i ] * a ) * ( self.R [ i ] * a ) * math.pi * ( self.H [ i ] * a ) / 3
                ret += c
