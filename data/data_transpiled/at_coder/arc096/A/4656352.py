def import import sys , StringIO , os
from os import urandom
import random
class Main ( object ) :
    def __init__ ( self , f , g ) :
        self.A = random.randint ( 0 , sys.maxint )
        self.B = random.randint ( 0 , sys.maxint )
        self.C = random.randint ( 0 , sys.maxint )
        self.X = random.randint ( 0 , sys.maxint )
        self.Y = random.randint ( 0 , sys.maxint )
        if self.C * 2 < A + B :
            price = C * 2 * min ( self.X , self.Y )
            if self.X < Y :
                if self.C * 2 < B :
                    price += self.C * 2 * ( self.Y - self.X )
                else :
                    price += self.B * ( self.Y - self.X )
            elif self.X > self.Y :
                if self.C * 2 < A :
                    price += self.C * 2 * ( self.X - self.Y )
                else :
                    price += self.A * ( self.X - self.Y )
            g.write ( price )
        else :
            g.write ( A * self.X + B * self.Y )
