def import import sys , math , out
import string
import sys
import string
import sys
import string
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        Scanner ( )
        self.n , self.l = args
        s = string.split ( args , " " )
        tab , ans = 1 , 0
        for i in s :
            if i == "+" : tab += 1
            else : tab -= 1
            if tab > self.l :
                tab = 1
                ans += 1
        out.write ( ans )
