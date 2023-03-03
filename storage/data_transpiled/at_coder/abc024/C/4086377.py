def import _area
class Main ( object ) :
    def __init__ ( self , n , d , k ) :
        sc = _area ( n , d , k )
        areas = [ Area ( sc.left , sc.right ) for i in range ( d ) ]
        lines = [ ]
        for s , t in _areas :
            now = s
            up = t > s
            for j in range ( d ) :
                if areas [ j ].left <= now and areas [ j ].right >= now :
                    if areas [ j ].left <= t and areas [ j ].right >= t :
                        lines.append ( "%d\n" % ( j + 1 ) )
                        break
                    if up :
                        if now < areas [ j ].right :
                            now = areas [ j ].right
                    else :
                        if now > areas [ j ].left :
                            now = areas [ j ].left
        sys.stdout.write ( "\n".join ( lines ) )
    class Area ( object ) :
        def __init__ ( self , left , right ) :
            self.left = left
            self.right = right
