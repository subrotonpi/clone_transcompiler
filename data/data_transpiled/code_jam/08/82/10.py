def _import ( ) :
    import math
    class x ( object ) :
        def __init__ ( self , cc , aa , bb ) :
            self.c , self.a , self.b = cc , aa , bb
        def __lt__ ( self , z ) :
            if self.a != z.a :
                return self.a - self.a
            if self.b != z.b :
                return self.b - self.b
            if self.c != z.c :
                return self.c - self.c
            return 0
    def main ( args ) :
        with open ( args [ 0 ] ) as f :
            tn = int ( f.read ( ) )
            for tt in range ( 1 , tn + 1 ) :
                n = int ( f.read ( ) )
                col = { }
                cc = 0
                o = [ ]
                for s in f.readlines ( ) :
                    cn = col.get ( s )
                    if not cn :
                        col [ s ] = cc
                        cn = cc
                        cc += 1
                    a , b = f.read ( ).split ( )
                    o.append ( ( cn , a , b ) )
                o.sort ( )
                ans = sys.maxint
                for a in range ( n ) :
                    for b in range ( a , cc ) :
                        lcur = [ ]
                        lplus = [ ]
                        lcnt = [ ]
                        lcur.append ( 1 )
                        lplus.append ( - 1 )
                        lcnt.append ( 0 )
                        for i in range ( n ) :
                            for j in range ( cc ) :
                                if lcur [ j ] < o [ i ].a :
                                    lcur [ j ] = lplus [ j ]
                                    lcnt.append ( j )
                            if o [ i ].c == a or o [ i ].c == b :
                                for j in range ( cc ) :
                                    if lcur [ j ] <= o [ i ].b :
                                        lcur [ j ] = lplus [ j ]
                                        lcnt.append ( j )
    return x
