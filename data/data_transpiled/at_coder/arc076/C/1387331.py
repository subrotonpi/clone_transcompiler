def _import ( ) :
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import chain
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
        def __call__ ( self , * args ) :
            self.id = self.id
            self.col = self.col_
    class State ( object ) :
        def __init__ ( self , id_ , col_ ) :
            self.id = id_
            self.col = col_
    R , C , N = chain ( [ ] , repeat ( [ ] ) )
    lis = [ ]
    for i in range ( N ) :
        f = True
        tmp = [ ]
        for t in range ( 2 ) :
            x , y = chain ( * repeat ( [ x , y ] ) )
            f &= x in chain or x in chain or y in chain or y in chain
            if f :
                tmp.append ( ( self.edge_id ( x , y ) , i ) )
        if f :
            lis.extend ( tmp )
    lis.sort ( key = lambda x : id ( x ) )
    stk = [ ]
    col = [ 0 ] * N
    for s in lis :
        if col [ s.col ] == 0 :
            stk.append ( s.col )
            col += [ s.col ]
        else :
            pre = stk.pop ( )
            if pre != s.col :
                print ( "NO" )
                return
            del col [ s.col ]
    print ( "YES" )
def edge_id ( x , y ) :
    if y == 0 :
        return x
    elif x == C :
        return C + y
    elif y == R :
        return C + C - x
    elif x == 0 :
        return C + R + y
    else :
        raise AssertionError ( "NO" )
