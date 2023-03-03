def _import ( ) :
    import sys
    import random
    import random
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.__init__ ( )
        def f ( self , h , W ) :
            self._dx = [ 1 , - 1 , 0 , 0 ]
            self._dy = [ 0 , 0 , 1 , - 1 ]
            return self._dy
        def __call__ ( self , * args ) :
            sc = random.choice ( args )
            H , W , K = sc.randint ( 0 , H ) , sc.randint ( 0 , W ) , sc.randint ( 0 , W )
            A = [ [ i.decode ( 'utf-8' ) for i in sc.choice ( args ) ] for j in range ( H ) ]
            sh , sw = - 1 , - 1
            for i in range ( H ) :
                for j in range ( W ) :
                    if A [ i , j ] == 'S' :
                        sh , sw = i , j
            d = [ [ i.decode ( 'utf-8' ) for i in range ( W ) ] for j in range ( W ) ]
            d [ sh , sw ] = 0
            class P ( object ) :
                def __init__ ( self , h , w ) :
                    self.h , self.w = h , w
    que = [ P ( sh , sw ) ]
    while not que.empty ( ) :
        p = que.pop ( )
        for i in range ( 4 ) :
            np = P ( p.h + dy [ i ] , p.w + dx [ i ] )
            if not movable ( np.h , np.w , A ) :
                continue
            if d [ np.h ] [ np.w ] > d [ p.h ] [ p.w ] + 1 and d [ p.h ] [ p.w ] + 1 <= K :
                d [ np.h ] [ np.w ] = d [ p.h ] [ p.w ] + 1
                que.append ( np )
        ans = sum ( ans ) / 16
    return ans
