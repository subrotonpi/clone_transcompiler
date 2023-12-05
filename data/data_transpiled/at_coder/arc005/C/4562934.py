def _import ( ) :
    import sys
    import copy
    import copy
    import copy
    import copy
    class Main ( object ) :
        def __init__ ( self , block = '#' ) :
            self.block = '.'
            self.load = '.'
            self.start = 's'
            self.goal = 'g'
        def main ( self , obj ) :
            try :
                copy.copy ( self , obj )
            except :
                pass
        def execute ( self ) :
            f = copy.copy ( self )
            hw = f.split ( )
            H = int ( hw [ 0 ] )
            W = int ( hw [ 1 ] )
            town = copy.deepcopy ( self.own )
            sx = sy = gx = gy = - 1
            for i in range ( H ) :
                s = f.readline ( )
                for j in range ( W ) :
                    town [ i ] [ j ] = s [ j ]
                    if town [ i ] [ j ] == 'start' :
                        sx = i
                        sy = j
                    elif town [ i ] [ j ] == 'goal' :
                        gx = i
                        gy = j
            assert ( sx >= 0 and sy >= 0 and gx >= 0 and gy >= 0 )
            start = ( sx , sy )
            goal = ( gx , gy )
            cost = copy.deepcopy ( cost )
            for i in range ( H ) :
                [ i ] = 100000
            print ( 'YES' if bfs ( start , goal , town , cost ) else 'NO' )
            f.close ( )
        def bfs ( start , goal , town , cost ) :
            h , w = len ( town ) , len ( town [ 0 ] )
            reachable = False
            deque = copy.deque ( start )
            cost [ start [ 0 ] ] [ start [ 1 ] ] = 0
            while not deque.empty ( ) :
                p = deque.popleft ( )
                if p == goal :
                    if cost [ start [ 0 ] ] [ goal [ 1 ] ] <= 2 :
                        reachable = True
            return reachable
    return
