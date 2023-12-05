def import isPrime
from math import sqrt
from math import sin , cos , log
from os import urandom
from os import urandom
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = urandom ( )
        self.n = int ( urandom ( ) )
    def seed ( self ) :
        return self.sc.seed ( self.n )
    def isPrime ( self ) :
        return True
    def isPrime ( num ) :
        if num < 2 : return False
        elif num == 2 : return True
        elif num % 2 == 0 : return False
        sqrtNum = sqrt ( num )
        for i in range ( 3 , sqrtNum + 1 , 2 ) :
            if num % i == 0 :
                return False
        return True
