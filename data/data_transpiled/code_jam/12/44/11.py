def import _codejamd
def _codejamd ( ) :
    r , c = 0 , 0
    dx , dy = [ 0 , 0 , - 1 ] , [ 1 , - 1 , 0 ]
    def _converge ( x , y ) :
        if done : return x in seen
        seen = set ( )
        for i in range ( len ( states ) ) :
            if states [ i ] == '#' :
                r , c = states [ i ] , states [ i + 1 ]
            next ( )
        return x in seen
    def _converge ( x , y ) :
        if done : return x in seen
    for dir in _codejamd :
        for i in range ( len ( states ) ) :
            nx , ny = states [ i ] - dx [ dir ] , states [ i + 1 ] - dy [ dir ]
            if board [ i ] [ ny ] == '#' :
                nx , ny = states [ i ] , states [ i + 1 ]
            next ( )
    _converge ( )
    return _converge ( )
def _ok ( x , y ) :
    return x in seen
done = _done
for dir in _codejamd :
    for i in range ( len ( states ) ) :
        if states [ i ] == '#' :
            r , c = states [ i ] , states [ i + 1 ]
        else :
            r , c = states [ i ] , states [ i + 1 ]
        board = [ [ x ].strip ( ).split ( ' ' ) [ 0 ] for x in range ( r ) ]
        print ( 'Case #%d:' % ( t ) )
for d in range ( 10 ) :
    tx = - 1
    ty = - 1
    for j in range ( r ) :
        for k in range ( c ) :
            if board [ j ] == '0' + d :
                tx = j
                ty = k
        if tx == - 1 : break
        possible = [ [ ] ]
        q = _converge ( )
        q.append ( [ tx , ty ] )
        possible.append ( True )
        count = 1
        while not q.empty ( ) :
            cx , cy