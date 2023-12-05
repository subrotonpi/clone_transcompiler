def main ( arg = None ) :
    import sys
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    class Main ( object ) :
        def __init__ ( self , fn ) :
            self.fn = fn
        def __call__ ( self , * args , ** kwargs ) :
            sc = sys.stdin
            N = sc.__next__ ( )
            sc.close ( )
            a = chain ( [ sc.next ( ) for i in range ( N ) ] , repeat ( N ) )
            ans = 0
            Alice = 0
            Bob = 0
            for i in range ( N ) :
                a.append ( sc.next ( ) )
            sc.close ( )
            a.sort ( key = lambda x : x [ 1 ] )
            for i in range ( N ) :
                if i % 2 == 0 :
                    Alice += a [ i ]
                else :
                    Bob += a [ i ]
            print ( Alice - Bob )
