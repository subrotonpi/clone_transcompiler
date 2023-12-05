def round1C ( ) :
    import sys
    import random
    import os
    import os
    import sys
    import os
    import math
    import decimal
    import math
    import math
    import math
    import decimal
    import math
    import math
    import decimal
    import math
    import decimal
    import math
    class A :
        def __init__ ( self , sc , rand ) :
            self.sc = sc
            self.rand = random.randrange ( 1 , 3 )
        def __call__ ( self ) :
            try :
                f = open ( 'C:\\Users\\shimomire\\Dropbox\\Project\\ProgramContest\\python\\GCJ\\res.out' , 'w' )
            except IOError :
                pass
        def __call__ ( self ) :
            t = sc.__next__ ( )
            lines = [ ]
            for i in range ( 1 , t + 1 ) :
                data = sc.__next__ ( )
                data = sc.__next__ ( )
                is_c = [ c in [ 'a' , 'i' , 'u' , 'e' , 'o' ] for c in data ]
                l , r = 0 , 0
                v = 0
                res = 0
                while r < len ( data ) :
                    if is_c [ r ] : v = 0
                    else : v += 1
                    if v < len ( data ) :
                        r += 1
                        continue
                    res += len ( data ) - r
                    l += 1
                    v = 0
                    r = l
                lines.append ( 'Case #%d: %d\n' % ( i , res ) )
        return ''.join ( lines )
    def main ( _ ) :
        A ( )
    def next_arange ( n ) :
        res = [ ]
        for i in range ( n ) :
            res.append ( sc.__next__ ( ) )
        return res
    def pr ( x ) :
        return 1
    return A ( )
