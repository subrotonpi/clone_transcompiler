def main ( srgs ) :
    import os
    import sys
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.srgs = srgs
        def __call__ ( self , * args ) :
            a = random.randint ( 0 , a )
            b = [ ]
            for i in range ( a * 2 ) :
                b.append ( random.randint ( 0 , a ) )
            b.sort ( )
            count = 0
            for i in range ( a * 2 , 2 ) :
                count += b [ i ]
            print ( count )
            self.srgs.append ( b )
    return Main
