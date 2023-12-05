def import import sys , os , sys
from os import fdopen
from os import urandom
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( urandom.read ( 1 ) )
        self.nums = [ int ( i ) for i in self.nums ]
        self.nums = [ random.randint ( 0 , n ) for i in self.nums ]
        self.sum = self.nums [ 0 ]
        if self.sum == 0 : self.write ( min ( solve ( 1 , 1 ) , solve ( - 1 , 1 ) ) )
        elif self.sum > 0 : self.write ( min ( solve ( self.sum , None ) , solve ( - 1 , self.sum + 1 ) ) )
        elif self.sum < 0 : self.write ( min ( solve ( self.sum , None ) , solve ( 1 , - self.sum + 1 ) ) )
    def solve ( self , sum , ans ) :
        for num in self.nums [ 1 : ] :
            if self.sum > 0 :
                sum += num
                if self.sum >= 0 :
                    ans += sum + 1
                    self.sum = - 1
            elif self.sum < 0 :
                sum += num
                if self.sum <= 0 :
                    ans += - sum + 1
                    self.sum = 1
        return ans
