def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self._win = sys._getframe ( 1 )
    L = sys.stdin.read ( 1 )
    R = sys.stdin.read ( 1 )
    a = [ ]
    b = [ ]
    lmap = { }
    rmap = { }
    for i in range ( L ) :
        a.append ( sys.stdin.read ( 1 ) )
    for i in range ( R ) :
        b.append ( sys.stdin.read ( 1 ) )
    a.sort ( )
    b.sort ( )
    for i in range ( L ) :
        if a.has_key ( i ) :
            count = lmap [ a [ i ] ]
            count += 1
            lmap [ a [ i ] ] = count
        else :
            lmap [ a [ i ] ] = 1
    for i in range ( R ) :
        if b.has_key ( i ) :
            count = rmap [ b [ i ] ]
            count += 1
            rmap [ b [ i ] ] = count
        else :
            rmap [ b [ i ] ] = 1
    a = [ num for num in a if num not in lmap ]
    count = 0
    for key in a :
        lcount = lmap [ key ]
        rcount = 0
        if rmap.has_key ( key ) :
            rcount = rmap [ key ]
        if not lcount or not rcount :
            continue
        min = min ( lcount , rcount )
        count += min
    print ( count )
