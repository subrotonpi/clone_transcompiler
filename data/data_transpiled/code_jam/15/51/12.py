def _import ( ) :
    import sys
    import random
    import random
    class A ( ) :
        def __init__ ( self , id , s , mins , maxs ) :
            self.id = id
            self.s = s
            self.mins = mins
            self.maxs = maxs
        def __init__ ( self , id , s , mins , maxs ) :
            self.id = id
            self.s = s
            self.mins = mins
            self.maxs = maxs
    def solve ( * arg ) :
        def f ( * args ) :
            with open ( "A-large.in" , "r" ) as f :
                while f.readline ( ).strip ( ) or not f.read ( ).strip ( ) :
                    try :
                        s = f.readline ( ).split ( )
                    except ValueError :
                        pass
                return int ( s [ 0 ] )
        def f ( * args ) :
            return f.readline ( ).strip ( )
    def f ( * args ) :
        with open ( "A-large.out" , "w" ) as f :
            f.write ( "%s\n" % args )
    def f ( * args ) :
        for test in range ( 1 , test_no + 1 ) :
            n = random.randint ( 1 , n )
            d = random.randint ( 1 , n )
            ch = [ ]
            s = [ ]
            p = [ ]
            s.append ( f.readline ( ) )
            p.append ( P ( 0 , s [ 0 ] , s [ 0 ] , s [ 0 ] ) )
            as = f.readline ( ).strip ( )
            cs = f.readline ( ).strip ( )
            rs = f.readline ( ).strip ( )
            m = [ ]
            am = f.readline ( ).strip ( )
            cm = f.readline ( ).strip ( )
            rm = f.readline ( ).strip ( )
            for i in range ( 1 , n ) :
                s.append ( ( s [ i ] * as + cs ) % rs )
                m.append ( ( m [ i ] * am + cm ) % rm )
                par = m [ i ] % i
                p.append ( P ( i