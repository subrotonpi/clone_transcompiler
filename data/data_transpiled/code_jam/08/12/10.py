def import import sys , StringIO , traceback , symbols , object , Dummy , sys ) :
    from itertools import repeat
    from itertools import chain , repeat
    from os import urandom
    import random
    class B ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.stdout = sys.stdout
        def __call__ ( self , * args ) :
            self.stdin.close ( )
            self.stdout.write ( "Case #%d: %s\n" % ( self.i + 1 , B ( ).solve ( ) ) )
    def solve ( ) :
        n , m = tee ( sys.stdin )
        a = [ ]
        q = [ 0 ] * m
        w = [ - 1 ] * m
        for i in range ( m ) :
            t = random.randint ( 1 , n )
            for j in range ( t ) :
                x = random.randint ( 0 , n - 1 )
                y = random.randint ( 0 , n )
                if y == 0 :
                    a [ i ] [ x ] = True
                    q [ i ] += 1
                else :
                    w [ i ] = x
    e = [ ]
    while True :
        ok = True
        for i in range ( m ) :
            if q [ i ] == 0 :
                if w [ i ] == - 1 :
                    return "IMPOSSIBLE"
                elif not e [ w [ i ] ] :
                    ok = False
                    e [ w [ i ] ] = True
                    for j in range ( m ) :
                        if a [ j ] [ w [ i ] ] :
                            q [ j ] -= 1
            if ok : break
        res = ""
        for i in range ( n ) :
            if i > 0 :
                res += " "
            res += 1 if e [ i ] else 0
        return res
