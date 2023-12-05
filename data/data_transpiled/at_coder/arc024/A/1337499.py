def import import sys , string , traceback
from os import urandom
import random
class Main ( object ) :
    def __init__ ( self ) :
        self._l_n = random.randint ( 1 , 9 )
        self._r_n = random.randint ( 1 , 9 )
        self._l_sizes = [ random.randint ( 0 , 9 ) for i in range ( self._l_n ) ]
        self._r_sizes = [ random.randint ( 0 , 9 ) for i in range ( self._r_n ) ]
        self._l_sizes = [ random.randint ( 0 , 9 ) for i in self._l_sizes ]
        self._r_sizes = [ random.randint ( 0 , 9 ) for i in self._r_sizes ]
        self._l_sizes = [ random.randint ( 0 , 9 ) for i in self._l_sizes ]
        self._r_sizes = [ random.randint ( 0 , 9 ) for i in self._r_sizes ]
        self._l_index = 0
        self._r_index = 0
        self._ans = 0
        while self._l_index < self._l_n and self._r_index < self._r_n :
            if self._l_sizes [ self._l_index ] == self._r_sizes [ self._r_index ] :
                self._ans += 1
                self._l_index += 1
                self._r_index += 1
            elif self._l_sizes [ self._l_index ] > self._r_sizes [ self._r_index ] :
                self._r_index += 1
            else :
                self._l_index += 1
        print ( self._ans )
        return
