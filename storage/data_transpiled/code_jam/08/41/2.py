def _import ( ) : return ''
import os
import os
import os
import locale
import random
import sys
class A ( object ) :
    NAME = 'a-large'
    def __init__ ( self ) :
        self.test = 1
        self.v = 0
        self.gates = [ ]
        self.changable = [ ]
    def _calc_values ( self ) :
        for i in range ( self.m // 2 - 1 , - 1 , - 1 ) :
            if self.gates [ i ] == OR :
                self.values [ i ] = self.values [ 2 * i + 1 ] | self.values [ 2 * i + 2 ]
            else :
                self.values [ i ] = self.values [ 2 * i + 1 ] & self.values [ 2 * i + 2 ]
    def _rec0 ( self , node ) :
        if self.values [ node ] == v :
            return 0
        if self.node >= self.m // 2 :
            return - 1
        v1 = _rec0 ( self.node + 1 )
        v2 = _rec0 ( self.node + 2 )
        if v1 == - 1 or v2 == - 1 :
            orvalue = - 1
        else :
            orvalue = v1 + v2
        andvalue = _best ( v1 , v2 )
        if self.gates [ node ] == OR :
            if self.changable [ node ] > 0 :
                return _best ( orvalue , _add1 ( andvalue ) )
            return orvalue
        if self.changable [ node ] > 0 :
            return _best ( andvalue , _add1 ( orvalue ) )
        return orvalue
    def _add1 ( self , node ) :
        if self.values [ node ] == v :
            return 0
        if self.node >= self.m // 2 :
            return - 1
        v1 = _rec1 ( self.node + 1 )
        v2 = _rec1 ( self.node + 2 )
        orvalue = _best ( v1 , v2 )
        andvalue = _best ( v1 , v2 )
        if v1 == - 1 or v2 == - 1 :
            andvalue = - 1
        return orvalue
