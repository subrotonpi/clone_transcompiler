def _import ( ) :
    import sys
    import os
    import getopt
    import getopt
    import getopt
    import getopt
    import getopt
    class ProblemD :
        def __init__ ( self , IMP ) :
            self.IMP = 'IMPOSSIBLE'
        def __init__ ( self , pk , t , k ) :
            self.pk = pk
            self.type = type
            self.keys = [ k ]
        def chk_keys ( self , prv , nxt ) :
            self.id = prv [ 1 ]
            self.type = type
            self.keys = nxt [ 1 ]
        def debug ( self , * x ) :
            print ( "~" , * x )
            return
    if dp [ ptn - 1 ] == "~" :
        return
    def debug ( * x ) :
        f = open ( "/dev/null" , "w" )
        T = int ( f.read ( ) )
        for cn in range ( 1 , T + 1 ) :
            K = int ( f.read ( ) )
            N = int ( f.read ( ) )
            initial = [ 0 ] * 201
            for i in range ( N ) :
                initial [ f.read ( ) ] += 1
            c = [ ]
            for i in range ( N ) :
                t , k = getopt.getopt ( f.read ( ) , '' )
                keys = [ f.read ( ) ]
                for k in k :
                    keys.append ( f.read ( ) )
                c.append ( ( i + 1 , t , keys ) )
            f.write ( "Case #%d: %s\n" % ( cn , solve ( N , initial , c ) ) )
        f.flush ( )
    def solve ( n , initial , c ) :
        ptn = ( 1 << n )
        dp = [ '~' ] * ptn
        for i in range ( n ) :
            if dp [ i ] == '~' :
                continue
            num = initial [ : ]
            for k in c :
                if ( i & ( 1 << j ) ) >= 1 :
                    num [ k ] += 1
        return num
    return debug
