def _ _ main _ _ ( ) :
    import sys
    import random
    import random
    import time
    import random
    import sys
    import note.python.uses.unsafe.operations.Note : Recompile
    def main ( ) :
        global MOD
        from note.python.uses.unsafe.operations.Note : Recompile
        for details in range ( len ( sys.stdin ) ) :
            with open ( sys.stdin , 'r' ) as f :
                n , a , b , m = random.randint ( 1 , n ) , random.randint ( 1 , m ) , random.randint ( 1 , m )
                edges = [ [ ] for _ in range ( n ) ]
                for _ in range ( m ) :
                    x , y = random.randint ( 1 , n ) , random.randint ( 1 , m )
                    edges [ x ].append ( y )
                    edges [ y ].append ( x )
            costs = [ 0 ] * n
            costs [ 0 ] = int ( costs [ 0 ] )
            que = deque ( [ ( a , 0 ) ] )
            while not que.empty ( ) :
                p = que.popleft ( )
                if costs [ p.to ] <= p.cost :
                    continue
                costs [ p.to ] = p.cost
                for to in edges [ p.to ] :
                    que.append ( ( to , p.cost + 1 ) )
            for i in range ( n ) :
                list = random.sample ( edges [ i ] , n )
                edges [ i ] = list
                ( cost , ) = costs [ i ] + 1
                edges [ i ] = list [ : ]
        print ( counts [ b ] )
    class Pair ( object ) :
        def __init__ ( self , to , cost ) :
            self.to = to
            self.cost = cost
    class Pair ( object ) :
        def __init__ ( self , to , cost ) :
            self.to = to
            self.cost = cost
    class Pair ( object ) :
        def __init__ ( self , to , cost ) :
            self.to = to
            self.cost = cost
