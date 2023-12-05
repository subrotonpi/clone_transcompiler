def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.count = 0
        while a != b :
            if b < a :
                tmp = a
                a = b
                b = tmp
            if b - a >= 8 :
                a += 10
                self.count += 1
            elif b - a >= 3 :
                a += 5
                self.count += 1
            else :
                a += 1
                self.count += 1
        print ( self.count )
