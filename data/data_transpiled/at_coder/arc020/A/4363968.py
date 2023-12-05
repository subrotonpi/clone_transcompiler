def import import sys , abs , out
import os
import math
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        Scanner ( ).__init__ ( self )
        self.ans = ""
        a , b = sc.scan ( )
        a = abs ( a )
        b = abs ( b )
        if a < b :
            ans = "Ant"
        elif a > b :
            ans = "Bug"
        else :
            ans = "Draw"
        out.write ( ans )
