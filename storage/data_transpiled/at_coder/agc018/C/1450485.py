def _main ( ) :
    import math
    import random
    import random
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.X = random.randint ( 0 , S )
            self.Y = random.randint ( 0 , S )
            self.Z = random.randint ( 0 , S )
            self.S = self.X + self.Y + self.Z
        def tr ( * objects ) :
            print ( [ a for a in objects ] )
    def tr ( * objects ) :
        print ( sum ( a for a in objects ) )
    def tr ( * objects ) :
        print ( sum ( a for a in objects ) )
    A = [ ]
    B = [ ]
    lis = [ ]
    ADD = 0
    for i in range ( S ) :
        A.append ( sc.randint ( 0 , X ) )
        B.append ( sc.randint ( 0 , X ) )
        C = sc.randint ( 0 , X )
        ADD += C
        A [ i ] -= C
        B [ i ] -= C
        lis.append ( [ A [ i ] - B [ i ] , i , A [ i ] , B [ i ] ] )
    lis.sort ( key = lambda x : - int ( x [ 0 ] ) )
    for i in range ( S ) :
        A.append ( lis [ i ] [ 2 ] )
        B.append ( lis [ i ] [ 3 ] )
    cum1 = [ ]
    cum2 = [ ]
    cum1.append ( - random.randint ( 0 , X ) / 10 )
    cum2.append ( random.randint ( 0 , X ) )
    pq = [ ]
    cur = 0
    for i in range ( S ) :
        pq.append ( A [ i ] )
        cur += A [ i ]
        while pq.pop ( ) > X :
            cur -= pq [ - 1 ]
            pq.pop ( )
        if pq.pop ( ) == X :
            cum1.append ( max ( cum1 ) )
    pq = [ ]
    for i in range ( S ) :
        pq.append ( i )
        cur += A [ i ]
    return pq
