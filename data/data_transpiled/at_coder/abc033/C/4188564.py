def import import sys , string , ** kwargs ) :
    import sys
    import string
    import os
    import sys
    import math
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            sc = string.compile ( args , 'r' )
            s = sc.split ( '+' )
            ans = 0
            for i in s :
                if '0' not in i : ans += 1
            self.out.write ( ans )
