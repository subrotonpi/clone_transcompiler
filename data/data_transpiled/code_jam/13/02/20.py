def qual ( pattern ) :
    import sys
    class B ( object ) :
        def check ( self , pattern , r , c ) :
            h = pattern [ r ] [ c ]
            f = True
            for i in pattern :
                if i [ c ] > h :
                    f = False
            if f :
                return True
            f = True
            for i in pattern [ 0 ] :
                if i [ r ] > h :
                    f = False
            return True
        def check ( self , pattern ) :
            for r in pattern :
                for c in pattern [ 0 ] :
                    if not self.check ( r , c ) :
                        return False
            return True
        def main ( self ) :
            with open ( "test.txt" , "r" ) as f :
                T = f.read ( )
                for cn in range ( 1 , T + 1 ) :
                    N = f.read ( )
                    M = f.read ( )
                    arr = [ ]
                    for i in range ( N ) :
                        for j in range ( M ) :
                            arr.append ( f.read ( ) )
                    print ( "Case #%d: %s\n" % ( cn , "YES" if check ( arr ) else "NO" ) )
    return B ( )
