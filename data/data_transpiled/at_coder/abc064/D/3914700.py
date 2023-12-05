def import sys , string , traceback
from os import urandom
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
    def __init__ ( self ) :
        self.N = sys.maxint
    def __call__ ( self , s ) :
        ans = ""
        min = sys.maxint
        count = 0
        for c in s :
            if c == "(" :
                count += 1
            elif c == ")" :
                count -= 1
            if count < 0 :
                min = min ( count , min )
        for i in range ( - min ) :
            ans = "(" + ans
        ans += s
        count2 = 0
        for c in ans :
            if c == "(" :
                count2 += 1
            elif c == ")" :
                count2 -= 1
        for i in range ( count2 ) :
            ans = ans + ")"
        print ( ans )
