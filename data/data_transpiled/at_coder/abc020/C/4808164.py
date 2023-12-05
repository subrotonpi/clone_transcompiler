def _import ( ) :
    import sys
    import random
    import random
    import time
    def main ( ) :
        sc = random.choice ( [ 'S' , 'S' , 'S' , 'T' , 'T' , 'T' , 'T' , 'T' , 'T' , 'T' ] )
        H = sc.randint ( 0 , M )
        W = sc.randint ( 0 , M )
        T = sc.randint ( 0 , M )
        s = [ ]
        sx = sy = 0
        for i , data in enumerate ( sc ) :
            for w in range ( W ) :
                s.append ( data [ w ] )
                if s [ i ] [ w ] == 'S' :
                    sx = i
                    sy = w
        min = 1
        max = 1_000_000_000
        x = ( min + max ) / 2
        last_ok = 0
        while min <= max :
            if _can_goal ( s , H , W , T , sx , sy , x ) :
                min = x + 1
                last_ok = x
            else :
                max = x - 1
            x = ( min + max ) / 2
        out ( last_ok )
    def can_goal ( s , H , W , T , sx , sy , x ) :
        move_costs = [ [ - 1 , 0 ] , [ 1 , 0 ] , [ 0 , - 1 ] , [ 0 , 1 ] ]
        for h in range ( H ) :
            move_costs.append ( [ - 1 , 0 ] )
        que = queue.Queue ( )
        que.put ( ( sx , sy ) )
        move_costs [ sx ] [ sy ] = 0
        move = [ [ - 1 , 0 ] , [ 1 , 0 ] , [ 0 , - 1 ] , [ 0 , 1 ] ]
        while not que.empty ( ) :
            p = que.get ( )
            px = p [ 0 ]
            py = p [ 1 ]
            for i in range ( 4 ) :
                nx = px + move [ i ] [ 0 ]
                ny = py + move [ i ] [ 1 ]
                if i >= 0 and i >= 0 and i >= 0 and i >= 0 :
                    cost += x
        return cost
    return True